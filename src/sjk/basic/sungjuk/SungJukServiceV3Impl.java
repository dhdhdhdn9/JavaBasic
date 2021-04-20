package sjk.basic.sungjuk;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SungJukServiceV3Impl implements SungJukServiceV3 {

//    멤버변수 선언
//    입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<SungJukVO> sjdata = new ArrayList<>();
    SungJukVO sj = null;
//    성적 데이터를 저장해둘 파일경로 지정
    String fpath = "c:/Java/SungJuk.data";
    String fpath2 = "c:/Java/SungJuk.csv";
    String fpath3 = "c:/Java/SungJuk.json";

//    아래는 CSV 직렬화를 위한 문자열 포맷
    String csvfmt = "%s, %d, %d, %d, %d, %.1f, %s \n";

//    아래는 json 직렬화를 위한 문자열 포맷
    String jsonfmt = "{\"name\": \"%s\", \"kor\": %d, \"eng\": %d, \"mat\": %d, " +
                        "\"tot\": %d, \"avg\": %.1f, \"grd\": \"%s\"}, \n";

    // 싱글톤 패턴 시작
    private static SungJukServiceV3 sjsrv = null;

    private SungJukServiceV3Impl() {
//        프로그램 시작 시 initSungJuk 메서드 호출
        initSungJuk();
    }

    public static SungJukServiceV3 getInstance() {
        if(sjsrv == null) sjsrv = new SungJukServiceV3Impl();
        return sjsrv;
    }
    // 싱글톤 패턴 끝


    @Override
    public void displayMenu() {
        String displaymenu =
                "==================== \n" +
                "   성적 프로그램 v7 \n" +
                "==================== \n" +
                "1. 성적 데이터 입력 \n" +
                "2. 성적 데이터 조회 \n" +
                "3. 성적 데이터 상세조회 \n" +
                "4. 성적 데이터 수정 \n" +
                "5. 성적 데이터 삭제 \n" +
                "0. 프로그램 종료 \n" +
                "==================== \n" +
                "작업 선택 : " ;

        System.out.print(displaymenu);
    }


    @Override
    public void newSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어 : ");
            int kor = sc.nextInt();
            System.out.print("영어 : ");
            int eng = sc.nextInt();
            System.out.print("수학 : ");
            int mat = sc.nextInt();

            SungJukVO sj = new SungJukVO(name, kor, eng, mat);
//        입력받은 성적데이터를 객체화함

            computeSungJuk(sj);
//        입력된 성적 데이터를 자동으로 (보이지 않아도) 처리해줌

            sjdata.add(sj);
//        처리된 성적데이터를 동적배열에 저장한다는 의미

//            방금 입력된 성적데이터와 기존에 입력된 성적 데이터 모두를
//            sungjuk.data 파일에 직렬화해서 저장함
//            saveSungJuk();

        } catch (Exception ex) {
            System.out.println("잘못 입력하셨습니다.");
            return;     // 오류 발생 시 실행을 중단하고 메인으로 복귀
        }

    }


//    저장된 성적데이터들 중에서
//    번호, 이름, 국어, 영어, 수학만 뽑아서
//    목록list형태로 출력

    @Override
    public void showSungJuk() {
        String fmt = "번호: %d, 이름: %s, 국어: %d, 영어: %d, 수학: %d \n";
        int pos = 0;                // 배열 인덱스
                                    // 성적을 입력하면 0에서부터 차례대로 번호가 누적(배열)되게 함.
        
        for(SungJukVO sj : sjdata) {
            System.out.printf(fmt, pos, sj.getName(),
                    sj.getKor(), sj.getEng(), sj.getMat() );
            ++pos;      // 숫자가 0에서부터 더해진다는 의미
        }

    }


    @Override
    public void computeSungJuk(SungJukVO sj) {
        sj.setTot( sj.getKor() + sj.getEng() + sj.getMat() );
        sj.setAvg( (double)sj.getTot() / 3 );

        switch((int)sj.getAvg() / 10){
            case 10: case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가'); break;
        }
    }


    @Override
    public void showOneSungJuk() {
        String fmt = "번호: %d, 이름: %s, 국어: %d, 영어: %d, 수학: %d \n"
                + "총점: %d, 평균: %.1f, 학점: %c \n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회 학생 번호: ");
        int pos = sc.nextInt();

        try {
            SungJukVO sj = sjdata.get(pos);

            System.out.printf(fmt, pos,
                    sj.getName(), sj.getKor(), sj.getEng(),
                    sj.getMat(), sj.getTot(), sj.getAvg(), sj.getGrd());
        } catch (Exception ex) {
            System.out.println("데이터가 존재하지 않습니다.");
            }
    }


    @Override
    public void modifySungJuk() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 학생 이름 :");
        String mname = sc.next();
//            for 구문
//            오른쪽 값을 왼쪽 값에 넣거나
//            오른쪽 값을 왼쪽 값에서 꺼내거나
//            움직이는 것은 오른쪽값. 즉, 왼쪽 값은 일종의 주머니임.
        for(SungJukVO sj : sjdata) {
            if(sj.getName().equals(mname)) {
                System.out.print("수정할 과목 : ");
                String msub = sc.next();
                System.out.println("수정 점수 : ");
                int mscore = sc.nextInt();

                if(msub.equals("국어"))
                {   sj.setKor(mscore);
                    break;
                }else if(msub.equals("수학")) {
                    sj.setMat(mscore);
                    break;
                } else if(msub.equals("영어")) {
                    sj.setEng(mscore);
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                    break;
                }
            }
        }
    }


    @Override
    public void removeSungJuk() {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 학생의 이름 : ");
        String dname = sc.next();

        sjdata.removeIf(sj -> sj.getName().equals(dname));

    }



//    기존에 입력된 성적 데이터를 역직렬화로 파일에서 읽은 후
//    메모리에 적재하는 역할
    @Override
    public void initSungJuk() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois =null;

        try{
            fis = new FileInputStream(fpath);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            sjdata = (ArrayList) ois.readObject();

        } catch (Exception ex) {
//            ex.printStackTrace();
            System.out.println("파일이 없거나 시스템에 오류가 발생했습니다.");
        } finally {
            if (ois != null)
                try { ois.close(); } catch (IOException e) { }
            if (bis != null)
                try { bis.close(); } catch (IOException e) { }
            if (fis != null)
                try { fis.close(); } catch (IOException e) { }
        }

    }


//    메모리 내에 저장된 모든 성적 데이터를 직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk() {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos =null;

        try{
            fos = new FileOutputStream(fpath);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            oos.writeObject(sjdata);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("파일이 없거나 시스템에 오류가 발생했습니다.");
        } finally {
            if (oos != null)
                try { oos.close(); } catch (IOException e) { }
            if (bos != null)
                try { bos.close(); } catch (IOException e) { }
            if (fos != null)
                try { fos.close(); } catch (IOException e) { }
        }
    }


//    기존에 입력된 성적 데이터를 CSV역직렬화로
//    파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk2() {
//        try-with-resources라는 구문을 지원함

        try (FileReader fr = new FileReader(fpath3);
                BufferedReader br = new BufferedReader(fr);
        ) {
//            json 파일의 모든 내용을 한번에 읽어 한줄에 lines 변수에 저장
            String lines = br.lines().collect(Collectors.joining());
//            System.out.println(lines);

//            텍스트 파일에 저장된 반정형 데이터를
//            JSON 분석기(parser)를 이용하여 메모리에 객체 형태로 저장
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(lines);

//            메모리에 저장된 객체에서 sj라는 이름의 배열객체를 가져옴
            JSONArray jsons = (JSONArray) obj.get("sj");

//            반복문을 이용해서 배열객체의 각 요소를 하나씩 꺼내
//            성적객체에 담고 ArrayList에 저장함
            for(int i = 0; i< jsons.size(); ++i) {
                JSONObject json = (JSONObject) jsons.get(i);
                SungJukVO sj = new SungJukVO(
                        (String)json.get("name"),
                        ( (Long)json.get("kor") ).intValue(),
                        ( (Long)json.get("eng") ).intValue(),
                        ( (Long)json.get("mat") ).intValue() );
                computeSungJuk(sj);
                sjdata.add(sj);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


//    메모리 내에 저장된 모든 성적 데이터를
//    CSV직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk2() {

//        JDK7부터는 자원을 쉽게 해제할 수 있도록
//        try-with-resources라는 구문을 지원함
        try (FileWriter fw = new FileWriter(fpath2);
             BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String result = "";
          for (SungJukVO sj : sjdata) {
//            여기서부터
              result = String.format(csvfmt, sj.getName(),
                      sj.getKor(), sj.getEng(), sj.getMat(),
                      sj.getTot(), sj.getAvg(), sj.getGrd());
//              형태 예시: 혜교, 54, 76, 98, 265, 99.3, 수
//              위의 형태로 파일을 저장하는 코드 작성
              bw.write(result);
//              여기까지가 CSV 직렬화
          }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }



    @Override
    public void initSungJuk3() {
//        try-with-resources라는 구문을 지원함

        try (FileReader fr = new FileReader(fpath3);
             BufferedReader br = new BufferedReader(fr);
        ) {
            sjdata = new ArrayList<>();
            while (br.ready()) {
//                json 파일에서 문자열 한줄을 읽어서
//                쉼표단위로 분리한 후 배열로 생성
                String line = br.readLine();
                String data[] = line.split(",");

//                생성된 배열을 이용해서 성적객체를 만들고
//                총점, 평균, 학점을 구한 다음 (옵션)
//                ArrayList에 저장함
                SungJukVO sj = new SungJukVO(
                        data[0], Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]) );
                computeSungJuk(sj);

                sjdata.add(sj);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


//        메모리 내에 저장된 모든 성적 데이터를
//        json직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk3() {
        try (FileWriter fw = new FileWriter(fpath3);
             BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String result = "";
            bw.write( "{ \"sj\": [ ");    // json 배열 시작
            for (SungJukVO sj : sjdata) {
                result = String.format(jsonfmt, sj.getName(),
                        sj.getKor(), sj.getEng(), sj.getMat(),
                        sj.getTot(), sj.getAvg(), sj.getGrd());
//              {name: 혜교, kor: 54, eng: 76, mat: 98, tot: 265, avg: 99.3, grd: 수},
//              위의 형태로 파일을 저장하는 코드 작성
                bw.write(result);
            }
            bw.write(" ] }");   // json 배열 끝
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}

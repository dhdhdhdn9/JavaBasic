package sjk.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {
//        이름, 국어, 영어, 수학을 키보드로 입력 받아
//        sungjuk.dat에 저장하는 코드를 작성하세요
//        단, 파일에 저장하는 문자열 형식은 다음과 같이 합니다.

//        입력 데이터: 혜교 97 98 95
//        파일 저장 형식 : 헤교, 97, 98, 95

        String name;
        int kor, eng, mat;

        Scanner sc = new Scanner(System.in);

//        System.out.print("이름 : ");
//        name = sc.next();
//        System.out.print("국어 : ");
//        kor = sc.nextInt();
//        System.out.print("영어 : ");
//        eng = sc.nextInt();
//        System.out.print("수학 : ");
//        mat = sc.nextInt();

        System.out.println("성적 데이터 입력(형식: 이름 국어 영어 수학)");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();


        String fpath = "c:Java/sungjuk.data";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(fpath, true);
//            파일에 데이터를 누적 옵션 설정
            bw = new BufferedWriter(fw);

            String fmt = "%s, %d, %d, %d\n";
            String data =
                    String.format(fmt, name, kor, eng, mat);

            bw.write(data);

            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println("파일 쓰기 오류");
            e.printStackTrace();
        }

//        저장한 성적데이터를 화면에 출력

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);

            while (br.ready()) {
                System.out.println(br.readLine());
            }

            br.close();
            fr.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }
}

package sjk.basic.lab;

import java.awt.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeesService {

    //    멤버변수 선언
    List<EmployeeV0> emdata = new ArrayList<>();
    EmployeeV0 em = null;

    static  final String[] JOBID = {
            "FI_MGR", "AC_MGR ", "SA_MAN", "IT_PROG","ST_CLERK"};
    static int MINSAL = 2000;
    static int MAXSAL = 40000;
    static int MAXDEPT = 270;
    static int MAXMGRID = 206;



    //    싱글톤 블럭 시작
    private static EmployeesService emsrv = null;
    private EmployeeServiceImpl() { }

    public static EmployeesService getInstance() {
        if (emsrv == null) emsrv = new EmployeeServiceImpl();
        return emsrv;
    }


    //    화면에 프로그램 메뉴를 출력
    @Override
    public void displayEMenu() {
        String displayEmenu =
                "\n" +
                        "==================== \n" +
                        " 사원 관리 프로그램 v1 \n" +
                        "==================== \n" +
                        "1. 사원 정보 입력 \n" +
                        "2. 사원 정보 조회 \n" +
                        "3. 사원 정보 상세조회 \n" +
                        "3. 사원 정보 수정 \n" +
                        "3. 사원 정보 삭제 \n" +
                        "0. 프로그램 종료 \n" +
                        "==================== \n" +
                        " 작업 선택 : " ;


        System.out.print(displayEmenu);

    }


    //    새로운 사원 정보를 입력받음
    @Override
    public void newEmplInfo() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름 : ");
            String fname = sc.next();
            System.out.print("성 : ");
            String lname = sc.next();
            System.out.print("이메일 : ");
            String email = sc.next();
            System.out.print("전화번호 : ");
            String phone = sc.next();

//        입사일은 오늘날짜로
            LocalDate hdate = LocalDate.now();

            EmployeeV0 em = new EmployeeV0(fname, lname, email, phone, hdate);

//            사원 추가정보를 생성해서 사원정보로 저장
            makeExtInfo(em);

            emdata.add(em);

        } catch (Exception ex) {
            System.out.println("잘못 입력하셨습니다.");
        }


    }


    @Override
    public void makeExtInfo(EmployeeV0 em) {
//        직책, 급여, 수당, 상사번호, 부서번호

        Random rnd = new Random();
        //직업출력
        int key = rnd.nextInt(JOBID.length);
        String jobid = JOBID[key];
        //급여출력
        int sal = rnd.nextInt(MAXSAL) + MINSAL;
        int mgrid = rnd.nextInt(MAXMGRID) + 100;
        int deptid = (rnd.nextInt(MAXDEPT) % 100) * 10;


        DecimalFormat df = new DecimalFormat("#.##");
        double comm = Double.parseDouble(
                df.format( rnd.nextDouble() / 2 ));

        //System.out.println(jobid);
        //System.out.println(sal);
        // System.out.println(mgrid);
        // System.out.println(deptid);
        // System.out.println(comm);

        em.setJobid(jobid);
        em.setSal(sal);
        em.setComm(comm);
        em.setMgrid(mgrid + ""); //문자라서 이렇게""
        em.setDetpid(deptid + ""); //문자라서 이렇게 ""

    }


    //    사원 기본 정보(사번, 이름, 성, 이메일, 전화번호, 입사일)등을
//    리스트 형태로 출력
    @Override
    public void showEmpl() {
        String fmt = "사번: %d, 이름: %s, 성: %s, " +
                "이메일: %s, 전화번호: %s, 입사일: %s \n";
        int empno = 0;

        for(EmployeeV0 em : emdata) {
            System.out.printf( fmt, empno, em.getFname(),
                    em.getLname(), em.getEmail(), em.getPhone(),
                    em.getHdate() );
            ++empno;
        }


    }

    @Override
    public void showOneEmpl() {
        String fmt = "사번: %d, 이름: %s, 성: %s, 이메일: %s, " +
                "전화번호: %s, 입사일: %s, 직책: %s, 급여: %d만, " +
                "수당: %.1f, 상사번호: %s, 부서번호: %s";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회 사원 번호 : ");
        int empno = sc.nextInt();


        try {
            EmployeeV0 em = emdata.get(empno);
            System.out.printf( fmt, empno, em.getFname(),
                    em.getLname(), em.getEmail(), em.getPhone(),
                    em.getHdate(), em.getJobid(), em.getSal(),
                    em.getComm(), em.getMgrid(), em.getDetpid(), "\n");
        } catch (Exception ex) {

            System.out.println("데이터가 존재하지 않습니다.");
        }

    }

    @Override
    public void modifyEmpl() { }

    @Override
    public void removeEmpl() { }


}
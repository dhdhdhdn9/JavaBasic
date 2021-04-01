package sjk.basic.lab;

//    CRUD 코드 작성
//    사원 정보
//    사번, 이름, 성, 이메일, 전화번호, 입사일, 직책, 급여, 수당, 상사번호, 부서번호
//    empno, fname, lname, email. phone, hdate, jobid, sal, comm, mgrid, detpid
//    기본 정보: 사번, 이름, 성, 이메일, 전화번호, 입사일(오늘날짜로)
//    추가 정보: 난수를 이용해 자동생성하도록 함 (makeExtInfo)

public interface EmployeesService {

        void displayEMenu();
        void newEmplInfo();
        void makeExtInfo(EmployeeV0 emp);
        void showEmpl();
        void showOneEmpl();
        void modifyEmpl();
        void removeEmpl();

}

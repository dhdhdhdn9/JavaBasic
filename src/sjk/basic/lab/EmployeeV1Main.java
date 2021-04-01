package sjk.basic.lab;

import sjk.basic.lab.EmployeesService;
import sjk.basic.lab.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeV1Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeesService emsrv = EmployeeServiceImpl.getInstance();

        String menu = " ";
        while (true) {
            emsrv.displayEMenu();
            menu = sc.next();

            switch (menu) {
                case "1": emsrv.newEmplInfo(); break;
                case "2": emsrv.showEmpl(); break;
                case "3": emsrv.showOneEmpl(); break;
                case "4": emsrv.modifyEmpl(); break;
                case "5": emsrv.removeEmpl(); break;
                case "0": System.exit(0); break;    // 종료
                default:
                    System.out.println("잘못 입력하셨습니다.");
            } // switch


        } // while
    }
}

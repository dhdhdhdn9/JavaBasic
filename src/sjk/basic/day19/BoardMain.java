package sjk.basic.day19;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {

        BoardService bsrv = BoardServiceImpl.getInstance();

        String menu = " ";
        Scanner sc = new Scanner(System.in);

        while (true) {
            bsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": bsrv.newBoard(); break;
                case "2": bsrv.readBoard(); break;
                case "3": bsrv.readOneBoard(); break;
                case "4": bsrv.modifyBoard(); break;
                case "5": bsrv.removeBoard(); break;
                case "0": System.exit(0); break;    // 종료
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
        }


    }
}

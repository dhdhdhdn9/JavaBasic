package sjk.basic.day10;

import sjk.basic.sungjuk.SungJukService;
import sjk.basic.sungjuk.SungJukServiceImpl;
import sjk.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {

    public static void main(String[] args) {
        // SungJukService sjsrv = new SungJukServiceImpl();
        // 싱글톤
        SungJukService sjsrv = SungJukServiceImpl.getInstance();


        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);

    }
}



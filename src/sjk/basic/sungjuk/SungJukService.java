package sjk.basic.sungjuk;


// 성적 서비스 V1
// 입력, 처리, 출력 가눙 구현
// 프로긂 메뉴 출력 기능 추가
public interface SungJukService {
    void displayMenu();
    SungJukVO readSungJuk();
    void computeSungJuk(SungJukVO sj);
    void printSungJuk(SungJukVO sj);

}

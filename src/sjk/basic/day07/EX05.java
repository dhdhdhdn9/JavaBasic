package sjk.basic.day07;

public class EX05 {
    public static void main(String[] args) {



        Account ac = new Account("1120", 20000, 4.5,
                "2014-08-15 14:34:29");

        Student2 st2 = new Student2("학번", "이름", "주소",
                "생년월일", "전공학과", "지도교수");

        Professor pr = new Professor("이름", "전공분야", "조유기술");

        Major mj = new Major("학과명", "사무실 위치", "사무실 번호");




    }


    // Q73
//    회전속도 1,2,3 을 나타내는 상수 SLOW, MEDIUM, FAST
//    선풍기의 속도를 나타내는 speed 변수, 초기값은 SLOW
//    동작상태를 표시하는 on 변수, 초기값은 false
//    선풍기 팬 크기를 나타내는 radius 변수, 초기값은 5.0
//    선풍기 색상을 표시하는 color 변수, 초기값은 blue
    static class Fan {
        private int spd;
        private String on;
        private String rad;
        private String colr;

        public Fan () {}



        public Fan (int spd, String on, String rad, String colr) {
            this.spd = spd;
            this.on = on;
            this.rad = rad;
            this.colr = colr;

        }

    }



    // Q74
//    계좌번호를 위한 aid 변수, 초기값은 0
//    통장잔액을 나타내는 balance 변수, 초기값은 0
//    연간 이자율을 나타내는 interestRate 변수, 초기값은 0
//    통장개설 날짜를 위한 dateCreated 변수
    static class Account {
        private String aid;
        private int bal;
        private double inter;
        private String datcr;

        public Account() { }

        public Account(String aid, int bal,
                       double inter, String datecr) {
            this.aid = aid;
            this.bal = bal;
            this.inter = inter;
            this.datcr = datecr;
        }
    }

    // Q76

//  학생에는 학번, 이름, 주소, 생년월일 등의 정보가 있다.
//  학생은 반드시 하나의 전공학과에 속해야 하며, 한 분의 지도교수 밑에서 전공지도를 받는다.

        static class Student2 {
            private String hakno;
            private String name;
            private String addr;
            private String birth;
            private String major;
            private String prof;

        public Student2 () {}

        public Student2 (String hakno, String name, String addr,
                         String birth, String major, String prof) {
            this.hakno = hakno;
            this.name = name;
            this.addr = addr;
            this.birth = birth;
            this.major = major;
            this.prof = prof;
            }
        }

//  교내에 개설된 과목에는 과목번호, 과목명, 과목개요 등이 있다.
//  그리고 각 과목은 여러 개의 섹션으로 나누어 관리한다.
        static class Subject {
            private String subno;
            private String subname;
            private String subintr;

            public Subject () {}

            public Subject (String subno, String subname, String subintr) {
                this.subno = subno;
                this.subname = subname;
                this.subintr = subintr;
            }
        }

//  교수는 교수 이름, 전공분야, 보유기술 등의 정보를 가진다.
//  특히, 한 명의 교수는 하나 이상의 보유기술을 가질 수 있다.
//  또한, 교수는 하나 이상의 과목도 강의할 수 있다.
        static class Professor {
            private String name;
            private String major;
            private String skill;

            public Professor () {}

            public Professor (String name, String major, String skill) {
                this.name = name;
                this.major = major;
                this.skill = skill;
            }
        }

//  전공학과는 학과명, 학과사무실의 위치, 학과사무실의 전화번호 등의 정보가 있다.
//  그리고 각 학과의 교수들 중에서 한 명의 교수에게 학과장을 임명한다

    static class Major {
        private String name;
        private String office;
        private String phone;

        public Major () {}

        public Major (String name, String office, String phone) {
            this.name = name;
            this.office = office;
            this.phone = phone;
        }
    }






    }



    // Q74

    // Q76





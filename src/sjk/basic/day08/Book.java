package sjk.basic.day08;

import sjk.basic.day07.SungJukV4b;

public class Book {
    public static void main(String[] args) {

        Bookinfo bi = new Bookinfo("누구나 알기 쉬운 자바: 입문편", "카와바 타케시",
                                    "하진일", "혜지원","2014년 8월",
                                    25000, 10);
        bi.printBookinfo(bi);

    }

    static class Bookinfo {
        private String name;
        private String author;
        private String trans;
        private String publish;
        private String date;
        private int price;
        private int pay;
        private double sale;
        private int savings;


        public Bookinfo(String name, String author, String trans, String publish,
                        String date, int price, double sale) {
            this.name = name;
            this.author = author;
            this.trans = trans;
            this.publish = publish;
            this.date = date;
            this.price = price;
            this.sale = sale;
        }


        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTrans(String trans) {
            this.trans = trans;
        }

        public void setPublish(String publish) {
            this.publish = publish;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setSale(double sale) {
            this.sale = sale;
        }


        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public String getTrans() {
            return trans;
        }

        public String getPublish() {
            return publish;
        }

        public String getDate() {
            return date;
        }

        public int getPrice() {
            return price;
        }

        public double getSale() {
            return sale;
        }

        public void printBookinfo(Bookinfo bi) {

            System.out.println("도서명: " + bi.name);
            System.out.println("저자: " + bi.author);
            System.out.println("역자: " + bi.trans);
            System.out.println("출판사: " + bi.publish);
            System.out.println("출간일: " + bi.date);
            System.out.println("정가: " + bi.price + "원");
            System.out.println
                    ("판매가: " + (int) (bi.price * ((100 - bi.sale) / 100)) + "원");
            System.out.println
                    ("할인율: " + bi.sale + "%");
            System.out.println
                    ("적립금: " + (int) ((bi.price * ((100 - bi.sale) / 100)) * (0.1)) + "원");
        }
    }
}   //main

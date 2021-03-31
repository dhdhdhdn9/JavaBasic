package sjk.basic.day11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class JavaCalender {
    public static void main(String[] args) {
        // 자바로 시간, 날짜 다루기
        // JDK1에서 제공한 Date 클래스를 이용해서
        // 시간, 날짜에 대한 처리르 할 수 있지만
        // JDK1.1에 나온 Calendar 클래스를 이용해서
        // 시간, 날짜에 대한 처리를 수행하는 것을 권장한다.
        // 그러나 이마저도 날짜 처리 시 윤초을 고려하지 않거나 (정확도 낮음)
        // 월을 표시할 때 1이 아닌 0부터 표시하는 문제가 존재한다.
        // 따라서, 더 나은 성능의 Joda-Time이라는 라이브러리가
        // JDK8에 추가되었다.

        Date d = new Date();
        System.out.println(d.toString());

        String fmt = "%d년 %d월 %d일 %d시 %d분 %d초 \n";
        System.out.printf(fmt, d.getYear() + 1900, d.getMonth() + 1,
                        d.getDate(), d.getHours(), d.getMinutes(),
                        d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        System.out.printf(fmt, c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1,
                c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.HOUR),
                c.get(Calendar.MINUTE), c.get(Calendar.SECOND));

        System.out.println(
                "오늘은 " + c.get(Calendar.DAY_OF_WEEK) + "요일입니다.");

        System.out.println(
                "오늘은 2021년 중 " + c.get(Calendar.DAY_OF_YEAR) + "일 째 날입니다.");

        // 오늘 기준 5일 후 날짜는? (add 메서드 사용)
        c.add(Calendar.DATE, 5);
        System.out.println(c.getTime());

        // 오늘부터 100일은 언제?
        c = Calendar.getInstance();
        c.add( Calendar.DATE, 100);
        System.out.println(c.getTime());

        //오늘부터 11인 전은 언제?
        c = Calendar.getInstance();
        c.add( Calendar.DATE, -11 - 4);
        System.out.println(c.getTime());

        // 오늘 아내가 아이를 가졌어요, 10개월 후는 언제?
        c = Calendar.getInstance();
        c.add( Calendar.MONTH, 10);
        System.out.println(c.getTime());

        // simpleDateFormat
        // 날짜, 시간을 원하는 형태대로 다양하게 출력
        fmt = "yyyy-MM-dd HH:mm:SS";
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        System.out.println(sdf.format(d));

        c = Calendar.getInstance();
        System.out.println( sdf.format( c.getTime() ) );

        // JDK8에서 추가된 jodatime 사용하기
        // java.time 패키지
        // 날짜를 표현할 때는 LocalDate
        // 시간을 표현할 때는 LocalTime
        // 둘 다 표현할 때는 LocalDateTime

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println(time);
        System.out.println(date);


    }
}

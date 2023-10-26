package Day17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EXTime_9 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("오늘의 날짜 : "+date);
        System.out.println("현재의 시간 : "+time);
        System.out.println("현재의 날짜와 시간 : "+dt);

        System.out.println("오늘부터 100일 기념일 : "+date.plusDays(100));
        System.out.println("오늘부터 10주 후의 날짜 : "+date.plusWeeks(10));
    }
}

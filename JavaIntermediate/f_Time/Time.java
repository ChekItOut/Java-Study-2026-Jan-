package f_Time;

import java.time.LocalDateTime;

public class Time {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        LocalDateTime ofDate = LocalDateTime.of(2023, 11, 21, 12, 10, 22);
        System.out.println(nowDate);
        System.out.println(ofDate);
    }
}

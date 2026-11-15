// LocalDate , LocalDateTime

// Period : 
//          measures the difference between dates

// Duration :
//            measures the difference between times

import java.time.LocalDate;
import java.time.Period;

public class AD_datetimeAPI {
    public static void main(String[] args) {
        LocalDate finalMatchDate = LocalDate.of(2027, 1, 19);
        LocalDate today = LocalDate.of(2026,11,15);

        System.out.println(today);

        Period daysUntilFinal = Period.between(today, finalMatchDate);
        System.out.println(daysUntilFinal);
    }
}

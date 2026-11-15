// LocalDate , LocalDateTime

// Period : 
//          measures the difference between dates

// Duration :
//            measures the difference between times

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.time.Duration;

public class AD_datetimeAPI {
    public static void main(String[] args) {
        LocalDate finalMatchDate = LocalDate.of(2027, 1, 19);
        LocalDate today = LocalDate.of(2026,11,15);

        System.out.println(today);

        Period daysUntilFinal = Period.between(today, finalMatchDate);
        System.out.println(daysUntilFinal);

        LocalDateTime kickOff = LocalDateTime.of(2026, 7, 19, 18, 0 );
        LocalDateTime fullTime = LocalDateTime.of(2026, 7, 19, 20, 30 );

        Duration matchlength = Duration.between(kickOff, fullTime);
        System.out.println(matchlength);

        // formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");

        System.out.println(kickOff.format(formatter));
        System.out.println("Match Length: "+ matchlength.toHours() + " Hours " + matchlength.toMinutes() + " minutes");
    }
}

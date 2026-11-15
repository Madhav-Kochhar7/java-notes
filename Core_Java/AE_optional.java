// OPTIONAL :
//            container that may hold a value or be empty
//            it makes absence explicit instead of using null silently

// what does it do?
//                  - signals that a value may be missing
//                  - encourages safe handling at call site
//                  - works well as a return type for lookup methods

//------------------------------------------------------------------------------------------------------------------------------------------

// BIG DECIMAL : 
//               performs precise decimal arithmetic. used for calculations where double rounding errors matter

// what does it do?
//                  - stores exact decimal values
//                  - supports controlled rounding
//                  - avoids surprises like 0.1 + 0.2 not equalling 0.3 with double

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;
public class AE_optional {
    public static void main(String[] args) {
        
        Optional<String> offer = checkjobOffer("anirudh");

        System.out.println(offer.orElse("No Offer Granted"));   // optional.orElse()


        // BIG DECIMAL (BASE + BONUS)
        BigDecimal baseSalary = new BigDecimal("1200000");
        // You pass values inside double quotes ("") as a String to BigDecimal to avoid floating-point precision errors
        // and bypass primitive number size limits

        BigDecimal bonus = baseSalary
        .multiply(
            new BigDecimal("15")
        )
        .divide(
            new BigDecimal("100"),
            2,
            RoundingMode.HALF_UP
        );


        System.out.println("Final CTC: ");
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
    }

    static Optional<String> checkjobOffer(String candidateName){
        if(candidateName.startsWith("ani")) return Optional.of("Job Offer Granted");

        return Optional.empty();
    }
}

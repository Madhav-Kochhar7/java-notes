// COMPARATOR : 
//              A comparator defines a custom ordering rule for your objects.

// what does it do? 

//                  - sorts a list by any field you choose
//                  - lets different screens use differenct sorting rules
//                  - works without changing the class itself

// COMPARABLE : natural/default order inside a class
// COMPARATOR : external rule



import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


record movieTitle(String name, double rating , int releaseYear){ }

// WHAT IS A RECORD?
// a special type of class introduced to act as a transparent carrier for immutable code
// Before records, holding two pieces of data required dozens of lines for fields, constructors, getters, and standard overrides. 
// With a record, you can define the same structure in a single line

public class AC_comparator {
    public static void main(String[] args) {
        List<movieTitle> titles = new ArrayList<>();
        titles.add(new movieTitle("Dune", 9.1, 2024));
        titles.add(new movieTitle("Oppenheimer", 9.2, 2025));
        titles.add(new movieTitle("SpiderMan", 8.4, 2013));

        // sort by ratings
        titles.sort(Comparator.comparingDouble(movieTitle::rating).reversed());
        System.out.println(titles);

        // sort by Release Year
        titles.sort(Comparator.comparingInt(movieTitle::releaseYear));
        System.out.println(titles);

        
    }
}
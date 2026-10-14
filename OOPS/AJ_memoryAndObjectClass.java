//                             ============================== Types of Languages ==============================

// 1. Procedural
// 2. Functional
// 3. Object Oriented


//                           ============================== Static vs Dynamic ==============================

// 1. STATIC 

// - performs type checking at compile time.
// - Errors will show at compile time
// - Declare datatype before you use it
// - more control

//
// 2. DYNAMIC

// - Performs type checking at runtime. 
// - Error might not show until the program is run
// - No need to declare datatype of variables
// - Saves time in writing code but might give error at runtime 


//                           ============================== Memory Management ================================


// JAVA MEMORY :
//              when you create an object with "new", java stores the object in memory and your variable
//              holds a reference to it, not a copy of the whole object

//      a = 10    [a--> reference variable , 10 --> object]

// TYPES OF MEMORY : 

// 1. Stack 
//       |        |   reference variables, function calls are stored in stack memory
//       |        |   
//       |        |   'a' will point towards 10 (memory address of 10) 
//       |    a   |
//       |________|



// 2. Heap

//           / \
//          /   \     the memory location of the actual objects(values) are stored in the heap memory
//         /     \
//        /  10   \ 
//       /         \
//      /           \ 
//     /             \
//    /               \
//   /                 \ 
//  /                   \
// /                     \


// WHAT DOES IT DO? :
//                    lets you create multiple variables that point to the same object
//                    explains why assigning one variable to another does not create a new object
//                    separates same object from same content



//                        ============================== Serialization & Deserialization ================================


// --> part of javaI/O and belongs to java.io package.


// 1. Serialization : Process of converting an object into a byte stream. 
//                    Persists(saves the state) the object after the program exits
//                    Can be saved as a file (.ser) which is platform independent and sent over a network
//                    Can be sent to a different machine
//                    (Think of it as saving a file with the object's information)


// 2. Deserialization : The reverse process of converting byte stream into the object.
//                      (Think of it as loading a saved file)



// !!!!!!!!!!!!!!!!!!!!!!   Implement this stuff !!!!!!!!!!!!!


// OBJECT CLASS :

//               every java class ultimately inherits from java.lang.Object 
//               that means every object gets common methods like toString(), equals(), hashCode()

class concertTicket{
    private String showName;
    private String seatNumber;

    concertTicket(String showName, String seatNumber){
        this.showName = showName;
        this.seatNumber = seatNumber;
    }

    @Override 
    public String toString(){     // overriding the toString method to prove that all the classes inherit from the "object class"  
        return "Concert Ticket {Show Name: "+ showName + ", Seat Number: "+ seatNumber +"}";
    }
}
public class AJ_memoryAndObjectClass {
    public static void main(String[] args) {
        concertTicket ticket = new concertTicket("Rolling Loud", "22A");
        System.out.println(ticket); // will print the ticket in our defined string format
    }
}


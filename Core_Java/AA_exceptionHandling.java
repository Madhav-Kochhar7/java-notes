//  EXCEPTION :
//              exception is java's way of saying something went wrong while the program was running.
//              it interrupts normal flow and jumps to error handling code

// when something goes wrong during a task, instead of crashing the entire application, we handle the faliure, inform the user and 
// decide what happens next

// try{
//        code that might fail
// }catch(){
//        runs when a matching exception is thrown
// }finally{
//        runs after try and catch and it always runs
// }


public class AA_exceptionHandling {
    public static void main(String[] args) {
        String fuelRemainingText = "empty";

    try{
        int fuelRemaining = Integer.parseInt(fuelRemainingText);
        System.out.println("Deliver the package. Fuel Remaining : " + fuelRemaining);
    }catch(NumberFormatException exception){
        System.out.println("Reason : "+ exception.getMessage());
        System.out.println("Mission Failed");
    }finally{
        System.out.println("Returning to last Checkpoint");
    }
    }
}

// THROW :
//          creates an exception and stops the current method immediately. Control jumps to the nearest matching "catch" block or to the caller

// THROWS : 
//          a method signature that declares a method "may" pass an exception to its caller. It is a warning in the method contract, not the act of throwing

// CUSTOM EXCEPTIONS :
//                      your own exception class that names a specific business faliure such as MoviePiracyException instead of a generic exception                        

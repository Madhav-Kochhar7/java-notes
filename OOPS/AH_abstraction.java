//  ABSTRACTION :

//                exposing what something can do while hiding unnecessary internal details
//                the caller must know what it can ask for, not how every class performs it internally

// WHAT DOES IT DO? :

//                    hides implementation details
//                    lets different classes share a common way to interact 
//                    you can swap implementation without changing the caller

// ----------------------------------------------------------------------------------------------------------------------

// IMPLEMENTING AN INTERFACE vs EXTENDING A CLASS

// extending a class (inheritance) means you are inheriting code and data, 
// while implementing an interface (polymorphism/contract) means you are agreeing to a template or contract

// ----------------------------------------------------------------------------------------------------------------------

// HOW DO WE USE IT? :

//  in java we can implement abstraction by 2 ways: 


//   INTERFACES : a behaviour contract
//                defines what a class must be able to do, without providing the full implementation

//   interface playable{
//       void play();
//      }
//                  any class that implements it must provide play()

// WHAT DOES IT DO? :
//                     - defines a shared capability
//                     - lets unrelated classes follow the same contract
//                     - allows a class to implement multiple interfaces


// #################################################

//   abstract classes : A shared, incomplete base class (an abstract class is an incomplete parent class)

//                      it can hold shared fields and methods, but cannot be instantiated directly

// WHAT DOES IT DO? :
//                     - provides a shared state and behaviour for a family of classes
//                     - can have fields, constructors, and concrete methods
//                     - can declare abstract methods that child classes must implement


interface watchable{
    void watch();
}

abstract class movie implements watchable{
    String title;

    movie(String title){
        this.title = title;
    }
    
}

class actionMovie extends movie{

    actionMovie(String title){
        super(title);
    }

    @Override 
    public void watch(){
        System.out.println("Watching action movie "+ title);
    }
}

class comedyMovie extends movie{

    comedyMovie(String title){
        super(title);
    }
 
    public void watch(){
        System.out.println("Watching comedy movie " + title);
    }
}
public class AH_abstraction {
    public static void main(String[] args) {
        movie movie = new comedyMovie("ABC");
        movie.watch();
    }
}

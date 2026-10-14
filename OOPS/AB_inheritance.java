// every child class can inherit : accesible fields, accesible methods
//                                 but constructors are not inherited

//-----------------------------------------------------------------------------------------------------------------------------------------------

// METHOD OVERRIDING : 
//                     when a child class provides its own implementation of a method already available form the parent class

// METHOD OVERRIDING RULES :
//                            1. Same Method Name :              child method name must match parent method name
//                            2. Same Parameter List :           parameters must match for method overriding
//                            3. Compatible Return Type :        method must have same or covariant return type
//                            4. Cannot Reduce Visibility :      a public parent method cannot become a private child
//                            5. Instance methods override :     static methods are hidden not overriden (imp for interviews)
//                            6. Final Methods Cannot Override : parent can block overriding

//-----------------------------------------------------------------------------------------------------------------------------------------------

//  OVERRIDING VS OVERLOADING

//  overriding :  child changes parent method
//  overloading : same class has same method name with different parameters 

//-----------------------------------------------------------------------------------------------------------------------------------------------

// DYNAMIC METHOD DISPATCH : 
//                           mechanism by which a call to an overridden method is resolved at runtime rather than compile time

//-----------------------------------------------------------------------------------------------------------------------------------------------



class animal{
    String name;
    animal(){

    }
    animal(String name){
        this.name = name;
    }

    void sound(){
        System.out.println("default sound");
    }
}


class dog extends animal{

    dog(String dogName){
        super(dogName); //   --> super() constructor called
    }
    
    void sound(){
        System.out.println(super.name + " says woof!");
    }
}


class cat extends animal{
    @Override 
    void sound(){
        super.sound();  // -->   super.method() method called
        System.out.println("cat says meow!");
    }
}

public class AB_inheritance{
    public static void main(String[] args) {
        dog dog1 = new dog("alex");
        dog1.sound();

        animal animal = new cat(); // dynamic method dispatch
        animal.sound();
    }
}
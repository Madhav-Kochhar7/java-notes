// INSTANCE vs STATIC 

//   Instance :
//             instance is a concrete, individual object created from a class blueprint
//             belong to each object, every object gets its own copy

//   Static : 
//            belong to the class, there is one shared copy for all objects

// WHAT DOES IT DO? :

//                    intance fields store data unique to one object
//                    static fields store data shared across all objects of that class
//                    static methods run without the help of any object (ex. psvm)

//-----------------------------------------------------------------------------------------------------------------------------------------

//  STATIC FIELDS : 

//                  belongs to the class, not to any individual object
//                  all objects share the same value

//              - stores class-level data like a counter or shared setting
//              - changes from any object affect the shared value


//  STATIC METHODS :

//                   belongs to the class. You call it through class name, not through an object

//                   runs without creating an object
//                   reads or updates static fields
//                   cannot directly access instance fields, there is no "this" keyword


// STATIC-FINAL CONSTANTS :

//                          a class level constant, it is shared and cannot be reassigned

//                          one value for the whole class
//                          cannot be changed after assignment
//                          common for fixed values like shop name, max limit and config keys

class coffeeOrder{
    static final String shopName = "BEAN & BREW";
    private static int totalOrders;
    private String drinkName;

    coffeeOrder(String drinkName){
        this.drinkName =drinkName;
        totalOrders+=1;
    }

    void printReciept(){
        System.out.println(drinkName + " from " + shopName);
    }

    static int getTotalOrders(){  // must define this method as static too as it is referencing a static value
        return totalOrders;
    }
}


public class AG_staticMethod {
    public static void main(String[] args) {
        coffeeOrder latte = new coffeeOrder("Caramel Latte");
        coffeeOrder mocha = new coffeeOrder("Dark Mocha");

        latte.printReciept();
        mocha.printReciept();

        System.out.println("Total Orders: " + coffeeOrder.getTotalOrders());
    }
}

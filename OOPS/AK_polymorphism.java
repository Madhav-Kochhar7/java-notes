//  POLYMORPHISM :
//                 one common type that can represent many real implementations
//                 a parent class or interface reference can point to different child or implementation objects
//                 when an overridden method is called, java runs the version from the actual object at runtime

// WHAT DOES IT DO? :

//                    lets code depend on what something can do, not the exact class
//                    chooses the correct overridden method at runtime
//                    reduces long if/else chains for every type
//                    makes it easier to add new implementations without changing existing method


//    UPCASTING AND DOWNCASTING :

//  UPCASTING : treating an implementation object as its interface or parent type. Safe and Common
//              ex : parent p = new child()

//  DOWNCASTING : converting back to a specific implementation type. Used Rarely
//                ex : child c = (child)p;

interface  actor{
    void performScene(String line);
}

class batmanRole implements actor{

    String actorName;

    batmanRole(String actorName){
        this.actorName = actorName;
    }
    @Override
    public void performScene(String line) {
        // TODO Auto-generated method stub
        System.out.println("I am Batman: " + actorName );
        
    }
}

class americanPsycho implements actor{

    String actorName;

    americanPsycho(String actorName){
        this.actorName = actorName;
    }

    @Override
    public void performScene(String line) {
        // TODO Auto-generated method stub
        System.out.println("I am Patrick Bateman: " + actorName);
    }
}

public class AK_polymorphism {
    public static void main(String[] args) {
        actor batman = new batmanRole("Christian Bale");
        actor modernBatman = new batmanRole("Robert Pattinson");
        actor bateman = new americanPsycho("Christian Bale");

        directScene(batman, "I am Vengeance");
        directScene(modernBatman, null);
        directScene(bateman, "I have to return some videotapes");
    }

    static void directScene(actor actor, String line){
        System.out.println("Action!");
        actor.performScene(line);
        System.out.println("Cut!");
    }
}

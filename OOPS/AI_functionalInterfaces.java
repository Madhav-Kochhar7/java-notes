//   FUNCTIONAL INTERFACES :
//                          an interface with exactly one abstract method, that gives you a standard way of sending information
//                          it can have default and static methods, but only one method without a body

// WHAT DOES IT DO? :
//                    defines a shape for behaviour
//                    lets you pass a rule or action as a value
//                    it is the type that a lambda expression implements

// ----------------------------------------------------------------------------------------------------------------------

//  LAMBDA EXPRESSIONS :
//                      a compact way to implement the single abstract method of a functional interface

// WHAT DOES IT DO? :
//                    passes behaviour into method, not just data
//                    removes boilerplate from anonymous classes
//                    makes filtering, callbacks and sorting easier to write

@FunctionalInterface 
interface shareAction{
    void share(shareFile file);
}

class shareFile{
    String name;

    shareFile(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}

public class AI_functionalInterfaces {
    public static void main(String[] args) {
        shareFile photos = new shareFile("vacation.png");

        shareAction instagram = (file) -> {
            System.out.println("Posting " + file.getName() + " to instagram");
        };

        shareAction whatsapp = (file) -> {
            System.out.println("Posting " + file.getName() + " to whatsapp");
        };

        shareOnSmartPhone(photos, instagram);
        shareOnSmartPhone(photos, whatsapp);
    }

    static void shareOnSmartPhone(shareFile file , shareAction action){
        System.out.println("Tapped on the share Button");
        action.share(file);
    }
}
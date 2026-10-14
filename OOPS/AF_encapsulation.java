// DATA HIDING :
//               keeping internal data files private so external code cannot read or modify them directly

// what does it do? :

//                    prevents direct access to fields
//                    forces changes to go through the methods the class controls
//                    protects the object from invalid state


// ENCAPSULATION : 
//                 A class bundles its data and the methods that work on that data and controls how outside code can interact with it

//   DATA HIDING IS THE TECHNIQUE, ENCAPSULATION IS THE BIGGER PRINCIPLE
//   THE OBJECT OWN THE RULES FOR HOW ITS STATE CAN CHANGE

// what does it do? :

//                    keeps data and behaviour in one class together
//                    stops outside code from changing state in random ways
//                    lets the object reject invalid changes

// ##########################   GETTERS AND SETTERS   ##########################

//  GETTERS : 

//            safely reads a private field


//  SETTERS : 

//            updates a private field, often with validation

class player{
    private String name;
    private int health;

    player(String name, int health){
        this.name = name;
        this.health = health;
    }

    String getName(){               // create getter methods to let outside code to safely access private fields
        return this.name;
    }

    int getHealth(){
        return this.health;
    }

   void setHealth(int newHealth){
        if(newHealth < 0 || newHealth > 1000){
         System.out.println("Invalid Health Stats");
         return;
        }
        this.health = newHealth; 
    }

    void heal(int recoveryAmount){
        setHealth(health + recoveryAmount);
    }
}
public class AF_encapsulation {
    public static void main(String[] args) {
        player player1 = new player("Ronaldo", 900);

        System.out.println("Name: " + player1.getName());
        player1.setHealth(999);
        System.out.println("Player Health: "+ player1.getHealth()); 
        player1.setHealth(899);
        System.out.println("Depleted Health: "+ player1.getHealth());
        player1.heal(100);
        System.out.println("Health: " + player1.getHealth());
    }
}

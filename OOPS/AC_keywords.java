// KEYWORDS : 
 
// 1. THIS : 
//           acts as a reference variable that points directly to the current object instance executing a method or constructor


// 2. SUPER : 
//            a keyword used inside a subclass to directly access fields, hidden variables or members of its immediate parent class

    // super(...) --> used inside a subclass to invoke the constructor of its immediate parent class 

    // super.method() --> used within a subclass to invoke a method predefined in its immediate parent class

// 3. FINAL : 
//           a non-access modifier used to restrict further modification of variables, methods or classes
//              Variable : once the value is assigned, it cannot be reassigned
//              Method :   child classes can not override that method
//              Class :    no class can extend it 


class bankAccount {
    final String name;
    double balance;

     bankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    void printName(){
        System.out.println("Name : " + name);
    }

    void showSummary(){
        printName();
        System.out.println("Balance : " + balance);
    }

}

class savingsAccount extends bankAccount{
    double interestRate;

    savingsAccount(String name, double balance , double interestRate){
        super(name, balance);
        this.interestRate = interestRate;
    }

    @Override 
    void showSummary() {
        super.showSummary();
        System.out.println("Interest Rate : " + interestRate+"%");

    }
}

public class AC_keywords {
    public static void main(String[] args) {
        bankAccount account = new savingsAccount("abc",30000, 9.7);
        account.showSummary();
    }
}

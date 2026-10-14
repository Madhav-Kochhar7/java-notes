class book{
    String name;
    String author;
    float price;
    boolean isBestSeller;
    

    book(){
        System.out.println("default constructor");
    }
    book(String name, String author,float price, boolean isBestSeller){
        this.name = name;
        this.author = author;
        this.price = price;
        this.isBestSeller = isBestSeller;
    }
}

public class AA_classesBasics {

    static void main() {
        book dune = new book();
        System.out.println(dune);

        book alchemist = new book("The Alchemist", "Paulo Coelho", 299, true);
        System.out.println(alchemist.name + " by " + alchemist.author);
    }
}

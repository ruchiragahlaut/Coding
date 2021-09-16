package Code1.oops;

// hiding the complexities from user for example - we have out laptops and in it we have buttons so when we press a key we don't want to know how the key is working.

public class abstraction {
    public static void main(String[] args) {

        // we will not make a object of car because car is just a concept.And making of objects of car is useless.
        // so we make it abstract

        audi a1 = new audi();
        a1.start();;

        BMW b1 = new BMW();
        b1.start();


        
    }
}

// both the car have their own start 

class audi extends car{

    void start(){
        System.out.println("audi is starting");
    }

}

class BMW extends car{
    
    void start(){
        System.out.println("BMW is starting");
    }
}

abstract class car {
    String brand;
    int price;
    // above one are properties

    abstract void start();
    // you don't need to define it here 
    // these methods implemented in their children
    // for abstract function abstract class is needed
    // abstract function should be ovveride 

}
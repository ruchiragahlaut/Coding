package Code1.oops;

public class Interfaces implements Car, people {
    public static void main(String[] args) {
        
    }

    public void Start(){
        System.out.println("it is starting");
    }
    public void walk(){
        System.out.println("it is walking");
    }
}

interface Car{
    // by default they are public abstract
    public abstract void Start();

}

/* main difference between abstract and interface is that in abstract class we can make concrete functions easily (which are not abstract)
 but in interface you can't make them. they should be abstract. and defaulty they are abstract when you make them*/

 interface people{
     void walk();
 }
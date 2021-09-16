package Code1.oops;

public class Inheritance {
    public static void main(String[] args) {

        person p1 = new person(31, "Ruchira");
        developer d1 = new developer(24, "anuj");

        // now d1 have all the properties of its parent.
        d1.walk(); 
        // output you can see and can say 

        
    }
}

class person{
    protected String name;
    int age;
    /* protected is use when you want parents variable to be used by only its children no one else and it does not matter whether they are in some different packages but they should be the children of parent
    and that's how we hide the data also*/ 
    public person(int age,String name){
        this.age = age;
        this.name = name;
    }

    void walk(){
        System.out.println(name+ "is walking");

    }
    void eat(){
        System.out.println(name+ "is eating");
    }
    void walk(int steps){
        System.out.println(name+" is walking"+ steps);
    }

    // In this person class walk() and walk(int steps) are two functions and here is compile time polymorphism

    
}


class developer extends person{
    public developer(int age, String name){
        super(age, name);
        // super is used to call parent's parameters
    }

    void walk(){
        System.out.println("Developer "+ name+ " is walking" ); 
    }
    // here it is runtime polymorphism where you are defining which function will call by object.
    // polymorphism is the multiple forms of walk(walk is an example).
} 
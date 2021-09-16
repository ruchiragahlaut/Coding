package Code1.oops;
public class basic {
    public static void main(String[] args) {


        // this is called object 
        Person p1 = new Person();
        // () is something which make a object
        Person p2 = new Person();

        p1.name = "Ruchira";
        p1.age = 20;

        p2.name = "sakshi";
        p2.age = 21;

        // Accesing process -->
        //System.out.println(p1.name+"  "+p1.age);

        p2.walk();
        p2.walk(100);

        //**important */
        /* Here come polymorphism -- there are two types of polymorphism which are runtime and compile time above two methods represent 
           above walk function is compile time.Both the functions have same name walk but it knows which have to call.
        */

        /* constructor are not methods, it helps to make new objects*/
        /* In java we have default constructor "()" It defaulty call whether you defined it in your class or not" */

        // here you can see i have't made the object for count beacuse it is static
        System.out.println(Person.count);
        // output is = 2


        // constructor with arguments
        Person p3 = new Person(21,"Prachi");
        p3.walk();
        p3.eat();

        System.out.println(Person.count);
        // output is = 2
        /*still the output is 2 because the count is initilized in default constructor*/

    }


}

// below one is class that we called a blueprint. By using this blueprint we can make many objects.
class Person {
    String name;
    int age;

    static int count;
 //very important --   // by intsializing static now count is the property of class not object 

 // constructor ---->

    public Person(){
        count++;
        System.out.println("helloo i am a defualt constructor");
    }

//New constructor with parameters -->

    public Person(int newage, String newname){
        // now if you want to call the default constructor here
        this();
        // you can use this keyword when you want to call default constructor or when the name of your arguments exactly equal to the default variables.
        // this.age = age
        // this.name = name
        name = newname;
        age = newage;
    }

    // above one are the properties of object
    // now we will tak about the behaviour because every object can do anything according to their behaviour which we define

    void walk(){
        System.out.println(name +" is walking.");
    }
    void eat(){
        System.out.println(name+" is easting");
    }
    void walk(int steps){
        System.out.println(name+" is walking"+steps);
    }


}


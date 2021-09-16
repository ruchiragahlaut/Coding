package Code1.oops;

public class encapsulation {
    // we are doing encapsulation for secuirty
    public static void main(String[] args) {    

        Laptop l1 = new Laptop();
        l1.setPrice(4900);

        System.out.println(l1.getPrice());


        
    }

    /*public void hello(){
        System.out.println("working working");
    }
    /*here public word make this function or methods avalibale to all the other packages also now if you remove this public word then
     it will not be avaliable in other package's class*/
    /* private void hello1(){
        System.out.println("bye bye");
     }
     /* private will not allow to be visible this method in even in the same package only in the same class it will be avalibale*/

    /* protected is use when you want parents variable to be used by only its children no one else and it does not matter whether they are in some different packages but they should be the children of parent*/



}

class Laptop{
    int ram;
    private int price;

    // here we are accessing the private variables by setter and getter
    public void setPrice(int price){
        // now we want only admin will the change the price
        boolean isadmin = true;
        if(isadmin){
            this.price = price;
        }
        else{
            System.out.println("you cannot change the price");
        }
    }

    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getPrice(){
        return price;
    }
}

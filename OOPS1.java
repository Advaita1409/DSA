public class OOPS1 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{

    //constructor
    String color;
    Animal(){
        color = "Brown";
    }
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    Horse(){
        super();
    }
}

class chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
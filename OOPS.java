import java.util.*;
public class OOPS {
    public static void main(String args[]){
       // Pen p1 = new Pen();// created a pen object called p1
       // p1.setColour("Blue");
       // System.out.println(p1.getColor());
       //Fish f1 = new Fish();
       // f1.eat();
       Calculator calc =new Calculator();
       System.out.print(calc.sum(1,2));
       //System.out.print(calc.sum((float)1.5,2.5));
       System.out.print(calc.sum(1,2,3));
    }
}
/* 
class Pen{
    private String color;
    int tip;
    //getter function
    String getColor(){
        return this.color;//this is used to access the instance variable of an object.
    }
    //setter function
    void setColour(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;
    void calcPercent(int phy, int chem, int math){
        percentage =(phy + chem + math)/3;
    }
*/

    //INHERETANCE
    //Base class
    /* 
    //    Inheritance allows us to create classes that are based on other existing classes
    //Derived class
    class Fish extends Animal{
        int fins;
        void swims(){
            System.out.print("Swims")
        }
    }
*/

    //POLYMORPHISM 
    // Compile time [ Method overloading ]
    class Calculator{
        int sum(int a, int b){
            return a+b;
        }
        int sum(float a, float b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+b+c;
        }
    }
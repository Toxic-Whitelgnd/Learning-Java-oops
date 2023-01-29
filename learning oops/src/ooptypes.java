import Bank.Bank;

// polymorphisim and inhertiance
class Bike{
    String brand;
    int year;

    // function overloading
    public void printInfo(String brand){
        System.out.println(brand);
    }
    public void printInfo(int year){
        System.out.println(year);
    }
    public void printInfo(String brand,int year){
        System.out.println(brand + " " + year);
    }

}

class Kawasaki extends Bike{
    public void model(String name,int price){
        System.out.println(name+" "+price);
    }
}
// upto above single lvl inheritance
class KawasakiProps extends Kawasaki{
    public void props(String color,String model){
        System.out.println(color+" "+model);
    }
}
// above one is multivelel inheritance

class Bajaj extends Bike{
    public void model(String name,int price){
        System.out.println(name +" "+ price);
    }
}

// Abstract class
abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("created animal");

    }
    public void eat(){
        System.out.println("All animals will eat");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse created");

    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
// interfcae implemetation
interface Boat{
    void run();
}
interface Ship{
    void container();
    int length = 1000;
}
class X100 implements Boat,Ship{
    public void run(){
        System.out.println("run by turbine");
        System.out.println(length);
    }
    public void container(){
        System.out.println("it wont carry Containers");
    }
}
// static
class Student{
    static String school;
    String name;

    public static void ChangeSchool(){
        school = "newschool";
    }
}
public class ooptypes {
    public static void main (String[] args) {
        Bike b = new Bike();
        b.brand = "bmw";
        b.year = 9000;

        b.printInfo(b.brand);
        b.printInfo(b.brand,b.year);
        b.printInfo(b.year);

        Bank acc1 = new Bank();

        acc1.name = "dfdf";

        Horse h = new Horse();
        h.eat();
        h.walk();

        // implementation of interface
        X100 x = new X100();
        x.container();
        x.run();
        // staitc implementation
        Student.school =  "oldschool";
        Student s = new Student();
        s.name = "ram";
        System.out.println(s.school + " "+ s.name);
        Student.ChangeSchool();
        System.out.println(s.school);
    }
}

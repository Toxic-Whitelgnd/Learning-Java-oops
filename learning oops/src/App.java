class Car{
    String brand;
    String model;
    int year;

    public void Printinfo(){
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.year);
    }

    // creating empty consrtoustor
    Car(){
        System.out.println("Car constructor is invoked");
    }

    // type  2  parameterised constructor
    Car(String brand,String model,int year){
        System.out.println("from parameterized consrtuctor");
        this.brand = brand;
        this.model = model;
        this.year = year;

    }
    // type 3 copy constructor
    Car(Car c2){
        System.out.println("inside copy constructor");
        this.brand = c2.brand;
        this.model  = c2.model;
        this.year = c2.year;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Learning OOPS");
        Car c = new Car();
        c.brand = "benz";
        c.model = "amgdt63";
        c.year = 2022;

        c.Printinfo();

        Car c1 = new Car("audi","a6",2015);
        c1.Printinfo();

        Car c2 = new Car(c1);
        c2.Printinfo();
    }
}

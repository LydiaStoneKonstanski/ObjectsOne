
public class Main {
    //Error Missing package statement: 'main.java.object1' Couldn't figure out how to fix this
    public static void main(String[] args){
        Person person1 = new Person ("John", 30, 215);
        Person person2 = new Person ("Beth", 45, 155);
        System.out.println("height is " + person2.height);

        Chair chair1 = new Chair ("wood", "brown", 4);
        Chair chair2 = new Chair ("aluminum", "white", 4);

        Dog dog1 = new Dog("Chloe", 12, "Golden Retriever", "red");

        Car car1 = new Car("Ford", "Ranger", 1998, 15000);
    }
}

public static class Chair {
    private String material;
    private String color;
    private int legs;

    public Chair (String material, String color, int legs){
        this.material = material;
        this.color = color;
        this.legs = legs;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
    }
    public int getLegs(){
        return legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
}

public static class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;

public Dog(String name, int age, String breed, String color) {
    this.name = name;
    this.age = age;
    this.breed = breed;
    this.color = color;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getBreed() {
    return breed;
}

public void setBreed(String breed) {
    this.breed = breed;
}
public String getColor(){
    return color;
}
public void setColor(String color) {
    this.color = color;
}
}

public class Car {
    String make;
    String model;
    int year;
    int mileage;

    public Car(String make, String model, int year, int mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
}
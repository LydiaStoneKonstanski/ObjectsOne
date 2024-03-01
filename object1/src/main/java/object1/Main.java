package main.java.object1;

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

class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0;
    // height in cm
    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


}

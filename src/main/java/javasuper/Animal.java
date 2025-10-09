package javasuper;

public class Animal {
    int age;
    String name;
    public Animal(){}

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal speaks");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

}

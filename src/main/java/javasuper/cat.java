package javasuper;

public class cat extends Animal{

    String catfoodpreferences;

    public cat(int age, String name, String catfoodpreferences){
        /*super(age, name);*/
        super();
        this.catfoodpreferences = catfoodpreferences;
    }

    @Override
    public void speak(){
        super.speak();
        System.out.println("Meow Meow");
        eat();
    }

}

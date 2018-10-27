package practicle.data.structure.prerequisite_oop;

public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is " +this.name);
        System.out.println("I am " + this.heightInInches + " inches tall");
        System.out.println("I am " + this.age + " year old");
        System.out.println("My eye color is  " + this.eyeColor );
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void walk(){
        System.out.println("Waling...");
    }

    public void work(){
        System.out.println("Working...");
    }
}

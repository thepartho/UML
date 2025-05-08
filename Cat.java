package animal;
/**
 *
 * @author PARTHO7
 */
public class Cat extends Animal implements Pet{
     private String color;

    public Cat(String name, int age, String color) {
        this.color = color; super(name, age);
     
    }
    public void displayColor() {
        System.out.println("Color: " + color);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
    @Override
public void play() {
System.out.println(name + " the cat is playing with a ball of yarn!");
   
    }
}

package animal;
/**
 *
 * @author PARTHO7
 */


public class AnimalTest {
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Tommy", 3, "Bluish White");
        animals[1] = new Cat("Pookie", 2, "Black");

        for (Animal animal : animals) {
            animal.makeSound();
        
            if (animal instanceof Pet) 
            {
             ((Pet) animal).play();
            }
       
        }
     }
}

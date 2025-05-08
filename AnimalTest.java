package animal;
/**
 *
 * @author PARTHO7
 */


public class AnimalTest {
    
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Cat("Whiskers", 2, "Black");

        for (Animal animal : animals) {
            animal.makeSound();
            
            if (animal instanceof Pet) {
             ((Pet) animal).play();
            
            }
       
        }
     }
}

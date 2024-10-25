import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс иерархии классов Animal и использования полиморфизма.
 */
public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Бобик"));
        animals.add(new Cat("Мурка"));
        animals.add(new Bird("Кеша", true));
        animals.add(new Dog("Шарик"));
        animals.add(new Cat("Васька"));
        animals.add(new Bird("Клёпа", false));


        for (Animal animal : animals) {
            System.out.print(animal.getName() + " говорит: ");
            animal.makeSound();
            System.out.print(animal.getName() + " ест: ");
            animal.eat();
            System.out.print(animal.getName() + " двигается: ");
            animal.move();

            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                System.out.print(animal.getName() + " играет: ");
                pet.play();
                System.out.print(animal.getName() + " дружелюбно: ");
                pet.beFriendly();
            } else {
                System.out.println(animal.getName() + " не дружелюбно");
            }

            System.out.println();
        }
    }
}
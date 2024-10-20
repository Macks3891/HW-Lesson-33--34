import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс, демонстрирующий использование иерархии классов животных.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем список животных
        List<Animal> animals = new ArrayList<>();

        // Добавляем в список собак, кошек и птиц
        animals.add(new Dog("Бобик"));
        animals.add(new Cat("Мурка"));
        animals.add(new Bird("Кеша", true));
        animals.add(new Dog("Шарик"));
        animals.add(new Cat("Васька"));
        animals.add(new Bird("Клёпа", false));

        // Проходим по списку и вызываем методы makeSound() и eat() для каждого животного
        for (Animal animal : animals) {
            System.out.println("Имя животного: " + animal.getName());
            animal.makeSound();
            animal.eat();
            System.out.println();
        }
    }
}
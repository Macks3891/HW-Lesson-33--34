/**
 * Класс, представляющий собаку, наследуется от класса Animal.
 */
public class Dog extends Animal {

    /**
     * Конструктор для инициализации объекта.
     *
     * @param name Имя собаки.
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Переопределенный метод makeSound(), чтобы собака "лаяла".
     */
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    /**
     * Переопределенный метод eat(), чтобы собака ела кость.
     */
    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }
}
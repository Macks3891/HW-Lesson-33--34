/**
 * Класс, представляющий собаку, наследуется от класса Animal.
 */
public class Dog extends Animal implements Pet {
    /**
     * Конструктор для инициализации объекта Dog.
     *
     * @param name Имя собаки.
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Переопределенный метод для издания звука собаки.
     */
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    /**
     * Переопределенный метод для описания движения собаки.
     */
    @Override
    public void move() {
        System.out.println("Собака бежит");
    }

    /**
     * Переопределенный метод для описания процесса еды собаки.
     */
    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }

    /**
     * Реализация метода интерфейса Pet для игры с собакой.
     */
    @Override
    public void play() {
        System.out.println("Собака играет с мячом");
    }

    /**
     * Реализация метода интерфейса Pet для демонстрации дружелюбного поведения собаки.
     */
    @Override
    public void beFriendly() {
        System.out.println("Собака виляет хвостом");
    }
}
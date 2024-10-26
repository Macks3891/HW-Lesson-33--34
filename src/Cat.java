/**
 * Класс, представляющий кошку, наследуется от класса Animal.
 */
public class Cat extends Animal implements Pet {
    /**
     * Конструктор для инициализации объекта Cat.
     *
     * @param name Имя кошки.
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Переопределенный метод для издания звука кошки.
     */
    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    /**
     * Переопределенный метод для описания движения кошки.
     */
    @Override
    public void move() {
        System.out.println("Кошка крадется");
    }

    /**
     * Переопределенный метод для описания процесса еды кошки.
     */
    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }

    /**
     * Реализация метода интерфейса Pet для игры с кошкой.
     */
    @Override
    public void play() {
        System.out.println("Кошка играет с клубком ниток");
    }

    /**
     * Реализация метода интерфейса Pet для демонстрации дружелюбного поведения кошки.
     */
    @Override
    public void beFriendly() {
        System.out.println("Кошка мурлычет");
    }
}
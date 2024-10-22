/**
 * Класс, представляющий кошку, наследуется от класса Animal.
 */
public class Cat extends Animal {

    /**
     * Конструктор для инициализации объекта.
     *
     * @param name Имя кошки.
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Переопределенный метод makeSound(), чтобы кошка "мяукала".
     */
    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    /**
     * Переопределенный метод eat(), чтобы кошка ела рыбу.
     */
    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }
}
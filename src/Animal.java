/**
 * Абстрактный класс.
 */
public abstract class Animal {
    private String name;

    /**
     * Конструктор для инициализации объекта Animal.
     *
     * @param name Имя животного.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для издания звука.
     *
     */
    public abstract void makeSound();

    /**
     * Абстрактный метод для описания движения животного.
     *
     */
    public abstract void move();

    /**
     * Метод для описания процесса еды животного.
     *
     */
    public void eat() {
        System.out.println("Животное ест");
    }

    /**
     * Геттер для имени животного.
     *
     * @return Имя животного.
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер для имени животного.
     *
     * @param name Новое имя животного.
     */
    public void setName(String name) {
        this.name = name;
    }
}
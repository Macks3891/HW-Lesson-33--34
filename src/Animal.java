/**
 * Базовый класс для всех животных.
 */
public class Animal {
    private String name;


    /**
     * Конструктор для инициализации объекта.
     *
     * @param name Имя животного.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Метод, который выводит звук, который издает животное.
     */
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    /**
     * Метод, который выводит сообщение о том, что животное ест.
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
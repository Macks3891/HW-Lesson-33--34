/**
 * Класс, представляющий птицу, наследуется от класса Animal.
 */
public class Bird extends Animal {
    private boolean canFly;

    /**
     * Конструктор для инициализации объекта Bird.
     *
     * @param name Имя птицы.
     * @param canFly Может ли птица летать.
     */
    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    /**
     * Переопределенный метод для издания звука птицы.
     */
    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик");
    }

    /**
     * Переопределенный метод для описания движения птицы.
     * В зависимости от значения поля canFly выводит соответствующее сообщение.
     */
    @Override
    public void move() {
        if (canFly) {
            System.out.println("Птица летит");
        } else {
            System.out.println("Птица ходит");
        }
    }

    /**
     * Переопределенный метод для описания процесса еды птицы.
     */
    @Override
    public void eat() {
        System.out.println("Птица ест семена");
    }

    /**
     * Геттер для поля canFly.
     *
     * @return Значение поля canFly.
     */
    public boolean canFly() {
        return canFly;
    }

    /**
     * Сеттер для поля canFly.
     *
     * @param canFly Новое значение поля canFly.
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
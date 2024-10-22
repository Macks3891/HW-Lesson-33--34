/**
 * Класс, представляющий птицу, наследуется от класса Animal.
 */
public class Bird extends Animal {
    private boolean canFly;

    /**
     * Конструктор для инициализации объекта.
     *
     * @param name   Имя птицы.
     * @param canFly Может ли птица летать.
     */
    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    /**
     * Переопределенный метод makeSound(), чтобы птица "чирикала".
     */
    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик");
    }

    /**
     * Переопределенный метод eat(), чтобы птица ела семена.
     */
    @Override
    public void eat() {
        System.out.println("Птица ест семена");
    }

    /**
     * Геттер для поля canFly.
     *
     * @return true, если птица может летать, иначе false.
     */
    public boolean canFly() {
        return canFly;
    }

    /**
     * Сеттер для поля canFly.
     *
     * @param canFly Новое значение, может ли птица летать.
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
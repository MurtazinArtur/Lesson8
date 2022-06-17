package collections;

import java.util.function.Supplier;

/**
 * Кот
 */
public class Cat {
    /**
     * Имя кота
     */
    private final String name;

    /**
     * Оставшая в коте вода
     */
    private int waterCount;

    /**
     * Способ попить
     */
    private Supplier<Integer> drinkAction;

    public Cat(String name) {
        this.name = name;
        this.waterCount = 0;
        this.drinkAction = null;
    }

    /**
     * Попить воды
     */
    public void drink() {
        int drunkWater = drinkAction != null ? drinkAction.get() : -1;
        if (drunkWater > -1) {
            waterCount += drunkWater;
            System.out.println(name + " выпил " + drunkWater + " стаканов воды");
        } else System.out.println(name + " не знает, где и как попить воды :(");
    }

    /**
     * Подоставать хозяина (стоит 1 стакан воды)
     *
     * @return количество оставшейся воды
     */
    public int annoyOwner() {
        if (waterCount > 0) {
            System.out.println(name + " подоставал хозяина");
            waterCount--;
        } else System.out.println(name + " устал и хотел бы ещё попить");
        return waterCount;
    }

    public Cat setDrinkAction(Supplier<Integer> drinkAction) {
        this.drinkAction = drinkAction;
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "кот " + name;
    }
}

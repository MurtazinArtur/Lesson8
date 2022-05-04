package lesson_12;

import java.util.Random;
import java.util.function.Supplier;

public class AnnoyingCat {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        System.out.println("У нас появился " + barsik + " и захотел он попить:");
        barsik.drink();

        System.out.println("\nМы решили показать ему, где находится кран с водой и вот следующим утром");
        Supplier<Integer> drinkFromTap = createDrinkFromTap();
        barsik.setDrinkAction(drinkFromTap).drink();

        System.out.println("\nТак он пил ещё раз в обед");
        barsik.drink();

        System.out.println("\nНо отдыхать после этого он явно не планировал");
        for (int amount = barsik.annoyOwner(); amount > 0; )
            amount = barsik.annoyOwner();
        System.out.println("\nНаконец");
        barsik.annoyOwner();

        System.out.println("\nСамо собой, мне не улыбалось постоянно таскать кота и решил поставить ему ведро с водой");
        Supplier<Integer> drinkFromBucket = createDrinkFromBucket();
        barsik.setDrinkAction(drinkFromBucket);

        System.out.println("И что бы вы думали? Он взял и...");
        barsik.drink();

        System.out.println("\nТак что на следующее утро");
        barsik.setDrinkAction(drinkFromTap).drink();
    }

    private static Supplier<Integer> createDrinkFromTap() {
        return () -> {
            System.out.println("Я взял кота, притащил к открытому крану с водой и...");
            Random random = new Random();
            int waitSec = random.nextInt(4) + 3;
            pause(waitSec * 1000);

            System.out.println("Кот начал из него пить!");
            int drankAmount = random.nextInt(5) + 1;
            pause(2_000);
            return drankAmount;
        };
    }

    private static Supplier<Integer> createDrinkFromBucket() {
        return () -> {
            System.out.println("Пошел к ведру, поразбрызгал из него воду и начал пить");
            pause(2_000);
            return new Random().nextInt(3) + 1;
        };
    }

    private static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


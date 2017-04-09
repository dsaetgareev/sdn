package ru.sdn.route;

/**
 * calculates route.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public class Calculate implements Working {
    /**
     * create route.
     * @param tracker Tracker
     * @param input Input
     */
    public void work(Tracker tracker, Input input) {
        int numbersOfLiters = Integer.valueOf(input.ask("Please, enter numbers of liters: "));
        int expectedDistance = (int) (numbersOfLiters / 0.1346);
        System.out.println(String.format("{%s}", expectedDistance));
        int actualDistance = 0;
        do {
            int distance = tracker.calculate("Zavodskay,15 - ");
            actualDistance += distance;
        } while (actualDistance < expectedDistance -20);
        System.out.println(String.format("{%s}", actualDistance));
    }
}

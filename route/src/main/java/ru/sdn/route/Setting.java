package ru.sdn.route;

/**
 * configures the application.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public class Setting implements Working {
    /**
     * work which tracker.
     * @param tracker - Tracker
     * @param input - Input
     */
    public void work(Tracker tracker, Input input) {
        TrackerMenu menu = new TrackerMenu(input, tracker);
        menu.fillAction();
        menu.showActions();
        menu.select(input.ask("Select:__", menu.initRange()));
    }
}

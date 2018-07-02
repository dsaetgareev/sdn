package ru.sdn.route;

/**
 * launches the application.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public class StartUI {
    /**
     * Input input.
     */
    Input input;
    /**
     * Tracker tracker
     */
    Tracker tracker;

    /**
     * constructor.
     * @param input new input
     * @param tracker new tracker
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * launches the application.
     */
    public void init() {
        do {
            WorkMenu workMenu = new WorkMenu();
            workMenu.fillWorkings();
            Working working = workMenu.selectWork(this.input.ask(workMenu.question(), workMenu.initRangeWork()));
            do {
                working.work(tracker, input);
            } while (!"exit".equals(input.ask("Continue? Any key. Enter \"exit\" to exit: ")));
        } while (!"exit".equals(input.ask("Continue? Any key. Enter \"exit\" to exit: ")));
    }

    /**
     * method main.
     *
     * @param args - String[]
     */
    public static void main(String[] args) {
        ConsoleInput input = new ValidateInput();
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
        System.out.println("ok");
    }

}

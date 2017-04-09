package ru.sdn.route;

/**
 * interface for action.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 08.04.2017
 * @version 1.0
 */
public interface UserAction {
    /**
     * set key.
     * @return key
     */
     int key();

    /**
     * execute class
     * @param input - Input
     * @param tracker - Tracker
     */
     void execute(Input input, Tracker tracker);

    /**
     * return info.
     * @return info
     */
     String info();
}

package ru.sdn.route;

/**
 * interface for classes Setting and Calculate.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public interface Working {
    /**
     * work.
     * @param tracker - Tracker
     * @param input - Input
     */
    void work(Tracker tracker, Input input);
}

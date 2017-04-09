package ru.sdn.route;

import java.util.ArrayList;

/**
 * menu for interface Working.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public class WorkMenu {
    private ArrayList<Working> workings = new ArrayList<Working>();
    /**
     * String question() - question for MenuLanguage.
     * @return question - String
     */
    public String question() {
        return "To set the Settings, enter  0.\nTo Calculate the Route, enter 1.\n:___";
    }
    /**
     * void fillLanguage() - fills this.languages.
     */
    public void fillWorkings() {
        this.workings.add(new Setting());
        this.workings.add(new Calculate());
    }

    /**
     * Language selectLan(int key) - selects Language.
     * @param key - int
     * @return - this.languages
     */
    public Working selectWork(int key) {
        fillWorkings();
        return this.workings.get(key);
    }

    /**
     * int[] initRangeLan() - create range.
     * @return range - array
     */
    public int[] initRangeWork() {
        int[] range = new int[this.workings.size()];
        for (int i = 0; i < this.workings.size(); i++) {
            range[i] = i;
        }
        return range;
    }
}

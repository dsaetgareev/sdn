package ru.sdn.route;

/**
 * class ValidateInput extends ConsoleInput implements method int ask(String question, int[] range).
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public class ValidateInput extends ConsoleInput{
    /**
     * method int ask(String question, int[] range) return int ask.
     * @param question - String, user question
     * @param range - int[]
     * @return value - int
     */
    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = 0;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please, enter key of menu");
            } catch (NumberFormatException nfe) {
                System.out.println("Please, enter validate date.");
            }  catch (Exception e) {
                System.out.println("exception");
            }
        } while (invalid);
        return value;
    }
    /**
     * method String ask(String question).
     * @param question - String, user question
     * @return value - String
     */
    @Override
    public String ask(String question) {
        boolean invalid = true;
        String value = null;
        do {
            try {
                value = super.ask(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please, enter validate date.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please, enter key of menu");
            }  catch (Exception e) {
                System.out.println("exception");
            }
        } while (invalid);
        return value;
    }
}

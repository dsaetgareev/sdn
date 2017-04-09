package ru.sdn.route;

import java.util.ArrayList;
import java.util.List;

/**
 * Class TrackerMenu - menu for tracker.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public class TrackerMenu {
    /**
     * Input input.
     */
    private Input input;
    /**
     * tracker for address.
     */
    private Tracker tracker;
    /**
     * list of action.
     */
    private List<UserAction> actions = new ArrayList<UserAction>();

    /**
     * fill action.
     */
    public void fillAction() {
        this.actions.add(new AddAction());
        this.actions.add(new ShowAction());
        this.actions.add(new DeleteAddressAction());
        this.actions.add(new UpdateAddressAction());
        this.actions.add(new GoToAddressAction());
    }

    /**
     * constructor.
     * @param input - input
     * @param tracker - tracker
     */
    public TrackerMenu(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * show actions.
     */
    public void showActions() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * int[] initRange() - fill Range.
     *
     * @return range - int[]
     */
    public int[] initRange() {
        int[] range = new int[this.actions.size()];
        for (int i = 0; i < this.actions.size(); i++) {
            range[i] = i;
        }
        return range;
    }

    /**
     * method void select(int key) - executes class by key.
     *
     * @param key - int
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }


    /**
     * add new Address.
     */
    public class AddAction implements UserAction {
        /**
         * assign a key.
         *
         * @return key
         */
        public int key() {
            return 0;
        }

        /**
         * add new address.
         * @param input - Input
         * @param tracker - Tracker
         */
        public void execute(Input input, Tracker tracker) {
            boolean invalid = true;
            do {
                try {
                    String addressName = input.ask("Enter new Address: ");
                    int wayDist = Integer.valueOf(input.ask("enter distance to address of dislocation: "));
                    //int wayToAddress = Integer.valueOf(input.ask("enter distance to the address: "));
                    tracker.addAddress(new Way(new Address(addressName, wayDist), 0));
                    tracker.synchronizationAfterAdd();
                    invalid = false;
                } catch (NumberFormatException nfe) {
                    System.out.println("Please, enter validate date.");
                }
            } while (invalid);
        }

        /**
         *return info.
         * @return info
         */
        public String info() {
            return String.format("[%s]. %s", this.key(), "Add new Address.");
        }
    }

    /**
     * show actions.
     */
    public class ShowAction implements UserAction {
        /**
         * set key.
         * @return key
         */
        public int key() {
            return 1;
        }

        /**
         * show actions.
         * @param input - Input
         * @param tracker - Tracker
         */
        public void execute(Input input, Tracker tracker) {
            ArrayList<Way> ways = tracker.findAll();
            for (Way way : ways) {
                if (way != null) {
                    System.out.println(String.format("[%s] [%s] [%s]",
                            way.getAddressIn().getName(), way.getAddressIn().getWayDislocation(), way.getDistance()));
                }
            }
        }

        /**
         * return info.
         * @return info
         */
        public String info() {
            return String.format("[%s]. %s", this.key(), "Show Addresses.");
        }
    }

    /**
     * delete an address.
     */
    public class DeleteAddressAction implements UserAction {
        /**
         * assign a key.
         *
         * @return key
         */
        public int key() {
            return 2;
        }

        /**
         * delete address.
         * @param input - Input
         * @param tracker - Tracker
         */
        public void execute(Input input, Tracker tracker) {
            String deleteAddress = input.ask("Pleas, enter name of an address: ");
            tracker.deleteAddress(deleteAddress);
            tracker.synchronizationAfterDelete(deleteAddress);
        }

        /**
         * return info.
         * @return info
         */
        public String info() {
            return String.format("[%s]. %s", this.key(), "Delete Address.");
        }
    }

    /**
     * edit address.
     */
    public class UpdateAddressAction implements UserAction {
        /**
         * assign a key.
         *
         * @return key
         */
        public int key() {
            return 3;
        }

        /**
         * edit address.
         * @param input - Input
         * @param tracker - Tracker
         */
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter name of an address: ");
            String addressName = input.ask("Please, enter name of new address: ");
            int wayDist = Integer.valueOf(input.ask("Please, enter new distance to dislocation: "));
            int distance = Integer.valueOf(input.ask("Please, enter new distance"));
            Way way = new Way(new Address(addressName, wayDist), distance);
            tracker.updateWay(name, way);
        }

        /**
         * return info.
         * @return info
         */
        public String info() {
            return String.format("[%s]. %s", this.key(), "Update an address.");
        }
    }

    /**
     * go to address.
     */
    public class GoToAddressAction implements UserAction {
        /**
         * set key.
         * @return key
         */
        public int key() {
            return 4;
        }

        /**
         * work which address.
         * @param input - Input
         * @param tracker - Tracker
         */
        public void execute(Input input, Tracker tracker) {
            try {
                String name = input.ask("Pleas, enter name:  ");
                Address address = tracker.chooseAddress(name);
                address.showInfo();

                do {
                    try {
                        String answer = input.ask("enter the address to change distance:__");
                        int distance = Integer.valueOf(input.ask("Please, enter distance: "));
                        address.setWayDistance(answer, distance);
                        tracker.chooseAddress(answer).setWayDistance(name, distance);
                        address.showInfo();
                    } catch (NumberFormatException nfe) {
                        System.out.println("Please, enter validate date.");
                    } catch (NullPointerException npe) {
                        System.out.println("Please, enter the address correctly.");
                    }
                } while (!"exit".equals(input.ask("Enter \"exit\" to exit: ")));
            } catch (NullPointerException npe) {
                System.out.println("Please, enter the address correctly.");
            }

        }

        /**
         * return info.
         * @return info
         */
        public String info() {
            return String.format("[%s]. %s", this.key(), "Go to address.");
        }
    }


}

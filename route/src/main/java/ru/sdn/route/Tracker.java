package ru.sdn.route;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Class Tracker - wrapper over class Item.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since 06.04.2017
 * @version 1.0
 */
public class Tracker {
    /**
     * list of patch.
     */
    private ArrayList<Way> addressBook = new ArrayList<Way>();

    /**
     * adds new patch.
     * @param way - new way
     */
    public void addAddress(Way way) {
        addressBook.add(way);

    }

    /**
     * removes address.
     * @param name - name removed address
     */
    public void deleteAddress(String name) {
        Iterator<Way> iterator = this.addressBook.iterator();
        while(iterator.hasNext()) {
            Way way1 = iterator.next();
            if (iterator != null && name.equals(way1.getAddressIn().getName())) {
                iterator.remove();
                break;
            }
        }
    }

    /**
     * finds all ways.
     * @return ways
     */
    public ArrayList<Way> findAll() {
        ArrayList<Way> ways = new ArrayList<Way>(addressBook);
        ways.trimToSize();
        return ways;
    }

    /**
     * edits way.
     * @param name new name
     * @param way - new Way
     */
    public void updateWay(String name, Way way) {
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i) != null && addressBook.get(i).getAddressIn().getName().equals(name)) {
                this.addressBook.set(i, way);
            }
        }
    }

    /**
     * chooses address.
     * @param name name of the address
     * @return address
     */
    public Address chooseAddress(String name) {
        Address address = null;
        for (int i = 0; i < this.addressBook.size(); i++) {
            if (addressBook.get(i) != null && addressBook.get(i).getAddressIn().getName().equals(name)) {
                address = this.addressBook.get(i).getAddressIn();
            }
        }
        return address;
    }

    /**
     * synchronizations after add.
     */
    public void synchronizationAfterAdd() {
        for (Way way : this.addressBook) {
            for (Way way1 : this.addressBook) {
                if (!way1.getAddressIn().getWayLists().contains(way)) {
                    way1.getAddressIn().getWayLists().add(new Way(way.getAddressIn(), 0));
                }
            }
        }
    }

    /**
     * synchronizations after delete.
     * @param name whose address will be deleted
     */
    public void synchronizationAfterDelete(String name) {
        for (Way way : this.addressBook) {
            Iterator<Way> iterator = way.getAddressIn().getWayLists().iterator();
            while (iterator.hasNext()) {
                Way wayLists = iterator.next();
                if (wayLists.getAddressIn().getName().equals(name)) {
                    iterator.remove();
                }
            }
        }
    }

    /**
     * calculate route.
     * @param name name of the address dislocation
     * @return
     */
    public int calculate(String name) {
        int distance = 0;
        int i = new Random().nextInt(this.addressBook.size());
        System.out.print(name);
        Address gAddress = this.addressBook.get(i).getAddressIn();
        System.out.print(gAddress.getName() + " - ");
        distance += gAddress.getWayDislocation();
        int j = new Random().nextInt(2);
        for (int k = 0; k < j; k++) {
            int t = new Random().nextInt(gAddress.getWayLists().size());
            Way way = gAddress.getWayLists().get(t);
            distance += way.getDistance();
            System.out.print(way.getAddressIn().getName() + " - ");
            gAddress = way.getAddressIn();
        }
        distance += gAddress.getWayDislocation();
        System.out.print(name);
        System.out.println(String.format("[%s]", distance));
        return distance;
    }

}

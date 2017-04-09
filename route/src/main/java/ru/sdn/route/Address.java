package ru.sdn.route;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Address describe a address.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since  08.04.2017
 * @version 1.0
 */
public class Address {
    /**
     * Input input.
     */
    Input input;
    /**
     * name of address.
     */
    private String name;
    /**
     * way to dislocation.
     */
    private int wayDislocation;
    /**
     * List of ways of address.
     */
    ArrayList<Way> wayLists = new ArrayList<Way>();

    /**
     * constructor.
     * @param name - new name
     * @param wayDislocation new wayDislocation
     */
    public Address(String name, int wayDislocation) {
        this.name = name;
        this.wayDislocation = wayDislocation;
    }

    /**
     * get name.
     * @return this name
     */
    public String getName() {
        return this.name;
    }

    /**
     * get way to dislocation.
     * @return this.wayDislocation
     */
    public int getWayDislocation() {
        return this.wayDislocation;
    }

    /**
     * get wayList
     * @return this.wayList
     */
    public List<Way> getWayLists() {
        return this.wayLists;
    }

    /**
     * show info of address.
     */
    public void showInfo() {
        System.out.println(String.format("%s  distance to dislocation [%s]", this.getName(), this.getWayDislocation()));
        int marker = 1;
        for (Way ways : wayLists) {
            System.out.println(String.format(
                " %s. %s - %s  -  [%s] distance to dislocation - [%s]", marker, this.getName(), ways.getAddressIn().getName(),
                    ways.getDistance(), ways.getAddressIn().getWayDislocation()
            ));
            marker++;
        }
    }

    /**
     * set distance a way of wayLists.
     * @param distance - new distance
     */
    public void setWayDistance(String name, int distance) {
        for (Way way : wayLists) {
            if (way != null && way.getAddressIn().getName().equals(name)) {
                way.setDistance(distance);
            }
        }
    }

    /**
     * override equals().
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (wayDislocation != address.wayDislocation) return false;
        if (input != null ? !input.equals(address.input) : address.input != null) return false;
        if (name != null ? !name.equals(address.name) : address.name != null) return false;
        return wayLists != null ? wayLists.equals(address.wayLists) : address.wayLists == null;
    }

    /**
     * override hashCode().
     * @return int result
     */
    @Override
    public int hashCode() {
        int result = input != null ? input.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + wayDislocation;
        result = 31 * result + (wayLists != null ? wayLists.hashCode() : 0);
        return result;
    }
}

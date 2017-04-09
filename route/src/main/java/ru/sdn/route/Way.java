package ru.sdn.route;

/**
 *class Way describe way of address.
 * @author Dinis Saetgareev (dinis0086@mail.ru)
 * @since  08.04.2017
 * @version 1.0
 */
public class Way {
    /**
     * destination address.
     */
    private Address addressIn;
    /**
     * distance to address.
     */
    private int distance;

    /**
     * constructor.
     * @param addressIn new destination address
     * @param distance new distance to address
     */
    public Way(Address addressIn, int distance) {
        this.addressIn = addressIn;
        this.distance = distance;
    }

    /**
     * constructor.
     * @param way new way
     */
    public Way(Way way) {
        this(way.getAddressIn(), way.getDistance());
    }

    /**
     * get addressIn.
     * @return this.addressIn
     */
    public Address getAddressIn() {
        return this.addressIn;
    }

    /**
     * get distance to address.
     * @return this.distance
     */
    public int getDistance() {
        return this.distance;
    }

    /**
     * set distance to address.
     * @param distance new distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
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

        Way way = (Way) o;

        return addressIn != null ? addressIn.equals(way.addressIn) : way.addressIn == null;
    }
    /**
     * override hashCode().
     * @return int result
     */
    @Override
    public int hashCode() {
        int result = addressIn != null ? addressIn.hashCode() : 0;
        result = 31 * result + distance;
        return result;
    }
}

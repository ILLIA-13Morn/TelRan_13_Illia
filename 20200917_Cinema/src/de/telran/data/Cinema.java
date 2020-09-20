package de.telran.data;

public class Cinema {
    private String name;
    private Address address;

    public Cinema(String name) {
        this.name = name;
    }

    public Cinema(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema)) return false;

        Cinema cinema = (Cinema) o;

        if (!getName().equals(cinema.getName())) return false;
        return getAddress().equals(cinema.getAddress());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAddress().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cinema: " + name +
                ", " + address;
    }

    public static boolean isCinemaInArray(String name, Cinema[] cinemas){
        for (Cinema cinema: cinemas) {
            if(cinema.name.equalsIgnoreCase(name))
                return true;
        }
        return false;
    }
}

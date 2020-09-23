package de.telran.data;

public class Person {
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private Sex sex;

    public Person(String firstName, String lastName, int birthDate, String address, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.sex = sex;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getBirthDate() {

        return birthDate;
    }

    public String getAddress() {

        return address;
    }

    public Sex getSex() {
        return sex;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getBirthDate() != person.getBirthDate()) return false;
        if (getFirstName() != null ? !getFirstName().equals(person.getFirstName()) : person.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(person.getLastName()) : person.getLastName() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(person.getAddress()) : person.getAddress() != null)
            return false;
        return getSex() == person.getSex();

    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + getBirthDate();
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Client :" + firstName +
                " " + lastName  +
                ", brithDate: " + birthDate +
                ", address: " + address +
                ", (" + sex + ")" ;
    }
    public String toStringName(){

        return "Client: " + firstName + " " + lastName;
    }
}

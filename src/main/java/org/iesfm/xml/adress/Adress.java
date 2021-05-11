package org.iesfm.xml.adress;

import java.util.Objects;

public class Adress {
    private String street;
    private int number;
    private String door;
    private String city;

    public Adress(String street, int number, String door, String city) {
        this.street = street;
        this.number = number;
        this.door = door;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return number == adress.number && Objects.equals(street, adress.street) && Objects.equals(door, adress.door) && Objects.equals(city, adress.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, door, city);
    }

    @Override
    public String toString() {
        return "org.iesfm.xml.animals.Adress{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", door='" + door + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

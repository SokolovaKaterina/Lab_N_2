package com.university.domain;

public class Organisation {
    String name = "";
    String address = "";
    private Employee head;

    public Organisation() {}
    public Organisation(String name, String address, Employee head) {
        this.name = name;
        this.address = address;
        this.head = head;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public void setHead(Employee head) { this.head = head; }
    public void updateRecordOrganisation(Organisation organisation) {
        this.name = organisation.name;
        this.address = organisation.address;
        this.head = organisation.head;
    }

    @Override
    public String toString() {
        return "\nName: '" + this.name +
                ", address='" + this.address +
                ", head=" + this.head + ";";
    }

    public Employee getHead() {
        return null;
    }
}
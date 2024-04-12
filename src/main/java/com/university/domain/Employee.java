package com.university.domain;

public class Employee {
    int id = 0;
    private static int instances = 0;
    String FIO = "";
    String address = "";
    String department = "";
    String dateBirth = "";
    String post = "";
    private Organisation branch;

    public Employee() {}
    public Employee(String fio, String address, String department, String dateBirth, String post) {
        this.id = instances;
        this.FIO = fio;
        this.address = address;
        this.department = department;
        this.dateBirth = dateBirth;
        this.post = post;
        this.branch = branch;
        instances++;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDateBirth() {
        return dateBirth;
    }
    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getFIO() {
        return FIO;
    }
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public void setBranch(Organisation branch) { this.branch = branch; }

    public void updateRecordEmployee(Employee updatedEntity) {
        this.FIO = updatedEntity.FIO;
        this.address = updatedEntity.address;
        this.post = updatedEntity.post;
        this.dateBirth = updatedEntity.dateBirth;
        this.department = updatedEntity.department;
    }
    public String toString() {
        return "\nId: " + this.id +
                ", FIO: " + this.FIO +
                ", Address: " + this.address +
                ", Post: " + this.post +
                ", DateBirth: " + this.dateBirth +
                ", Department: " + this.department + ";";
    }
}

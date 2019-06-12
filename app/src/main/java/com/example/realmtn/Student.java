package com.example.realmtn;

import io.realm.RealmObject;

public class Student extends RealmObject {
    private int Reg;
    private String FirstName;
    private String LastName;

    public Student() {
    }

    public int getReg() {
        return Reg;
    }

    public void setReg(int reg) {
        Reg = reg;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
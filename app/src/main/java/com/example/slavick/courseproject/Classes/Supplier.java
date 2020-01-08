package com.example.slavick.courseproject.Classes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Supplier {

    @PrimaryKey(autoGenerate = true)
    int srCode;
    String name;
    String address;
    String telephone;

    public Supplier(int srCode, String name, String address, String telephone) {
        this.srCode = srCode;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }
}

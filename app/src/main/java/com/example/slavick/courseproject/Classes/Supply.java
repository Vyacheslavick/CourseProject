package com.example.slavick.courseproject.Classes;

import android.arch.persistence.room.Entity;


@Entity
public class Supply {

    int detailCode;
    int srCode;
    int quantity;
    long date;

    public Supply(int detailCode, int srCode, int quantity, long date) {
        this.detailCode = detailCode;
        this.srCode = srCode;
        this.quantity = quantity;
        this.date = date;
    }
}

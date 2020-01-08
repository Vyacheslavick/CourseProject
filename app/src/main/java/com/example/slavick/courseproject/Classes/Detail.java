package com.example.slavick.courseproject.Classes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Detail {

    @PrimaryKey(autoGenerate = true)
    int detailCode;
    String detName;
    String vendor;
    int value;
    String note;
    String updates;

    public Detail(int detailCode, String detName, String vendor, int value, String note, String updates) {
        this.detailCode = detailCode;
        this.detName = detName;
        this.vendor = vendor;
        this.value = value;
        this.note = note;
        this.updates = updates;
    }
}

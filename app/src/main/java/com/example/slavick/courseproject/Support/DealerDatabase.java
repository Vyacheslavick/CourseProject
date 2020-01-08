package com.example.slavick.courseproject.Support;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.slavick.courseproject.Classes.Detail;
import com.example.slavick.courseproject.Classes.Supplier;
import com.example.slavick.courseproject.Classes.Supply;
import com.example.slavick.courseproject.Support.DealerDao;

@Database(entities = {Supplier.class, Supply.class, Detail.class}, version = 1)
public abstract class DealerDatabase extends RoomDatabase{
    public abstract DealerDao getDealerDao();
}

package com.example.slavick.courseproject.Support;

import android.app.Application;
import android.arch.persistence.room.Room;

public class App extends Application {
    public static App instance;
    private DealerDao dealerDao;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        DealerDatabase dealerDatabase = Room.databaseBuilder(getApplicationContext(), DealerDatabase.class, "database").allowMainThreadQueries().addMigrations().build();
        dealerDao = dealerDatabase.getDealerDao();
    }

    public static App getInstance() {
        return instance;
    }

    public DealerDao getDealerDao() {
        return dealerDao;
    }
}

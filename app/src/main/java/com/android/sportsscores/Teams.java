package com.android.sportsscores;

import java.util.UUID;

public class Teams {
    private UUID mId;
    private String mName;
    private int mWins;
    private int mLosses;

    public Teams() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getWins() {
        return mWins;
    }

    public void setWins(int wins) {
        mWins = wins;
    }

    public int getLosses() {
        return mLosses;
    }

    public void setLosses(int losses) {
        mLosses = losses;
    }
}

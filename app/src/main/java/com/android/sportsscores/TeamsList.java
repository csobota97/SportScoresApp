package com.android.sportsscores;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TeamsList {

    private static TeamsList sTeamsList;

    private List<Teams> mTeams;

    public List<Teams> getTeams() {
        return mTeams;
    }
}

package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWRoadhog extends OWHero {
    Double wholeHogKillsMostInGame;
    Double meleeFinalBlowsMostInGame;
    Double enemiesHooked;
    Double wholeHogKills;
    Double enemiesHookedMostInGame;
    Double hooksAttempted;
    Double hookAccuracyBestInGame;
    Double hookAccuracy;

    public OWRoadhog (Map stats) {
        super(stats);
        this.wholeHogKillsMostInGame = (Double)stats.get("whole_hog_kills_most_in_game");
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.enemiesHooked = (Double)stats.get("enemies_hooked");
        this.wholeHogKills = (Double)stats.get("whole_hog_kills");
        this.enemiesHookedMostInGame = (Double)stats.get("enemies_hooked_most_in_game");
        this.hooksAttempted = (Double)stats.get("hooks_attempted");
        this.hookAccuracyBestInGame = (Double)stats.get("hook_accuracy_best_in_game");
        this.hookAccuracy = (Double)stats.get("hook_accuracy");
    }
}

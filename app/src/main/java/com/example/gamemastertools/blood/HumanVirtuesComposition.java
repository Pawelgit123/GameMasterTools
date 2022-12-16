package com.example.gamemastertools.blood;

import java.util.Arrays;
import java.util.List;

public class HumanVirtuesComposition {

    final List<Integer> rankOneStats = Arrays.asList(0, 2, 2, 3, 3, 3);
    final List<Integer> rankTwoStats = Arrays.asList(0, 2, 2, 3, 3, 4);
    final List<Integer> rankThreeStats = Arrays.asList(0, 2, 3, 3, 3, 4);
    final List<Integer> rankFourStats = Arrays.asList(0, 2, 2, 3, 4, 4);
    final List<Integer> rankFiveStats = Arrays.asList(0, 2, 3, 3, 4, 5);
    final List<Integer> rankSixStats = Arrays.asList(0, 3, 3, 4, 5, 5);

    public HumanVirtuesComposition(){
    }

    public List<Integer> getRankOneStats() {
        return rankOneStats;
    }

    public List<Integer> getRankTwoStats() {
        return rankTwoStats;
    }

    public List<Integer> getRankThreeStats() {
        return rankThreeStats;
    }

    public List<Integer> getRankFourStats() {
        return rankFourStats;
    }

    public List<Integer> getRankFiveStats() {
        return rankFiveStats;
    }

    public List<Integer> getRankSixStats() {
        return rankSixStats;
    }


}

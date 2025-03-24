package nivelIntermediario.enumExamples;

public class Missions {
    private String name;
    private RankMissions rank;

    // method to show more infos about missions and ranks
    public void showDetails() {
        System.out.println("Mission: " + name + " Rank: " + rank + " Description: " + rank.getDescription() + " Difficulty: " + rank.getDifficulty());
    }

    //constructor
    public Missions(String name, RankMissions rank) {
        this.name = name;
        this.rank = rank;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankMissions getRank() {
        return rank;
    }

    public void setRank(RankMissions rank) {
        this.rank = rank;
    }
}

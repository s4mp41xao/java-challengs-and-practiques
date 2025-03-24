package nivelIntermediario.enumExamples;

public enum RankMissions {
    D("Low", 0),
    C("Moderated", 1),
    B("Comfortable", 2),
    A("Hard", 3),
    S("Very High", 4);

    private String description;
    private int difficulty;

    // constructors
    RankMissions(String description, int difficulty) {
        this.description = description;
        this.difficulty = difficulty;
    }

    // getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}

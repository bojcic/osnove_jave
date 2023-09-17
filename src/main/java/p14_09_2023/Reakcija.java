package p14_09_2023;

public class Reakcija {
    private String reactionType;
    private String reactFullName;


    public Reakcija(String reactionType, String reactFullName) {
        this.reactionType = reactionType;
        this.reactFullName = reactFullName;
    }

    public String getReactionType() {
        return reactionType;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }

    public String getReactFullName() {
        return reactFullName;
    }

    public void setReactFullName(String reactFullName) {
        this.reactFullName = reactFullName;
    }
}

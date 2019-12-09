package question1.sport;

public class Sport {
    private String sportName;
    private int teamSize;

    public Sport(String sportName, int teamSize) {
        this.sportName = sportName;
        this.teamSize = teamSize;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString(){
        return "Sport Name "+this.sportName+" Team Size "+this.teamSize;
    }
}

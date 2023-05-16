public class Coach extends Person{
    private String coachingCard;
    private String teamName;
    private int teamCode;

    public String getCoachingCard(){
        return coachingCard;
    }

    public String getTeamName(){
        return teamName;
    }

    public int getTeamCode(){
        return teamCode;
    }

    public void setCoachingCard(String coachingCard){
        this.coachingCard = coachingCard;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public void setTeamCode(int teamCode){
        this.teamCode = teamCode;
    }
}

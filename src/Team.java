import java.util.ArrayList;
public class Team {
    Player [] players = new Player[11];

    Coach coach = new Coach();

    public Player [] getPlayers(){
        return players;
    }
    public Coach getCoach() {
        return coach;
    }
}

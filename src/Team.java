public class Team {
    Player [] players = new Player[11];

    Coach coach = new Coach();


    public Player [] getPlayers() {
        for (int i = 0; i < players.length; i ++){
            players[i] = new Player();
        }
        return players;
    }

    public Coach getCoach() {
        return coach;
    }
}

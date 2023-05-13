public class Team {
    public static void main(String[] args){
        Player [] players = new Player[11];
        Coach coach = new Coach();


        for(int i = 0; i < players.length ; i++){
            players[i] = new Player();
            players[i].readInfo();
            players[i].readPosition();
        }

        coach.readInfo();
        coach.readCoachInfo();

    }
}

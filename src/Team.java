public class Team {
    public static void main(String[] args){
        Player [] players = new Player[11];
        Coach [] coach = new Coach[1];

        public void readTeamInfo(){
            for(int i = 0; i < players.length ; i++){
                players[i] = new Player();
                players[i].readInfo();
                players[i].readPosition();
            }
        }

        coach[0] = new Coach();
        coach[0].readInfo();
        coach[0].readCoachInfo();
    }


}

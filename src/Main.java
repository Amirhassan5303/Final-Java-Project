import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    static Scanner console = new Scanner(System.in);


    public static void main(String[] args) {
        Team [] teams = new Team[16];
        for (int i = 0; i < teams.length; i++){
            teams[i] = new Team();
            teams[i] = null;
        }

        displayMenu();

    }

    private static void displayMenu(){
        while(true){
            System.out.println("Enter one of the following option: ");
            System.out.println("Add Team (Press 1)");


            System.out.println("Enter a number:  ");
            int command = console.nextInt();
            switch(command){
                case 1 :
                    addTeam();
                    break;
            }
        }




    }

    private static void addTeam(){
        Player [] players = new Player[11];
        for (int i = 1; i <= players.length; i++){
            players[i] = new Player();
            System.out.print("Enter player " + i + " name: " );
            String name = console.next();
            players[i].setName(name);
            System.out.print("Enter player " + i + " last name: ");
            String lastName = console.next();
            players[i].setLastName(lastName);
            System.out.print("Enter player " + i + " birth date: (Year, Month, Day)");
            LocalDate birthDate = LocalDate.of(console.nextInt(), console.nextInt(), console.nextInt());
            players[i].setBirthDate(birthDate);
            System.out.print("Enter player " + i + " national Id: ");
            int nationalId = console.nextInt();
            players[i].setNationalId(nationalId);
            System.out.print("Enter player " + i + " position: ");
            String position = console.next();
            players[i].setPosition(position);
        }
        Coach coach = new Coach();
        System.out.print("Enter coach name: ");
        String name = console.next();
        coach.setName(name);
        System.out.print("Enter coach last name: ");
        String lastName = console.next();
        coach.setLastName(lastName);
        System.out.print("Enter coach national ID: ");
        int nationalId = console.nextInt();
        coach.setNationalId(nationalId);
        System.out.print("Enter coach birth date: (Year, Month, Day)");
        LocalDate birthDate = LocalDate.of(console.nextInt(), console.nextInt(), console.nextInt());
        coach.setBirthDate(birthDate);
        System.out.print("Enter type of coaching card: ");
        String coachingCard = console.next();
        coach.setCoachingCard(coachingCard);
        System.out.print("Enter team name: ");
        String teamName = console.next();
        coach.setTeamName(teamName);
        System.out.print("Enter team code: ");
        int teamCode = console.nextInt();
        coach.setTeamCode(teamCode);
    }

}
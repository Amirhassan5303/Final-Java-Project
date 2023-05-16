import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner console = new Scanner(System.in);
    static Team [] teams = new Team[16];

    public static void main(String[] args) {

        displayMenu();

    }

    private static void displayMenu(){
        while(true){
            System.out.println("Enter one of the following option: ");
            System.out.println("Add Team (Press 1)");
            System.out.println("Display information of all teams (Press 2)");
            System.out.println("Display team information by team code (Press 3)");
            System.out.println("Enter the national ID of the coach to see him/her team (Press 4)");
            System.out.println("Enter the national ID of the player to see him/her team (Press 5)");
            System.out.println("Show player with name ali (Press 6)");
            System.out.println("Show players older than 30 (Press 7");
            System.out.println("Enter a number:  ");
            int command = console.nextInt();
            switch(command){
                case 1 :
                    addTeam();
                    break;

                case 2:
                    displayAllTeamsInformation();
                    break;

                case 3:
                    displayTeamInformationByTeamCode();
                    break;

                case 4:
                    showCoachTeamByNationalId();
                    break;

                case 5:
                    showPlayerTeamByNationalId();
                    break;

                case 6:
                    showPlayersWithNameAli();
                    break;

                case 7:
                    displayPlayersOlderThanThirty();
                    break;
            }
        }




    }

    private static void addTeam() {

        for (int i = 0; i < teams.length; i++) {
            teams[i] = new Team();
            System.out.println("Add information for team " + (i + 1));

            for (int j = 0; j < 2; j++) {
                teams[i].players[j] = new Player();
                System.out.print("Enter player " + (j + 1) + " name: ");
                String name = console.next();
                teams[i].players[j].setName(name);
                System.out.print("Enter player " + (j + 1) + " last name: ");
                String lastName = console.next();
                teams[i].players[j].setLastName(lastName);
                System.out.println("Enter player " + (j + 1) + " birth date: (Year, Month, Day)");
                LocalDate birthDate = LocalDate.of(console.nextInt(), console.nextInt(), console.nextInt());
                teams[i].players[j].setBirthDate(birthDate);
                System.out.print("Enter player " + (j + 1) + " national Id: ");
                int nationalId = console.nextInt();
                teams[i].players[j].setNationalId(nationalId);
                System.out.print("Enter player " + (j + 1) + " position: ");
                String position = console.next();
                teams[i].players[j].setPosition(position);
            }

            System.out.print("Enter coach name: ");
            String name = console.next();
            teams[i].getCoach().setName(name);
            System.out.print("Enter coach last name: ");
            String lastName = console.next();
            teams[i].getCoach().setLastName(lastName);
            System.out.print("Enter coach national ID: ");
            int nationalId = console.nextInt();
            teams[i].getCoach().setNationalId(nationalId);
            System.out.println("Enter coach birth date: (Year, Month, Day)");
            LocalDate birthDate = LocalDate.of(console.nextInt(), console.nextInt(), console.nextInt());
            teams[i].getCoach().setBirthDate(birthDate);
            System.out.print("Enter type of coaching card: ");
            String coachingCard = console.next();
            teams[i].getCoach().setCoachingCard(coachingCard);
            System.out.print("Enter team name: ");
            String teamName = console.next();
            teams[i].getCoach().setTeamName(teamName);
            System.out.print("Enter team code: ");
            int teamCode = console.nextInt();
            teams[i].getCoach().setTeamCode(teamCode);
            System.out.println("Do you want to add another team? if so enter (yes) otherwise enter (no)");
            String option = console.next();
            if (option.equals("yes")){
                continue;
            }
            else break;
        }
    }

    private static void displayAllTeamsInformation(){
        for (int i = 0; i < teams.length; i++){
            if (teams[i] != null){
                System.out.println("Display information for team number " + (i + 1) + " :");
                System.out.println("Coach name: " + teams[i].getCoach().getName());
                System.out.println("Coach last name: " + teams[i].getCoach().getLastName());
                System.out.println("Coach national ID: " + teams[i].getCoach().getNationalId());
                System.out.println("Coach birth date: " + teams[i].getCoach().getBirthDate());
                System.out.println("Type of coaching card: " + teams[i].getCoach().getCoachingCard());
                System.out.println("Team name: " + teams[i].getCoach().getTeamName());
                System.out.println("Team code: " + teams[i].getCoach().getTeamCode());

                for (int j = 0; j < 2; j++){
                    System.out.println("Player " + (j + 1) + " name: " + teams[i].players[j].getName());
                    System.out.println("Player " + (j + 1) + " last name: " + teams[i].players[j].getLastName());
                    System.out.println("Player " + (j + 1) + " birth date: " + teams[i].players[j].getBirthDate());
                    System.out.println("Player " + (j + 1) + " national ID: " + teams[i].players[j].getNationalId());
                    System.out.println("Player " + (j + 1) + " position: " + teams[i].players[j].getPosition());
                    }
                }
            else {
                System.out.println("You should first add team information");
                displayMenu();
            }
        }
    }

    private static void displayTeamInformationByTeamCode(){
        System.out.print("To display team information enter team code: ");
        int teamCode =  console.nextInt();
        for (int i = 0; i < teams.length; i++){
            if (teams[i] != null){
                if (teams[i].getCoach().getTeamCode() == teamCode){
                    System.out.println("Display information for team number " + (i + 1) + " :");
                    System.out.println("Coach name: " + teams[i].getCoach().getName());
                    System.out.println("Coach last name: " + teams[i].getCoach().getLastName());
                    System.out.println("Coach national ID: " + teams[i].getCoach().getNationalId());
                    System.out.println("Coach birth date: " + teams[i].getCoach().getBirthDate());
                    System.out.println("Type of coaching card: " + teams[i].getCoach().getCoachingCard());
                    System.out.println("Team name: " + teams[i].getCoach().getTeamName());
                    System.out.println("Team code: " + teams[i].getCoach().getTeamCode());

                    for (int j = 0; j < 2; j++){
                        System.out.println("Player " + (j + 1) + " name: " + teams[i].players[j].getName());
                        System.out.println("Player " + (j + 1) + " last name: " + teams[i].players[j].getLastName());
                        System.out.println("Player " + (j + 1) + " birth date: " + teams[i].players[j].getBirthDate());
                        System.out.println("Player " + (j + 1) + " national ID: " + teams[i].players[j].getNationalId());
                        System.out.println("Player " + (j + 1) + " position: " + teams[i].players[j].getPosition());
                    }
                }
            }
        }
    }

    private static void showCoachTeamByNationalId(){
        System.out.print("Enter coach national id: ");
        int nationalId = console.nextInt();
        for (int i = 0 ; i < teams.length; i++){
            if (teams[i] != null){
                if (teams[i].getCoach().getNationalId() == nationalId){
                    System.out.println("The coach team is: " + teams[i].getCoach().getTeamName());
                }
            }
        }
    }

    private static void showPlayerTeamByNationalId(){
        System.out.print("Enter player national id: ");
        int nationalId = console.nextInt();
        for (int i = 0; i < teams.length; i++){
            if (teams[i] != null){
                for (int j = 0; j < 2; j++){
                    if (teams[i].players[j].getNationalId() == nationalId){
                        System.out.println("The player team name is: " + teams[i].getCoach().getTeamName());
                    }
                }
            }
        }
    }

    private static void showPlayersWithNameAli(){
        for (int i = 0; i < teams.length; i++){
            if (teams[i] != null){
                for (int j = 0; j < 2; j++){
                    if(teams[i].players[j].getName().equalsIgnoreCase("ali")){
                        System.out.println(teams[i].players[j].getName() + " " + teams[i].players[j].getLastName());
                    }
                }
            }
        }
    }

    private static void displayPlayersOlderThanThirty(){
        LocalDate birthDate;
        LocalDate date = LocalDate.of(1402, 01, 01);
        for (int i = 0; i < teams.length; i++){
            if (teams[i] != null){
                for (int j = 0; j < 2; j++){
                    birthDate =teams[i].players[j].getBirthDate();
                    long yearsBetween = ChronoUnit.YEARS.between(birthDate, date);
                    if (yearsBetween > 30){
                        System.out.println(teams[i].players[j].getName() + " is older than 30");
                    }
                }
            }
        }
    }
}

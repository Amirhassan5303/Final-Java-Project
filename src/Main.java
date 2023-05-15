import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    static Scanner console = new Scanner(System.in);


    public static void main(String[] args) {


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

    private static void addTeam() {
        String option;
        Team [] teams = new Team[16];

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
            option = console.next();
            if (option == "yes"){
                continue;
            }
            else if (option == "no"){
                break;
            }
        }
        displayMenu();
    }
}
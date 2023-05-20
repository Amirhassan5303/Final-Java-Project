/* author: AmirHassan Usefi Mansour
   Student ID: 400993072
   Instructor: Mr.PourAmini
   University: PNU
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    static Scanner console = new Scanner(System.in);
    static Team[] teams = new Team[16];

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter one of the following option: ");
            System.out.println();
            System.out.println("1- Add Team");
            System.out.println("2- Display information of all teams");
            System.out.println("3- Display team information by team code");
            System.out.println("4- Enter the national ID of the coach to see him/her team");
            System.out.println("5- Enter the national ID of the player to see him/her team");
            System.out.println("6- Show player with name ali");
            System.out.println("7- Show players older than 30");
            System.out.println("8- Exit (Press 8)");
            System.out.println("Enter number  ");
            int command = console.nextInt();
            switch (command) {
                case 1:
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

                case 8:
                    flag = false;
                    System.out.println("Good Luck And thank you for choosing us!!!");
            }
        }
    }


    private static void addTeam() {
        Scanner console = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < teams.length; i++) {
            teams[i] = new Team();
            System.out.println("Add information for team " + (i + 1));

            for (int j = 0; j < 5; j++) {
                teams[i].players[j] = new Player();
                System.out.println("Enter player " + (j + 1) + " information:");

                String name = readInput(console, "Name");
                String lastName = readInput(console, "Last name");
                LocalDate birthDate = readLocalDate(console, "Birth date (Year-Month-Day)");
                int nationalId = readInteger(console, "National ID");
                String position = readInput(console, "Position");

                teams[i].players[j].setName(name);
                teams[i].players[j].setLastName(lastName);
                teams[i].players[j].setBirthDate(birthDate);
                teams[i].players[j].setNationalId(nationalId);
                teams[i].players[j].setPosition(position);
            }

            System.out.println("Enter coach information:");

            String name = readInput(console, "Name");
            String lastName = readInput(console, "Last name");
            int nationalId = readInteger(console, "National ID");
            LocalDate birthDate = readLocalDate(console, "Birth date (Year-Month-Day)");
            String coachingCard = readInput(console, "Type of coaching card");
            String teamName = readInput(console, "Team name");
            int teamCode = readInteger(console, "Team code");

            teams[i].getCoach().setName(name);
            teams[i].getCoach().setLastName(lastName);
            teams[i].getCoach().setNationalId(nationalId);
            teams[i].getCoach().setBirthDate(birthDate);
            teams[i].getCoach().setCoachingCard(coachingCard);
            teams[i].getCoach().setTeamName(teamName);
            teams[i].getCoach().setTeamCode(teamCode);

            System.out.println("Do you want to add another team? if so enter (yes) otherwise enter (no)");
            String option = console.next();
            if (!option.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }

    private static String readInput(Scanner console, String prompt) {
        System.out.print("Enter " + prompt + ": ");
        return console.next();
    }

    private static int readInteger(Scanner console, String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readInput(console, prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for " + prompt + ". Please enter a valid integer.");
            }
        }
    }

    private static LocalDate readLocalDate(Scanner console, String prompt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (true) {
            try {
                return LocalDate.parse(readInput(console, prompt), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid input for " + prompt + ". Please enter a valid date in the format (Year-Month-Day).");
            }
        }
    }


    private static void displayAllTeamsInformation(){
        if (teams[0] == null){
            System.out.println("You should first add team information");
            System.out.println();
            return;
        }
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] != null) {
                System.out.println("Display information for team number " + (i + 1) + " :");
                System.out.println("Coach name: " + teams[i].getCoach().getName());
                System.out.println("Coach last name: " + teams[i].getCoach().getLastName());
                System.out.println("Coach national ID: " + teams[i].getCoach().getNationalId());
                System.out.println("Coach birth date: " + teams[i].getCoach().getBirthDate());
                System.out.println("Type of coaching card: " + teams[i].getCoach().getCoachingCard());
                System.out.println("Team name: " + teams[i].getCoach().getTeamName());
                System.out.println("Team code: " + teams[i].getCoach().getTeamCode());

                for (int j = 0; j < 5; j++) {
                    System.out.println("Player " + (j + 1) + " name: " + teams[i].players[j].getName());
                    System.out.println("Player " + (j + 1) + " last name: " + teams[i].players[j].getLastName());
                    System.out.println("Player " + (j + 1) + " birth date: " + teams[i].players[j].getBirthDate());
                    System.out.println("Player " + (j + 1) + " national ID: " + teams[i].players[j].getNationalId());
                    System.out.println("Player " + (j + 1) + " position: " + teams[i].players[j].getPosition());
                }
            }
        }
        System.out.println();
    }


    private static void displayTeamInformationByTeamCode(){
        if (teams[0] == null){
            System.out.println("There is no team in database! You should first add team");
            System.out.println();
            return;
        }
        System.out.print("To display team information enter team code: ");
        int teamCode = console.nextInt();
        boolean found = false;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] != null) {
                if (teams[i].getCoach().getTeamCode() == teamCode) {
                    System.out.println("Display information for team number " + (i + 1) + " :");
                    System.out.println("Coach name: " + teams[i].getCoach().getName());
                    System.out.println("Coach last name: " + teams[i].getCoach().getLastName());
                    System.out.println("Coach national ID: " + teams[i].getCoach().getNationalId());
                    System.out.println("Coach birth date: " + teams[i].getCoach().getBirthDate());
                    System.out.println("Type of coaching card: " + teams[i].getCoach().getCoachingCard());
                    System.out.println("Team name: " + teams[i].getCoach().getTeamName());
                    System.out.println("Team code: " + teams[i].getCoach().getTeamCode());

                    for (int j = 0; j < 5; j++) {
                        System.out.println("Player " + (j + 1) + " name: " + teams[i].players[j].getName());
                        System.out.println("Player " + (j + 1) + " last name: " + teams[i].players[j].getLastName());
                        System.out.println("Player " + (j + 1) + " birth date: " + teams[i].players[j].getBirthDate());
                        System.out.println("Player " + (j + 1) + " national ID: " + teams[i].players[j].getNationalId());
                        System.out.println("Player " + (j + 1) + " position: " + teams[i].players[j].getPosition());
                    }
                    System.out.println();
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No team matches this code!!!");
            System.out.println();
        }
    }


    private static void showCoachTeamByNationalId() {
        if (teams[0] == null) {
            System.out.println("There is no team in database! You should first add team");
            System.out.println();
            return;
        }
        System.out.print("Enter coach national id: ");
        int nationalId = console.nextInt();
        boolean found = false;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] != null && teams[i].getCoach().getNationalId() == nationalId) {
                System.out.println("The coach team is: " + teams[i].getCoach().getTeamName());
                found = true;
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("No coach matches this national Id!!!");
            System.out.println();
        }
    }


    private static void showPlayerTeamByNationalId(){
        if (teams[0] == null){
            System.out.println("There is no team in database! You should first add team");
            System.out.println();
            return;
        }
        System.out.print("Enter player national id: ");
        int nationalId = console.nextInt();
        boolean found = false;
        for (int i = 0; i < teams.length; i++){
            for (int j = 0; j < 5; j++){
                if (teams[i] != null && teams[i].players[j].getNationalId() == nationalId){
                    System.out.println("The player team name is: " + teams[i].getCoach().getTeamName());
                    found = true;
                    System.out.println();
                }
            }
        }
        if (!found){
            System.out.println("No player matches this national Id!!!");
            System.out.println();
        }
    }


    private static void showPlayersWithNameAli() {
        if (teams[0] == null) {
            System.out.println("There is no team in database! You should first add team");
            System.out.println();
            return;
        }
        boolean found = false;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] != null) {
                for (int j = 0; j < 5; j++) {
                    if (teams[i].players[j].getName().equalsIgnoreCase("ali")) {
                        System.out.println(teams[i].players[j].getName() + " " + teams[i].players[j].getLastName());
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("There is no player with name Ali!!!");
            System.out.println();
        }
    }


    private static void displayPlayersOlderThanThirty() {
        LocalDate birthDate;
        LocalDate date = LocalDate.of(1402, 01, 01);
        if (teams[0] == null) {
            System.out.println("There is no team in database! You should first add team");
            System.out.println();
            return;
        }
        boolean found = false;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] != null) {
                for (int j = 0; j < 5; j++) {
                    birthDate = teams[i].players[j].getBirthDate();
                    long yearsBetween = ChronoUnit.YEARS.between(birthDate, date);
                    if (yearsBetween > 30) {
                        System.out.println(teams[i].players[j].getName() + " is older than 30");
                        found = true;
                    }
                }
            }
        }
        if(!found){
            System.out.println("There is no player older than 30!!!");
            System.out.println();
        }
    }
}
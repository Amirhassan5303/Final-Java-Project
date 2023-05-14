import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner console = new Scanner(System.in);


    public static void main(String[] args) {
        Team [] teams = new Team[16];
        for (int i = 0; i < teams.length; i++){
            teams[i] = new Team();
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
        for (int i = 0; i < players.length; i++){
            players[i] = new Player();
            System.out.println("Enter player " + i + 1  + " name: " );
            String name = console.next();
            players[i].setName(name);
            System.out.println("Enter last name: ");
            String lastName = console.next();
            players[i].setLastName(lastName);
            System.out.println("Enter birth date: ");
            int birthDate = console.nextInt();
            players[i].setBirthDate(birthDate);
            System.out.println("Enter national Id: ");
            int nationalId = console.nextInt();
            players[i].setNationalId(nationalId);
            System.out.println("Enter position: ");
            String position = console.next();
            players[i].setPosition(position);
        }




    }

}
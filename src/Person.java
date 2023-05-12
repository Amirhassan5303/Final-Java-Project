import java.util.Scanner;
public class Person {
    static Scanner console = new Scanner(System.in);
    private String name;
    private String lastName;
    private int nationalId;
    private int birthDate;

    public void readInfo(){
        System.out.print("Enter name: ");
        name = console.next();
        System.out.print("Enter last name: ");
        lastName = console.next();
        System.out.print("Enter national ID: ");
        nationalId = console.nextInt();
        System.out.print("Entre birth date: ");
        birthDate = console.nextInt();
    }

    public void showInfo(){
        System.out.println("name: " + name);
        System.out.println("last name: " + lastName);
        System.out.println("national ID: " + nationalId);
        System.out.println("birth date: " + birthDate);
    }

}

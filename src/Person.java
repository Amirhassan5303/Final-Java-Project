import java.util.Scanner;
public class Person {
    static Scanner console = new Scanner(System.in);
    private String name;
    private String lastName;
    private int nationalId;
    private int birthDate;

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public int getNationalId(){
        return nationalId;
    }

    public int getBirthDate(){
        return birthDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setNationalId(int nationalId){
        this.nationalId = nationalId;
    }

    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }








//    public void readInfo(){
//    System.out.print("Enter name: ");
//    name = console.next();
//    System.out.print("Enter last name: ");
//    lastName = console.next();
//    System.out.print("Enter national ID: ");
//    nationalId = console.nextInt();
//    System.out.print("Entre birth date: ");
//    birthDate = console.nextInt();
//}
//
//public void showInfo(){
//    System.out.println("name: " + name);
//    System.out.println("last name: " + lastName);
//    System.out.println("national ID: " + nationalId);
//    System.out.println("birth date: " + birthDate);
//}

}

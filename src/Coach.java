public class Coach extends Person{
    private String coachingCard;
    private String teamName;
    private int teamCode;

    public void readCoachInfo(){
        System.out.print("Enter type of coaching card: ");
        coachingCard = console.next();
        System.out.print("Enter team name: ");
        teamName = console.next();
        System.out.print("Enter team code: ");
        teamCode = console.nextInt();
    }

    public void showCoachInfo(){
        System.out.println("Type of coaching card is: " + coachingCard);
        System.out.println("Team name is: " + teamName);
        System.out.println("Team code is: :" + teamCode);
    }
}

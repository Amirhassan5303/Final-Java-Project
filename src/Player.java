public class Player extends Person {
    private String position;

    public void readPosition(){
        System.out.print("Enter player position: ");
        position = console.next();
    }

    public void showPosition(){
        System.out.println("The player position is: " + position);
    }
}

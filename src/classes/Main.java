package classes;

public class Main {
    public static void main(String[] args) {
        Timer Timer1 = new Timer(() -> System.out.println("Action1"), 5000);
        Timer Timer2 = new Timer(() -> System.out.println("Action2"), 5000);
        Timer Timer3 = new Timer(() -> System.out.println("Action3"), 5000);
        Timer Timer4 = new Timer(() -> System.out.println("Action4"), 5000);

        Timer1.start();
        Timer2.start();
        Timer3.start();
        Timer4.start();

        //Timer1.start(() -> System.out.println("Action"), 5000);
        //Timer2.start(() -> System.out.println("Action"), 5000);
        //Timer3.start(() -> System.out.println("Action"), 5000);
        //Timer4.start(() -> System.out.println("Action"), 5000);
    }
}
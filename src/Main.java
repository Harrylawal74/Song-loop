import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initiate 'repeat' variable as true
        boolean repeat = true;

        //loops while 'repeat' condition is true
        while (repeat) {
            System.out.println("Playing starry night");
            System.out.println("Would you like the song to repeat after it finishes: Yes or No");

            //asks user if they want to play the song
            // again and stores input under variable 'userChoice'
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();

            //changes value of 'repeat' based on 'userChoice'
            //use toLowerCase() to stop case sensitivity
            if (userChoice.toLowerCase().equals("no")) {
                repeat = false;
            }
        }
        //once the while loop stop condition has been met the next song will play
        System.out.println("Playing next song");
    }
}
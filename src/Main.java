import java.util.Random;
import java.util.Scanner;

public class Main {
    private final int number;
    public Main() {
        Random random = new Random();
        number = random.nextInt(100)+1;
    }

    public static void main(String[] args) {
        playGame();
    }
    public static void playGame(){
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        int guess;
        boolean flag = true;
        int limit = 5;
        System.out.println("""
                Welcome to Guess Number Game
                You Will Be Asked to Guess A Number To Win The Game
                You have Maximum 5 Attempt Limit""");
        while (limit -->0 && flag){
            System.out.println("Enter the number number between 1 to 100 :");
            guess =scan.nextInt();
            if(guess == main.number){
                flag = false;
            }
            else if(guess > main.number){
                System.out.println("You Guessed Number is Greater");
            }else{
                System.out.println("You Guessed Number is Lower");
            }
        }
        if(!flag){
            System.out.println("OOhOO! Your Number is Correct. You win the game");
        }else{
            System.out.println("Oops You loose!");
        }
    }
}
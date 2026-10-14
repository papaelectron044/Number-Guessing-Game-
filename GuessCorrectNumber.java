import java.util.*;
public class GuessCorrectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(100)+1;

        int guess=0;
        int attempt=0;

        while (guess != number) {
                System.out.println("Guess the Number Between 1 to 100");
                guess=sc.nextInt();
                attempt++;

                if(guess > number){
                    System.out.println("Too High! , try Lower!");
                }else if (guess < number) {
                    System.out.println("Too Low! , try higher!");

                }else{
                    System.out.println("Congratulation!! You Guess The Number");
                    System.out.println("You Guess The Correct Number : "+number);
                    System.out.println("Number Of Attempt "+ attempt);
                    break;
                }
        }
        sc.close();
    }
    
}
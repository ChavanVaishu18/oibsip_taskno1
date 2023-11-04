import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException 
    {
        int i = 0;
        String yes = "yes";
        String no = "no";

        while (i < 10) 
        {
            int lowerBound = 1;
            int upperBound = 100;
            int maxAttempts = 10;
            int score = 0;
            int level = 0;

            Random random = new Random();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int target = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

            for (int round = 1; round <= maxAttempts; round++) 
            {
                System.out.println("Guess the number between 1 and 100:");
                int guess = Integer.parseInt(br.readLine());

                if (guess == target)
                {
                    score += round;    // Award points based on the number of attempts
                    System.out.println("Congratulations! You guessed it!");
                    break;
                } 
                else if (guess < target) 
                {
                    System.out.println("Try a higher number.");
                } 
                else
                {
                    System.out.println("Try a lower number.");
                }
            }

            System.out.println("Your score: " + score);
            System.out.println("Level Completed: " + level);

            if (score == 0) 
            {
                break;
            }
            else 
            {
                level++; // Increment the level
                System.out.println("Level Started: " + level);
            }

            System.out.println("Do you want to play? Type 'yes' or 'no':");
            String ans = br.readLine();

            if (ans.equals(no))
            {
                break;
            }
            else if (ans.equals(yes))
            {
                continue;
            }
        }

        // Close the BufferedReader and release resources
        //br.close();
    }
}
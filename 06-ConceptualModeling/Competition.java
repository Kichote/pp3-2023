import java.util.ArrayList;
import java.util.Arrays;

/* 
 * 14.	Competitors are judged by five judges during the competition. 
 * Each judge can score 1, 2, 3, 4 or 5 points. 
 * Then, the highest score and the lowest score are thrown out. 
 * The arithmetic mean of the remaining three scores is calculated and this is the 
 * competitor's final result that is displayed. Create a class diagram for the 
 * competition scoring system. 
 * Define a class and write a program that calculates the final results for three players.
*/

public class Competition {

    public float finalScore(int score1, int score2, int score3, int score4, int score5) {
        float finalScore = 0;
        int biggestNumber = 0;
        int lowestNumber = score1;
        ArrayList<Integer> scores  = new ArrayList<Integer>();
        scores.add(score1);
        scores.add(score2);
        scores.add(score3);
        scores.add(score4);
        scores.add(score5);

        for(int i : scores) {
            if (i > biggestNumber) {
                biggestNumber = i;
            }

            if (i < lowestNumber) {
                lowestNumber = i;
            }
        }
        Integer lowest = lowestNumber;
        Integer biggest = biggestNumber;

        scores.remove(lowest);
        scores.remove(biggest);

        for(int i : scores) {
            finalScore += i;
        }
        return finalScore/3f;
    }

    public static void main(String[] args) {
        // Scores for three players
        int[][] playerScores = {
            { 3, 4, 5, 2, 3 },
            { 5, 1, 2, 4, 3 },
            { 4, 3, 2, 5, 4 }
        };

        for (int i = 0; i < playerScores.length; i++) {
            int[] scores = playerScores[i];

            double finalScore = calculateFinalScore(scores);

            System.out.println("Player " + (i + 1) + " Final Score: " + finalScore);
        }

        Competition competition = new Competition();

        System.out.println(competition.finalScore(1, 2, 3, 3, 4));
    }

    public static double calculateFinalScore(int[] scores) {
        if (scores.length != 5) {
            System.out.println("Invalid number of scores provided");
            return 0.0;
        }

        // Sort the scores
        Arrays.sort(scores);

        // Discard the lowest and highest scores
        int sum = 0;
        for (int i = 1; i < scores.length - 1; i++) {
            sum += scores[i];
        }

        // Calculate the average of remaining scores
        return sum / 3.0;
    }

}
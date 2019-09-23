package rabanal_p3;

import java.util.Scanner;

public class Survey {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] topics = {"Pizza", "Sub", "Pasta", "Salad", "Drink"};
		int[][] responses = new int[topics.length][10];
		
		boolean hasNextResponse = true;
		while (hasNextResponse) {
			for (int i = 0; i < topics.length; i++) {
				System.out.println("Please rate the following topic from 1 (least important) to 10 (most important).");
				System.out.println(topics[i] + ":");
				int rating = in.nextInt();
				responses[i][rating - 1]++;
			}
			
			System.out.println("Do you want to repeat the survey for another person to respond? (Y/N):");
			String repeat = in.next();
			
			if (repeat.equalsIgnoreCase("N")) {
				hasNextResponse = false;
			}
		}
		
		in.close();
		
		System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		
		int highestTotalPoints = 0;
		int highestTotalPointsIssue = 6;
		int lowestTotalPoints = 10000;
		int lowestTotalPointsIssue = 6;
		for (int i = 0; i < topics.length; i++) {
			System.out.print(topics[i]);
			
			int totalPoints = 0;
			int totalVotes = 0;
			for (int j = 0; j < responses[i].length; j++) {
				System.out.print("\t" + responses[i][j]);
				totalPoints += responses[i][j] * (j + 1);
				totalVotes += responses[i][j];
			}
			
			System.out.println("\tAverage: " + totalPoints / totalVotes);
			
			if (totalPoints > highestTotalPoints) {
				highestTotalPoints = totalPoints;
				highestTotalPointsIssue = i;
			}
			if (totalPoints < lowestTotalPoints) {
				lowestTotalPoints = totalPoints;
				lowestTotalPointsIssue = i;
			}
		}
		
		System.out.println("Highest total points:");
		System.out.println(topics[highestTotalPointsIssue]);
		System.out.println(highestTotalPoints);
		
		System.out.println("Lowest total points:");
		System.out.println(topics[lowestTotalPointsIssue]);
		System.out.println(lowestTotalPoints);
	}

}

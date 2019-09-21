import java.util.Scanner;
import java.util.Random;


public class Poll {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Random randGen = new Random();
		
		//String done = "NotDone";
		int numUsers = 10;
		int rating = 0;
		int curUser;
		int i;
		int numTopics = 5;
		float topicAvg = 0; 
				
	
		String[] topics = new String[numTopics];
		int[][] response = new int[numTopics][numUsers];
		int avg[] = new int[numTopics];
		
		
		topics[0] = "Topic 1";
		topics[1] = "Topic 2";
		topics[2] = "Topic 3";
		topics[3] = "Topic 4";
		topics[4] = "Topic 5";
		
				
		 //System.out.println(topics[0]);
		 
		 for (curUser = 1; curUser <= numUsers; curUser = curUser + 1) {
	      
			for (i = 0; i < numTopics; i = i + 1) {
				
			System.out.println("User " + curUser);	
		    System.out.println(topics[i]);
			 
			System.out.print("Rate this Topic: ");
 		 	rating = randGen.nextInt(10); //scnr.nextInt() ;
 		 	response [i][curUser-1] = rating;
 		 	
			}
 		 	
		 }
		 
		 
		 System.out.println("\n\n        |  User 1  |  User 2  |  User 3  |  User 4  |  User 5  |  User 6  |  User 7  |  User 8  |  User 9  |  User 10 |  Average");
		 
		 for (i = 0; i < 5; i = i + 1) {
			 
			 	System.out.print(topics[i]);
			 
			 for (curUser = 0; curUser < numUsers; curUser = curUser + 1) {
		 
				 System.out.print(" |    "+ response[i][curUser] + "    ");
				 
				 avg[i] = response[i][curUser];
				 topicAvg = topicAvg + avg[i];
				 
		 }
			 	topicAvg = topicAvg / numUsers;
			 System.out.print(" |     "+ topicAvg +"\n");
			 topicAvg = 0;
		 }
    

}
}


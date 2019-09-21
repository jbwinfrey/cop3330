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
		float bestTopic = 0;
		float worstTopic = 10;
		int bestTopicNum = 0;
		int worstTopicNum = 0;
	
		String[] topics = new String[numTopics];
		int[][] response = new int[numTopics][numUsers];
		int avg[] = new int[numTopics];
		
		
		topics[0] = "Music          ";
		topics[1] = "Video Games    ";
		topics[2] = "Social Media   ";
		topics[3] = "Televison Shows";
		topics[4] = "Books          ";
		
						 
		 for (curUser = 1; curUser <= numUsers; curUser = curUser + 1) {
	      
			for (i = 0; i < numTopics; i = i + 1) {
				
		    System.out.println("Topic: " + topics[i]);
			 
			System.out.print("User " + curUser + ": Please rate this Topic from 1 (least important) to 10 (most important): ");
 		 	rating =  scnr.nextInt() ;//randGen.nextInt(10)+1;
 		 	response [i][curUser-1] = rating;
 		 	
			}
 		 	
		 }
		 
		 
		 System.out.println("\n\n                |  User 1  |  User 2  |  User 3  |  User 4  |  User 5  |  User 6  |  User 7  |  User 8  |  User 9  |  User 10 |  Average");
		 
		 for (i = 0; i < 5; i = i + 1) {
			 
			 	System.out.print(topics[i]);
			 
			 for (curUser = 0; curUser < numUsers; curUser = curUser + 1) {
		 
				 System.out.print(" |    "+ response[i][curUser] + "    ");
				 
				 avg[i] = response[i][curUser];
				 topicAvg = topicAvg + avg[i];
				 
				
		 }
			 	topicAvg = topicAvg / numUsers;
			 	
			 	if(topicAvg > bestTopic) {
					 bestTopic = topicAvg;
					 bestTopicNum = i;
				 }
			 	if(topicAvg < worstTopic) {
			 		worstTopic = topicAvg;
			 		worstTopicNum = i;
			 	}
			 	
			 System.out.print(" |     "+ topicAvg +"\n");
			 topicAvg = 0;
		 }
		    
		 System.out.print("\nThe highest rated topic was "+ topics[bestTopicNum] + "\nThe average of this topic was " + bestTopic);
		 
		 System.out.print("\n\nThe lowest rated topic was "+ topics[worstTopicNum] + "\nThe average of this topic was " + worstTopic);
		 
}
	

}


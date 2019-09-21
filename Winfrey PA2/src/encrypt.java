import java.util.Scanner;

public class encrypt {
	 public static void main (String [] args) {
		 Scanner scnr = new Scanner(System.in);
		 
	     int v1;
	     int v2;
	     int v3;
	     int v4;
	     int v1tmp;
	     int v2tmp;
	     int v3tmp;
	     int v4tmp;
	     
	     System.out.println("Enter Data (Seperate Each Digit With Enter):");
	     
	     v1 = scnr.nextInt();    
	     v2 = scnr.nextInt();	     
	     v3 = scnr.nextInt();
	     v4 = scnr.nextInt();
	     	 
	     v1tmp = v1 + 7;
	     v2tmp = v2 + 7;
	     v3tmp = v3 + 7;
	     v4tmp = v4 + 7;
	     	     
	     v1tmp = v1tmp % 10;
	     v2tmp = v2tmp % 10;
	     v3tmp = v3tmp % 10;
	     v4tmp = v4tmp % 10;
	     	     
	     v1 = v3tmp;
	     v2 = v4tmp;
	     v3 = v1tmp;
	     v4 = v2tmp;
	     
	     System.out.println("Encrypted Value: " + v1 +" "+ v2 +" "+ v3 +" "+ v4);
  
	     
	     
	     
	 }

}

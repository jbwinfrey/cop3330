import java.util.Scanner;

public class decrypt {
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
	     
	     System.out.println("Enter Encrypted Value: ");
	     
	     v1 = scnr.nextInt();    
	     v2 = scnr.nextInt();	     
	     v3 = scnr.nextInt();
	     v4 = scnr.nextInt();
	     
	     v3tmp = v1;
	     v4tmp = v2;
	     v1tmp = v3;
	     v2tmp = v4;
	     
	    // System.out.println(v1tmp +""+ v2tmp +""+ v3tmp +""+ v4tmp);
	     
	     
	     if (v1tmp<7) {
	    	 v1 = v1tmp + 10 ;
	    	 }
	    	else {
	    	v1 = v1tmp;
	    	}
	        
	     if (v2tmp<7) {
	    	 v2 = v2tmp + 10 ;
	    	 }
	    	else {
	    	v2 = v2tmp;
	    	}
	     
	     if (v3tmp<7) {
	    	 v3 = v3tmp + 10 ;
	    	 }
	    	else {
	    	v3 = v3tmp;
	    	}
	     
	     if (v4tmp<7) {
	    	 v4 = v4tmp + 10 ;
	    	 }
	    	else {
	    	v4 = v4tmp;
	    	}
	      
	     	     
	   //  System.out.println(v1 +""+ v2 +""+ v3 +""+ v4);
	     
	     v1 = v1 - 7;
	     v2 = v2 - 7;
	     v3 = v3 - 7;
	     v4 = v4 - 7;
	     
	     

	     
	  //   System.out.println(v1tmp +""+ v2tmp +""+ v3tmp +""+ v4tmp);
	     
	    
	     
	    System.out.println("Original Value: " + v1 +" "+ v2 +" "+ v3 +" "+ v4);

	     
	     
	     
	     
	     
	     
	 }

}

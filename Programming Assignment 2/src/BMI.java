import java.util.Scanner;

public class BMI {

	 public static void main (String [] args) {
		 Scanner scnr = new Scanner(System.in);
		 
	     double weight;
	     double height;
	     double bmi = 0;
	     String unitType;
	     
	     System.out.print("Enter Unit Type('Imperial' or 'Metric'): ");
	     unitType = scnr.next(); 	     
	        
	     while (bmi == 0) {
	    	 if (unitType.equals("Imperial")) {
	    	 
	    		 System.out.print("Enter Weight in Pounds: ");
	    		 	weight = scnr.nextDouble(); 
		     
	    		 	System.out.print("Enter Height in Inches: ");
	    		 		height = scnr.nextDouble();
	    	 
	    		 bmi = (703*weight)/(height*height);
	    	 
	    	 }
	    	 else if (unitType.equals("Metric")){
	    	 
	    		System.out.print("Enter Weight in Kilos: ");
	    			weight = scnr.nextDouble(); 
	    			
	    		System.out.print("Enter Height Meters: ");
	   	         	height = scnr.nextDouble();
	    		 
	   	     	bmi = (weight)/(height*height);
	    	}
	    	else {
	    		System.out.print("Sorry I didn't get that! \nPlease type 'Imperial' or 'Metric': ");
	    		unitType = scnr.next();
	    			bmi=0;    		
	    	}
	 }
    
	     
	     System.out.println("\nYour BMI is: " + bmi);
	     
	     	/*   Underweight = <18.5
	    		 Normal weight = 18.5–24.9
	    		 Overweight = 25–29.9
	    		 Obesity = BMI of 30 or greater  */
	    		 
	  if (bmi < 18.5) {
         System.out.println("According to the National Heart Lung and Blood Institute you are: Underweight");
      }

      if (bmi >= 18.5 && bmi < 24.9) {
         System.out.println("According to the National Heart Lung and Blood Institute you are: Normal weight");
      }

      if (bmi >= 25 && bmi < 29.9) {
         System.out.println("According to the National Heart Lung and Blood Institute you are: Overweight");
      }

      if (bmi >= 30) {
         System.out.println("According to the National Heart Lung and Blood Institute you are: Obese");
      }
  

	    		
	    		
	     
	     
	     
	 }

}

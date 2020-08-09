import java.util.Scanner;

public class DNSValidator {
	 public static void main (String [ ] args) { 
	      Scanner scnr = new Scanner(System.in);
	      String coreGtld1;
	      String coreGtld2;
	      String coreGtld3;
	      String coreGtld4;
	      String inputName;
	      String searchName;
	      String theTld;
	      boolean isCoreGtld;
	      
	      int periodPosition;   // Position of the period in the domain name
	      int i;
	      int periodCounter;

	      coreGtld1 = ".com";
	      coreGtld2 = ".net";
	      coreGtld3 = ".org";
	      coreGtld4 = ".info";
	      theTld = "";
	      isCoreGtld = false;
	      periodPosition = 0;
	      periodCounter = 0;

	      System.out.println("\nEnter the next domain name (<Enter> to exit): ");
	      inputName = scnr.nextLine();

	      while (inputName.length() > 0) {
	    	  searchName = inputName.toLowerCase();
	        
	    	  
	         isCoreGtld = false;
	         
	         for (i = 0; i < searchName.length(); i++) {
	        	 if(searchName.charAt(i) == '.') {
	        		 periodCounter += 1;
	        		 periodPosition += i;
	        	 }
	         }
	         
	       
	         
	         System.out.println(periodCounter+""+periodPosition);
	         if(periodCounter == 1 && periodPosition != 0) {
	        	 theTld = searchName.substring(periodPosition, searchName.length());
	        	 System.out.println(theTld);
	         }

	        
	   
	         if (theTld.equals(coreGtld1)) {
	            isCoreGtld = true;
	         }
	         else if (theTld.equals(coreGtld2)) {
	            isCoreGtld = true;
	         }
	         else if (theTld.equals(coreGtld3)) {
	            isCoreGtld = true;
	         }
	         else if (theTld.equals(coreGtld4)) {
	            isCoreGtld = true;
	         }
	         else {
	            isCoreGtld = false;
	         }
	         
	         System.out.print("\"" + inputName + "\" ");
	         if (isCoreGtld) {
	            System.out.println("is a second-level domain followed by a core gTLD of \"" +
	                               theTld + "\"");
	         }
	         else {
	            System.out.println("is not a second-level domain followed by a core gTLD.");
	         }

	         System.out.println("\nEnter the next domain name (or <Enter> to exit): ");
	         inputName  = scnr.nextLine();
	      }
	      return;
	   } 
	}

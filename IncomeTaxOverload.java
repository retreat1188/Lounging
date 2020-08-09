import java.util.Scanner;

public class IncomeTaxOverload {
	 public static void main (String [] args) { 
	      final String PROMPT_SALARY = "\nEnter annual salary (-1 to exit)";
	      Scanner scnr = new Scanner(System.in);
	      int annualSalary;
	      double taxRate;
	      int taxToPay;
	      int i;

	     
	      int [] salaryRange = {   0,  20000, 50000, 100000,  Integer.MAX_VALUE };
	      double [] taxRates = { 0.0,   0.20,  0.30,   0.45,               0.45 };

	      // Access the related class
	      TaxTableTools table = new TaxTableTools();

	      // Get the first annual salary to process
	      annualSalary = table.getInteger(scnr, PROMPT_SALARY);

	      while (annualSalary >= 0) {
	         taxRate = table.getValue(annualSalary);
	         taxToPay= (int)(annualSalary * taxRate);     // Truncate tax to an integer amount
	         System.out.println("Annual Salary: " + annualSalary + 
	                            "\tTax rate: " + taxRate +
	                            "\tTax to pay: " + taxToPay);

	         // Get the next annual salary
	         annualSalary = table.getInteger(scnr, PROMPT_SALARY);
	      } 
	   } 
	} 


class TaxTableTools {

/** This class searches the 'search' table with a search argument and
    returns the corresponding value in the 'value' table. Variable
    'nEntries' has the number of entries in each table.
*/
private int [] search =   {   0, 20000, 50000, 100000,  Integer.MAX_VALUE };
private double [] value = { 0.0,  0.20,  0.30,   0.45,               0.45 };
private int nEntries;

// *********************************************************************** 

// Default constructor 

public TaxTableTools() {
   nEntries  = search.length;  // Set the length of the search table
} 

// *********************************************************************** 

// Overloaded constructor


public TaxTableTools(int[] search, double[] value) {
	this.nEntries = nEntries;
	this.search = search;
	this.value = value;
}

// *********************************************************************** 

// Method to prompt for and input an integer

public int getInteger(Scanner input, String prompt) {
   int inputValue = 0;
   
   System.out.println(prompt + ": ");
   inputValue = input.nextInt();
   
   return inputValue;
} 

// *********************************************************************** 

// Method to get a value from one table based on a range in the other table

public double getValue(int searchArgument) {
   double result;
   boolean keepLooking;
   int i;

   result = 0.0;
   keepLooking = true;
   i = 0;

   while ((i < nEntries) && keepLooking) {
      if (searchArgument <= search[i]) {
         result = value[i];
         keepLooking = false;
      }
      else {
         ++i;
      }
   } 

   return result;
	} 
}


import java.util.Scanner;

public class IncomeTaxClass {
	 // Method to prompt for and input an integer
	   public static int getInteger(Scanner input, String prompt) {
	      int inputValue;
	      
	      System.out.println(prompt + ": ");
	      inputValue = input.nextInt();
	      
	      return inputValue;
	   } // 

	   // *********************************************************************** 

	   public static void main (String [] args) { 
	      final String PROMPT_SALARY = "\nEnter annual salary (-1 to exit)";
	      Scanner scnr = new Scanner(System.in);
	      int annualSalary;
	      double taxRate;
	      int taxToPay;
	      int i;

	      int []    salary   = {   0,  20000, 50000, 100000, Integer.MAX_VALUE };
	      double [] taxTable = { 0.0,   0.15,  0.25,   0.35,              0.40 };

	     
	      TaxTableTools table = new TaxTableTools();
	      
	    
	      public void table.setTables(salary, taxTable);
	 
	      
	      // Get the first annual salary to process
	      annualSalary = getInteger(scnr, PROMPT_SALARY);

	      while (annualSalary >= 0) {
	         taxRate = table.getValue(annualSalary);
	         taxToPay= (int)(annualSalary * taxRate);     // Truncate tax to an integer amount
	         System.out.println("Annual Salary: " + annualSalary + 
	                            "\tTax rate: " + taxRate +
	                            "\tTax to pay: " + taxToPay);

	         // Get the next annual salary
	         annualSalary = getInteger(scnr, PROMPT_SALARY);
	      } 
	   } 
	} 

public class TaxTableTools {

	/**
	 * This class searches the 'search' table with a search argument and returns
	 * the corresponding value in the 'value' table. Variable 'nEntries' has the
	 * number of entries in each table.
	 */
	private int[] search = { 0, 20000, 50000, 100000, Integer.MAX_VALUE };
	private double[] value = { 0.0, 0.10, 0.20, 0.30, 0.40 };
	private int nEntries;

	// ***********************************************************************

	// Default constructor
	public TaxTableTools() {
		nEntries = search.length; // Set the length of the search table
	}

	// ***********************************************************************

	
	public void setTables(String name) {
		this.value = value;
		this.search = search;
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
			} else {
				++i;
			}
		}

		return result;
		}
	}


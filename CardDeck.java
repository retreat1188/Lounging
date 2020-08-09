import java.util.Scanner;

public class CardDeck {
	public static void main(String[] args) {
		int cardNum = 1;
		String cardSuit, cardRank;
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Card Number (1-52): ");
	    cardNum = input.nextInt();
	    System.out.println("The card you picked is ");

	switch (cardNum % 13) {
	case 1: 
		System.out.println("Ace");
		break;
	case 2:
		System.out.println("2");
		break;
	case 3:
		System.out.println("3");
		break;
	case 4:
		System.out.println("4");
		break;
	case 5: 
		System.out.println("5");
		break;
	case 6:
		System.out.println("6");
		break;
	case 7: 
		System.out.println("7");
		break;
	case 8: 
		System.out.println("8");
		break;
	case 9:
		System.out.println("9");
		break;
	case 10:
		System.out.println("10");
		break;
	case 11:
		System.out.println("Jack");
		break;
	case 12: 
		System.out.println("Queen");
		break;
	case 13:
		System.out.println("King");
		break;
		default: System.out.print("Error, wrong number!");
		}
	
	System.out.println("of ");
	switch (cardNum % 3) {
	case 1: 
		System.out.println("Clubs");
		break;
	case 2:
		System.out.println("Diamonds");
		break;
	case 3:
		System.out.println("Hearts");
		break;
	case 4:
		System.out.println("Spades");
		break;
		}
	}
} 


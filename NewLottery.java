import java.util.Scanner;

public class NewLottery {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		final int numOfRegNums = 6; // number of times user dice regular numbers. (1-37)
		final int numbersRange = 37; // range of the regular numbers.
		final int numOfStrongNums = 1; // only 1 String Number.
		final int strongNumRange = 7; // range of Strong Number.
		int[] user = new int[numOfRegNums + 1];//User's Reg Numbers. (added +1 for comparing index with index in loop).
		int userStrongNum = 0; //User's Strong Number.
		int[] lott = new int[numOfRegNums]; // Lottery Reg Numbers.
		int lottStrongNum; // Lottery Strong Number.
		int count = 0; // Count Matches.
		
		//***********************User's Section*********************//
		
		for (int i = 1; i < user.length; i++) { // Getting User's Number.
			for (int j = 1; j <= numbersRange; j++) { // Printing the numbers.
				if (j < 10) { // Placing The Numbers with same space order.
					System.out.print(j + "  ");
				} else {
					System.out.print(j + " ");
				}
				if (j % 10 == 0) { // Downline numbers.
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("Number Please: ");
			user[i] = s.nextInt(); // Scanning User's Number.
			for (int check = 0; check < i; check++) { //User's Numbers Checking.
				if (user[check] == user[i] || user[i] > 37 || user[i] < 1) { // checking if the numbers are by the Lottery rules.
					System.err.println("Invalid Input !");
					i--;
				}
			}

		}
		System.out.println(); // Downline

		for (int i = 0; i < numOfStrongNums; i++) { // Getting User's Strong Number.
			for (int j = 1; j <= strongNumRange; j++) { // Printing the numbers.
				System.out.print(j + " ");
			}
			System.out.println(); // Downline
			do { // Checking Loop.
				System.out.println("Strong Number Please: ");
				userStrongNum = s.nextInt(); // Scanning User's Number.
				if (userStrongNum < 1 || userStrongNum > 7) { // Checking if User's Strong Number is by the Lottery rules.
					System.err.println("Invalid Input !");
				}
			} while (userStrongNum < 1 || userStrongNum > 7);
		}
		
		//***********************Lottery Section*********************//
		
		for (int i = 0; i < lott.length; i++) { // Dice Loop.
			lott[i] = (int)(Math.random()*37+1); // Dice Numbers.
			for (int check = 0; check < i; check++) { // Checking Loop.
				if (lott[check] == lott[i]) { // Making sure Numbers are not the same.
					i--; // If numbers are same, dice again.
				}
			}
		}
		lottStrongNum = (int)(Math.random()*7+1); // Dice Lottery strong number. (1-7)
		
		//***********************Results*********************//
		
		for (int i = 1; i < user.length; i++) {// Printing User's Numbers.
			if (i == 1) {// Printing Opening.
				System.out.print("Your Numbers: ");
			}
			System.out.print(user[i]+" ");
		}System.out.println("\nYour Final Number: "+userStrongNum); // Printing User's strong number.
		
		for (int i = 0; i < lott.length; i++) {// Printing Lottery Numbers.
			if (i == 0) {// Printing Opening.
				System.out.print("Lottery Numbers: ");
			}
			System.out.print(lott[i]+" ");
		}System.out.println("\nLottery Strong Number: "+lottStrongNum); // Printing Lottery strong number.
		
		//********************Matches**********************//
		
		for (int i = 1; i < user.length; i++) {// Checking Regular Numbers Matching.
			for (int j = 0; j < lott.length; j++) {
				if (user[i] == lott[j]) {
					System.out.println(user[i]+" = "+lott[j]);
					count++;
				}
			}
		}
		System.out.println("You got "+count+" matches !");
		
		if (userStrongNum == lottStrongNum) { // Checking Strong Number Matching.
			System.out.println("Strong Numbers is matched "+userStrongNum+" = "+lottStrongNum+" !");
		}

	}

}

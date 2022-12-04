package projects;

import java.util.Scanner;

public class week3CodingAssignment {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		System.out.println("The last age minus the first age is: " + 
		(ages[ages.length - 1] - ages[0]));
		int total = 0;
		for(int age : ages) {
			total += age;
		} 
		int average = total/ages.length;
		System.out.println("The average of the given ages is: " + average);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLength = 0;
		for(String name : names) {
			totalLength += name.length();
		}
		int averageLength = totalLength/names.length;
		System.out.println("The average length of the given names is: " 
		+ averageLength);
		
		String con = "";
		for(String name : names) {
			con += name + " ";
		}
		System.out.println("The give names were: " + con);
		System.out.println("The last name in the array: " + 
		names[names.length - 1]);
		System.out.println("The first name in the array: " + names[0]);
		
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		int sum = 0;
		for(int n : nameLengths) {
			sum += n;
		}
		System.out.println("The sum of all the lengths of given names is: " 
		+ sum);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = in.nextLine();
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		System.out.println(word + " " + n + " times: " + repeatWord(word, n));
		
		System.out.println("Enter your First Name: ");
		String firstName = in.next();
		System.out.println("Enter your Last Name: ");
		String lastName = in.next();
		System.out.println("Your Full Name is: " + fullName(firstName, lastName));
		
		int[] arr = new int[3];
		System.out.println("Enter 3 Integers: ");
		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		arr[2] = in.nextInt();
		System.out.println("Is your Sum greater than 100? " + sumGreater100(arr));
		
		double[] arr1 = new double[3]; 
		System.out.println("Enter 3 Decimal Numbers: ");
		arr1[0] = in.nextDouble();
		arr1[1] = in.nextDouble();
		arr1[2] = in.nextDouble();
		System.out.println("Your Average is: " + averageDouble(arr1));
		
		double[] arr2 = new double[3];
		System.out.println("Enter 3 Decimal Numbers: ");
		arr2[0] = in.nextDouble();
		arr2[1] = in.nextDouble();
		arr2[2] = in.nextDouble();
		System.out.println("Is your first average greater than the second? " + greaterAverage(arr1, arr2));
		
		System.out.println("Is it hot outside? Enter true or false: ");
		boolean isHotOutside = in.nextBoolean();
		System.out.println("Enter the amount of money you have in your pocket: ");
		double moneyInPocket = in.nextDouble();
		System.out.println("Will you buy a drink? " + willBuyDrink(isHotOutside, moneyInPocket));
		
		System.out.println("Enter the number of hours you work per week: ");
		int workHoursPerWeek = in.nextInt();
		System.out.println("Enter the number of hours you sleep per night: ");
		int sleepHoursPerNight = in.nextInt();
		System.out.println("Enter the number of hours per week you have other responsibilities: ");
		int otherRespPerWeek = in.nextInt();
		System.out.println("You have " + 
		freeTimeHoursPerWeek(workHoursPerWeek, sleepHoursPerNight, otherRespPerWeek)
		+ " hours of free time per week!");
	}
	static String repeatWord(String word, int n) {
		String repeatedWord = "";
		while(n > 0) {
			repeatedWord += word;
			n--;
		}
		return repeatedWord;
	}
	static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	static boolean sumGreater100(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		if(total > 100) {
			return true;
		} else { return false;}
	}
	static double averageDouble(double[] arr1) {
		double total = 0;
		for(double i : arr1) {
			total += i;
		}
		return total/arr1.length;
	}
	static boolean greaterAverage(double[] arr1, double[] arr2) {
		double total1 = 0;
		double total2 = 0;
		for(double i : arr1) {
			total1 += i;
		}
		for(double i : arr2) {
			total2 += i;
		}
		if(total1/arr1.length > total2/arr2.length) {
			return true;
		} else { return false; }
	}
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else { return false; }
	}
	// method to calculate your hours of free time per week
	// by entering your hours worked per week, housr slept per night, 
	// and hours of other responsibilities per week
	// I created it because I'm always calculating it in my head
	
	static int freeTimeHoursPerWeek(int workHoursPerWeek, int sleepHoursPerNight, int otherRespPerWeek) {
		int sleepHoursPerWeek = sleepHoursPerNight * 7;
		int hoursPerWeek = 7 * 24;
		int freeTime = hoursPerWeek - workHoursPerWeek - sleepHoursPerWeek - otherRespPerWeek;
		return freeTime;
	}

}

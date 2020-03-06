package lab11;
//Author:Jackie Zablah. Java Bootcamp
//Extended Challenge
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieAppExtendedChallenge {

	public static void main(String[] args) {


		Scanner scnr = new Scanner(System.in);
		String userContinue = "y";
		String Category = "";

		ArrayList<String> drama = new ArrayList<>();
		ArrayList<String> horror = new ArrayList<>();
		ArrayList<String> musical = new ArrayList<>();
		ArrayList<String> scifi = new ArrayList<>();
		ArrayList<String> comedy = new ArrayList<>();
		ArrayList<String> animated = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			Movie temp = Movie.getMovie(i);
			String category = temp.getCategory();
			String title = temp.getTitle();
			if (category.equals("drama")) {
				drama.add(title);
			} else if (category.equals("horror")) {
				horror.add(title);
			} else if (category.equals("musical")) {
				musical.add(title);
			} else if (category.equals("scifi")) {
				scifi.add(title);
			} else if (category.equals("comedy")) {
				comedy.add(title);
			} else if (category.equals("animated")) {
				animated.add(title);
			}
		}

		Collections.sort(drama);
		Collections.sort(horror);
		Collections.sort(musical);
		Collections.sort(scifi);
		Collections.sort(comedy);
		Collections.sort(animated);

		System.out.println("Welcome to Grand Circus Movie List Application!\n ");
		System.out.println("There are 100 movies in this list.\n");

		do {
			System.out.println("What category are you interested in? Choose from the Menu:");
			System.out.println("1.Drama");
			System.out.println("2.Horror");
			System.out.println("3.Musical");
			System.out.println("4.Scifi");
			System.out.println("5.Comedy");
			System.out.println("6.Animated");

			Category = scnr.next();

			switch(Category) {
			case "1":
				System.out.println();
				System.out.println("Ready for some Drama!! we have " + drama.size() + " movies for you:");
				for(int i = 0; i<drama.size(); i++) {
					System.out.println((i+1)+". " + drama.get(i));
				}
				break;
			case "2":
				System.out.println();
				System.out.println("Are you ready to feel Horror?!! we have " + horror.size() + " movies for you");
				for(int i = 0; i<horror.size(); i++) {
					System.out.println((i+1)+". " + horror.get(i));
				}
				break;
			case "3":
				System.out.println();
				System.out.println("Feeling beat with rhytm!! we have " + musical.size() + " Musicals for you");
				for(int i = 0; i<musical.size(); i++) {
					System.out.println((i+1)+". " + musical.get(i));
				}
				break;
			case "4":
				System.out.println();
				System.out.println("Great category!! we have " + scifi.size() + " Scifi movies for you");
				for(int i = 0; i<scifi.size(); i++) {
					System.out.println((i+1)+". " + scifi.get(i));
				}
				break;
			case "5":
				System.out.println();
				System.out.println("Best medicine to your health!! we have " + comedy.size() + " Comedy movies for you");
				for(int i = 0; i<comedy.size(); i++) {
					System.out.println((i+1)+". " + comedy.get(i));
				}
				break;
			case "6":
				System.out.println();
				System.out.println("Fairly tales, here we have " + animated.size() + " Animated movies for you");
				for(int i = 0; i<animated.size(); i++) {
					System.out.println((i+1)+". " + animated.get(i));
				}
				break;
			default :
				System.out.println();
				System.out.println("Sorry, we don't have that category.");
				break;	
			}

			System.out.println("Would you like to continue? (Y/N)");
			userContinue = scnr.next();
		}
		while(userContinue.equalsIgnoreCase("y"));
		System.out.println("Enjoy your Movie! Good bye!!");

		scnr.close();
	}//end main

}//end class



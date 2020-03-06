package lab11;
//Author:Jackie Zablah. Java Bootcamp 2019
import java.util.ArrayList;
import java.util.Scanner;

public class MovieListApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userContinue = "y";
		String category = "";
		
		ArrayList <Movie> MovieList = new ArrayList<Movie>();
		MovieList.add(new Movie("Forrest Gump", "drama"));
		MovieList.add(new Movie("Gladiator", "drama"));
		MovieList.add(new Movie("Schindler List", "drama"));
		
		MovieList.add(new Movie("Halloween", "horror"));
		MovieList.add(new Movie("The Exorcist", "horror"));
		MovieList.add(new Movie("The Witch", "horror"));
		
		MovieList.add(new Movie("E.T.", "scifi"));
		MovieList.add(new Movie("Star Wars", "scifi"));
		MovieList.add(new Movie("The Matrix", "scifi"));
		
		MovieList.add(new Movie("Coco", "animated"));
		MovieList.add(new Movie("Finding Nemo", "animated"));
		MovieList.add(new Movie("Toy Story", "animated"));
		
		
		System.out.println("Welcome to your Movie List Application!\n\n ");
		System.out.println("There are 12 movies in this list.");
		
		do {
			System.out.println("What category are you interested in? (drama/horror/scifi/animated)");
			category = scnr.next();
			
			if(category.equals("drama")|| category.equals("horror")||category.equals("scifi")|| category.equals("animated"))
				for(int i = 0; i<MovieList.size(); i++) {
					if(MovieList.get(i).getCategory().equals(category)) {
						System.out.println(MovieList.get(i).getTitle());
					}
				}
			else{
				System.out.println("Sorry, we don't have that category.");
			}
			
			
			System.out.println("Would you like to continue? (Y/N)");
			userContinue = scnr.next();
		}
		while(userContinue.equalsIgnoreCase("y"));
		System.out.println("Thank you, Bye!");
		
		scnr.close();
	}//end main

}//end class

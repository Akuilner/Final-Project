/**For this Milestone Assignment I used data from the provided NFL link 
 * on New Orleans Saints Quarterback Drew Brees.
 * Using this program as a base I can display the info of any
 * player in the NFL*/
import java.util.Scanner;

public class nflPlayer {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Selection of property type
	System.out.println("(0)Personal Information \t (1)School History \t (2)Stats");
	System.out.println("Enter an integer representing which option you would like to choose:");
	int userChoice = input.nextInt();
	
	
			
	//Personal Info
	String name = "Drew Brees";
	String team = "New Orleans Saints";
	//pos stands for position, Ht for Height, Wt for weight
	String pos = "Quarterback";
	int jerseyNumber = 9;
	int Age = 38;
	/**Double is chosen for height and weight 
	 * because of how generally unlikely an integer is to be the height or weight
	 * disregarding this example.*/ 
	double Ht = 72;
	double Wt = 209;
	String placeOfBirth = "Austin, Texas";
	String dateOfBirth = "1/15/1979";
	
	//School info
	String highSchool = "Westlake High School, Austin Texas";	
	String college = "Purdue";
	
	//Statistical info
	//tDS stands for Touchdowns, inter for Interceptions, and yDS for Yards
	int tDS = 37;
	int inter = 15;
	int yDS = 5208;
	
	//List of properties after user chooses option
	if (userChoice == 0) {
		System.out.println("Player's name is: " + name + ", Team is: " + team + ", Position is: " + pos + ",");
		System.out.println("Jersey number is: " + jerseyNumber + ", Age is: " + Age + ", Height is: " + (Ht / 12.0) +  " feet, " + "Weight is: " + Wt + " pounds,");
		System.out.println("Place of birth is: " + placeOfBirth + ", Date of birth is: " + dateOfBirth + ".");	
	}
	else if (userChoice == 1) {		
		System.out.println("High School is: " + highSchool + ", College is: " + college); 
	}
	else if (userChoice == 2) {
		System.out.println("Total Touchdowns: " + tDS + ", Interceptions: " + inter + ", Yards:" + yDS + ".");
	}
	else {
		System.out.println("Error: Invalid command");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

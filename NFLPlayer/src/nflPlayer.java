/**For this Milestone Assignment I used data from the provided NFL link 
 * on New Orleans Saints Quarterback Drew Brees.
 * Using this program as a base I can display the info of any
 * player in the NFL*/
import java.util.Scanner;

abstract class nflPlayer {
	public void Parent() {
	Scanner input = new Scanner(System.in);
	
	//Calls the method
	//CreatePlayers();	
	//Selection of property type
	System.out.println("(0)Personal Information \t (1)School History \t (2)Stats");
	System.out.println("Enter an integer representing which option you would like to choose:");
	int userChoice = input.nextInt();
	
	
	/**		
	//Personal Info
	String name = "Drew Brees";
	String team = "New Orleans Saints";
	//pos stands for position, Ht for Height, Wt for weight
	String pos = "Quarterback";
	int jerseyNumber = 9;
	int Age = 38;
	/**Double is chosen for height and weight 
	 * because of how generally unlikely an integer is to be the height or weight
	 * disregarding this example.*\ 
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
	
	*/
	
	
	double Ht = getHeight();
	double Wt = getWeight();
	
	/**
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
		System.out.println("Total Touchdowns: " + tDS + ", Interceptions: " + inter + ", Yards: " + yDS + ".");
	}
	else {
		System.out.println("Error: Invalid command");
	} */

	}	
/**
	
	//Create players method
	public   void CreatePlayers() {
	//List of players
	String[] playerList = new String[6];	
	playerList[0] = "Jamal Adams";
	playerList[1]="Kelon Adams";
	playerList[2]="Montravius Adams";
	playerList[3]="Rodney Adams";
	playerList[4]="Jamal Agnew";
	playerList[5]="Brian Allen";
	System.out.println(playerList.toString());
	}
	
*/
	
	private String team;
	public   String getTeam() {
		return team;}
	public   void setTeam(String t) {
		team = t;
	}
	
	private String name;
	public String getName() {
		return name;}
	public void setName(String n) {
		name = n;
	}
	
	private String pos;
	public String getPos() {
		return pos;}
	public void setPos(String p) {
		pos = p;
	}
	
	private int jerseyNumber;
	public int getJN() {
		return jerseyNumber;}
	public void setJN(int jN) {
	jerseyNumber = jN;	
	}
	
	private int Age;
	public int getAge() {
		return Age;}
	public   void setAge(int a) {
		Age = a;
	}
	
	private double Height;
	public double getHeight(){
	return Height;}
	public void setHeight(double Ht){
	Height = Ht;
	}
	
	private double Weight;
	public double getWeight() {
		return Weight;}
	public void setWeight(double Wt) {
		Weight = Wt;
	}
	
	private String placeOfBirth;
	public String getPlaceOfBirth() {
		return placeOfBirth;}
	public void setPlaceOfBirth(String pOB) {
		placeOfBirth = pOB;
	}
	
	private String dateOfBirth;
	public String getDateOfBirth() {
		return dateOfBirth;}
	public void setDateOfBirth(String dOB) {
		dateOfBirth = dOB;
	}
	
	private String highSchool;
	public String getHighSchool() {
		return highSchool;}
	public void setHighSchool(String HS) {
		highSchool = HS;
	}
	
	private String college;
	public String getCollege() {
		return college;}
	public void setCollege(String c) {
		college = c;
	}
}
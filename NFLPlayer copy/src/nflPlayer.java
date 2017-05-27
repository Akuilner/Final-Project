/**For this Milestone Assignment I used data from the provided NFL link 
 * on New Orleans Saints Quarterback Drew Brees.
 * Using this program as a base I can display the info of any
 * player in the NFL*/
import java.util.Scanner;
/**NOTE: I am aware of my over-detailed statistics and that
 * the information all still pertains to Drew Brees, I will fix this
 * at a later date.I believe I corrected my playerList array, please let me
 * know if there are any more problems. 
 * 
 * P.S. All the extra space is taken so it is more 
 * likely that you will notice this note. Feel free to minimize it.
 * Thank you and have a nice day!	
 * 
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *   
 *  */





public class nflPlayer {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Calls the method
	CreatePlayers();	
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
	//Create players method
	public static void CreatePlayers() {
	//List of players
	String[] playerList = new String[5];	
	playerList[0] = "Jamal Adams";
	playerList[1]="Kelon Adams";
	playerList[2]="Montravius Adams";
	playerList[3]="Rodney Adams";
	playerList[4]="Jamal Agnew";
	playerList[5]="Brian Allen";
	System.out.println(playerList);
	}	
	
	private static String team;
	public static String getTeam() {
		return team;}
	public static void setTeam(String t) {
		team = t;
	}
	
	private static String name;
	public static String getName() {
		return name;}
	public static void setName(String n) {
		name = n;
	}
	
	private static String pos;
	public static String getPos() {
		return pos;}
	public static void setPos(String p) {
		pos = p;
	}
	
	private static int jerseyNumber;
	public static int getJN() {
		return jerseyNumber;}
	public static void setJN(int jN) {
	jerseyNumber = jN;	
	}
	
	private static int Age;
	public static int getAge() {
		return Age;}
	public static void setAge(int a) {
		Age = a;
	}
	
	private static double Height;
	public static double getHeight(){
	return Height;}
	public static void setHeight(double Ht){
	Height = Ht;
	}
	
	private static double Weight;
	public static double getWeight() {
		return Weight;}
	public static void setWeght(double Wt) {
		Weight = Wt;
	}
	
	private static String placeOfBirth;
	public static String getPlaceOfBirth() {
		return placeOfBirth;}
	public static void setPlaceOfBirth(String pOB) {
		placeOfBirth = pOB;
	}
	
	private static String dateOfBirth;
	public static String getDateOfBirth() {
		return dateOfBirth;}
	public static void setDateOfBirth(String dOB) {
		dateOfBirth = dOB;
	}
	
	private static String highSchool;
	public static String getHighSchool() {
		return highSchool;}
	public static void setHighSchool(String HS) {
		highSchool = HS;
	}
	
	private static String college;
	public static String getCollege() {
		return college;}
	public static void setCollege(String c) {
		college = c;
	}
	
	private static int touchDowns;
	public static int getTouchDowns() {
		return touchDowns;}
	public static void setTouchDowns(int tDS) {
		touchDowns = tDS;
	}
	
	private static int interceptions;
	public static int getInerceptions() {
		return interceptions;}
	public static void setInterceptions(int inter) {
		interceptions = inter;
	}
	
	private static int yards;
	public static int getYards() {
		return yards;}
	public static void setYards(int yDS) {
		yards = yDS;
	}
	
}
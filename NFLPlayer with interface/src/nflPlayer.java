/**For this Milestone Assignment I used data from the provided NFL link 
 * on New Orleans Saints Quarterback Drew Brees.
 * Using this program as a base I can display the info of any
 * player in the NFL*/
import java.util.Scanner;

abstract class nflPlayer implements Celebrator{
	public void Parent() {
	Scanner input = new Scanner(System.in);
	
	//Calls the method
	//CreatePlayers();	
	//Selection of property type
	System.out.println("(0)Personal Information \t (1)School History \t (2)Stats");
	System.out.println("Enter an integer representing which option you would like to choose:");
	int userChoice = input.nextInt();
	}	
	
	
	double Ht = getHeight();
	double Wt = getWeight();
	
	
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
	
	private int random1Thru5() {
		int randomInteger = (int)Math.random() * 10;
		
		if (randomInteger > 5)
			random1Thru5();
		
		return randomInteger;
		
	}
	
	public void celebrate() {
		int celebrateChoice = random1Thru5();
		
		switch (celebrateChoice) {
			
			case 1: System.out.println(getName() + " dances to celebrate his draft!");
			break;
		
			case 2: System.out.println(getName() + " cartwheels to celebrate his draft!");
			break;
			
			case 3: System.out.println(getName() + " throws a party to celebrate his draft!");
			break;
			
			case 4: System.out.println(getName() + " sings to celebrate his draft!");
			break;
			
			case 5: System.out.println(getName() + " gets root beer for everyone to celebrate his draft!");
			break;
		}
		
	}
	
}
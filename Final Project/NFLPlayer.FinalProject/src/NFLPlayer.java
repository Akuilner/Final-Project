import java.util.*;

public class NFLPlayer implements Celebrator{
	
	
	//creates user's roster
	public ArrayList<String> Roster = new ArrayList<String>();
	
	//accesses user's roster
	public void enterRoster() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nYour roster contains: " + Roster.size() + " players\n"
						+ Roster + "\n");
		
		System.out.print("Edit roster?\n"
					   + "Enter 'r' to remove a player\n"
					   + "Enter 'c' to clear all players\n"
					   + "Enter 't' to return to team selection screen: ");
		
		String userChoice = sc.next();
		
		if (userChoice.length() != 1)
		{
			System.out.println("Error: invalid input please try again");
			enterRoster();
		}
		
		else if (userChoice.equalsIgnoreCase("r"))
		{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the player's name here: ");
			String removedPlayer = input.nextLine();
			
			removePlayer(removedPlayer);
			enterRoster();
			
		}
		
		else if (userChoice.equalsIgnoreCase("c")) 
		{
			System.out.print("Are you sure you wish to clear " + Roster.size() + " player(s) from the roster?\n"
						   + "Enter 'y' for yes\n"
						   + "Enter 'n' for no: ");
			
			String clearChoice = sc.next();
			
			if (clearChoice.length() != 1)
			{
				System.out.println("Error: invalid input please try again: ");
				enterRoster();
			}
			
			else if (clearChoice.equalsIgnoreCase("y"))
			{
				clearPlayers();
				enterRoster();
			}
			
			else if (clearChoice.equalsIgnoreCase("n"))
				enterRoster();
			
			else
			{
				System.out.println("Error: invalid input please try again");
				enterRoster();
			}
			
		}
		
		else if (userChoice.equalsIgnoreCase("t"))
			printTeams();
		
		else
		{
			System.out.println("Error: invalid input please try again");
			enterRoster();
		}
	}
	
	//adds a player to the user's roster
	public ArrayList<String> addPlayer(String s) {
			ArrayList<String> newRoster = Roster;
			
			if (newRoster.contains(s))
				System.out.println("This player is already in your roster");
			
			else
				newRoster.add(s);
			
			return newRoster;
	}
		
	//removes a player from the user's roster
	public ArrayList<String> removePlayer(String s) {
			ArrayList<String> newRoster = Roster;
			
			for (int i = 0; i < Roster.size(); i++) 
			{
				if (s.equalsIgnoreCase(Roster.get(i)))
				{
					newRoster.remove(i);
					return newRoster;
				}	
			}
			
			return newRoster;
	}
		
	//clears all players from the user's roster
	public ArrayList<String> clearPlayers() {
			ArrayList<String> newRoster = Roster;
			
			newRoster.clear();
		
			return newRoster;
	}

	//holds and prints all the players
	public ArrayList<String> players(int i) {
		
		ArrayList<String> returnedList = new ArrayList<>();
		
		//Corn Elder is a Corner Back D, Christian McCaffrey is a Running Back O for Panthers
		ArrayList<String> Players1 = new ArrayList<String>();
		Players1.add("Christian McCaffrey");
		Players1.add("Corn Elder");
				
		//Jake Butt is a Tight End O, Brendan Langley is a Corner Back D for Broncos
		ArrayList<String> Players2 = new ArrayList<String>();
		Players2.add("Jake Butt");
		Players2.add("Brendan Langley");
				
		//Taco Charlton is a Defensive End D, Ryan Switzer is a Wide Receiver O for Dallas Cowboys
		ArrayList<String> Players3 = new ArrayList<String>();
		Players3.add("Ryan Switzer");
		Players3.add("Taco Charlton");
				
		//Ifeadi Odenigbo is  Defensive Line D, Dalvin Cook is a Running Back O for Minnesota Vikings
		ArrayList<String> Players4 = new ArrayList<String>();
		Players4.add("Dalvin Cook");
		Players4.add("Ifeadi Odenigbo");
				
		switch (i)
		{
		case 1: returnedList.addAll(Players1);
				break;
		
		case 2: returnedList.addAll(Players2);
				break;
		
		case 3: returnedList.addAll(Players3);
				break;
				
		case 4: returnedList.addAll(Players4);
				break;		
		}
		
		return returnedList;
				
	}
	
	
	//All values created for testing
	public String school = "University of State";
	
	public double height = 6.0;
	
	public double weight = 200.0;
	
	public int number = 20;
	
	public int TDS = 25;
	
	public int interceptions = 5;
	
	public int passY = 3000;
	
	public int rushY = 1000;
	
	public int receivingY = 1100;
	
	public int tackles = 150;
	
	public double sacks = 12.5;
	
	//prints all teams (current teams added for testing purposes
	public void printTeams(){
		System.out.print("Choose a team:\n"
				   	   + "1. Carolina Panthers\t3. Dallas Cowboys\n"
				   	   + "2. Denver Broncos\t4. Minnesota Vikings\n");
		chooseTeamStep1();
	}
	
	//shows the user's selected team
	public String showTeam(int i) {
		
		String returnedTeam = null;
		
		switch (i)
		{
		
			case 1: returnedTeam = "Carolina Panthers"; break;
		
			case 2: returnedTeam = "Denver Broncos"; break;
			
			case 3: returnedTeam = "Dallas Cowboys"; break;
			
			case 4: returnedTeam = "Minnesota Vikings"; break;
		}
		
		return returnedTeam;
	}
	
	//first selection menu
	public void chooseTeamStep1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number that corresponds to the team you wish to choose: ");
		int userChoice = sc.nextInt();
		
		if (userChoice < 1 || userChoice > 4) 
		{
			System.out.println("Error: invalid input, please try again");
			chooseTeamStep1();
		}
		
		else
			chooseTeamStep2(userChoice);
	}

	//team choice confirmation
	public void chooseTeamStep2(int i) {
		Scanner sc = new Scanner(System.in);
	
		switch (i) 
		{
			case 1: System.out.print("You have chosen the Carolina Panthers.\n"
								   + "Press 'y' to continue, or 'n' to return to team selection: ");
					String continueChoice = sc.next();
					
					if (continueChoice.length() != 1)
					{ 
						System.out.println("Error: invalid input, please try again");
						chooseTeamStep2(1);
					}
					
					else if (continueChoice.equalsIgnoreCase("y"))
						chooseTeamStep3(1);
					
					else if (continueChoice.equalsIgnoreCase("n"))
						printTeams(); 
					
					else
					{
						System.out.println("Error: invalid input please try again");
					}	
					break;
						
			case 2: System.out.print("You have chosen the Denver Broncos.\n"
					   			   + "Press 'y' to continue, or 'n' to return to team selection: ");
				    continueChoice = sc.next();
					
					if (continueChoice.length() != 1)
					{ 
						System.out.println("Error: invalid input, please try again");
						chooseTeamStep2(2);
					}
					
					else if(continueChoice.equalsIgnoreCase("y"))
						chooseTeamStep3(2);
					
					else if (continueChoice.equalsIgnoreCase("n"))
						printTeams(); 
					
					else
					{
						System.out.println("Error: invalid input please try again");
					}	
					break;			
					
			case 3: System.out.print("You have chosen the Dallas Cowboys.\n"
								   + "Press 'y' to continue, or 'n' to return to team selection: ");
					continueChoice = sc.next();
					
					if (continueChoice.length() != 1)
					{ 
						System.out.println("Error: invalid input, please try again");
						chooseTeamStep2(3);
					}
					
					else if(continueChoice.equalsIgnoreCase("y"))
						chooseTeamStep3(3);
					
					else if (continueChoice.equalsIgnoreCase("n"))
						printTeams(); 
					
					else
					{
						System.out.println("Error: invalid input please try again");
					}	
					break;			
					
			case 4: System.out.print("You have chosen the Minnesota Vikings.\n"
					   			   + "Press 'y' to continue, or 'n' to return to team selection: ");
					continueChoice = sc.next();
		
					if (continueChoice.length() != 1)
					{ 
						System.out.println("Error: invalid input, please try again");
						chooseTeamStep2(4);
					}
					
					else if(continueChoice.equalsIgnoreCase("y"))
						chooseTeamStep3(4);
					
					else if (continueChoice.equalsIgnoreCase("n"))
						printTeams(); 
					
					else
					{
						System.out.println("Error: invalid input please try again");
					}	
					break;
		
		}
	}
	
	//Selection Screen
	public void chooseTeamStep3(int i) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n'r' Return to previous menu\n"
						 + "'a' See all players\n"
					     + "'p' Choose by position\n"
						 + "Enter the letter that corresponds to your choice: ");
		
		String userChoice = sc.next();
		
		if (userChoice.length() != 1)
		{
			System.out.println("Error: invalid input please try again");
			chooseTeamStep3(i);
		}
		
		else if (userChoice.equalsIgnoreCase("r"))
			chooseTeamStep1();
		
		else if (userChoice.equalsIgnoreCase("a"))
			showAllPlayers(i);
		
		else if (userChoice.equalsIgnoreCase("p"))
		{
			System.out.print("\nThe positions on " + showTeam(i) + " are: Defensive, Offensive"); 
			//list above to be filled with team's positions
			choosePosition(i);
		}
		
		else
		{
			System.out.println("Error: invalid input please try again");
			chooseTeamStep3(i);
		}
	}
	
	//shows all of the players in the user's selected team
	public void showAllPlayers(int i) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nThe players on " + showTeam(i) + " are: " + players(i) + "\n"
					     + "Choose a player?\n"
					     + "Enter 'y' for yes\n"
					     + "Enter 'n' for no and to return to the selection screen: ");
		
		String userChoice = sc.next();
		
		if (userChoice.length() != 1)
		{
			System.out.println("Error: invalid input please try again");
			showAllPlayers(i);
		}
		
		else if (userChoice.equalsIgnoreCase("y"))
		{	
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the player's name here: ");
			String choosePlayer = input.nextLine();
			
			for (int l = 0; l < players(i).size(); l++)
			{
				if (choosePlayer.equalsIgnoreCase(players(i).get(l)))
					choosePlayer(i, l);
			}
		}
		
		else if (userChoice.equalsIgnoreCase("n"))
			chooseTeamStep3(i);
		
		else 
		{
			System.out.println("Error: invalid input please try again");
			showAllPlayers(i);
		}
		
	}
	
	//allows the user to check a position
	public void choosePosition(int i) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n"
					   + "'r' Return to previous menu\n"
					   + "'o' Offensive\n"
					   + "'d' Defensive\n"
					   + "Enter the letter that corresponds to the desired option: ");
		
		String userChoice = sc.next();
		
		if (userChoice.length() != 1)
		{
			System.out.println("Error: invalid input please try again");
			choosePosition(i);
		}
		
		else if (userChoice.equalsIgnoreCase("r"))
			chooseTeamStep3(i);
		
		else if (userChoice.equalsIgnoreCase("o"))
		{
			System.out.print("\n" + players(i).get(0));
			choosePlayer(i, 0);
		}	
		
		else if (userChoice.equalsIgnoreCase("d"))
		{
			System.out.print("\n" + players(i).get(1));
			choosePlayer(i, 1);
		}
		
		else
		{
			System.out.println("Error: invalid input please try again");
			choosePosition(i);
		}
		
	}
	
	//displays the player's information and allows the user to add the to his/her roster 
	public void choosePlayer(int i, int place) {
		Scanner sc = new Scanner(System.in);
		
		if (place == 0) 
		{
			System.out.print("\n" 
							+ players(i).get(place) + " is an offensive player\n"
					       + "College is: " + school + "\n"
					       + "Height is: " + height + "'\n"
					       + "Weight is: " + weight + "lbs\n"
					       + "Jersey number is: " +number + "\n"				       
					       + "Touchdowns: " + TDS + "\n"
					       + "Interceptions: " + interceptions + "\n"
					       + "Passing yards: " + passY + "\n"
					       + "Rushing yards: " + rushY + "\n"
					       + "Receiving yards: " + receivingY + "\n"
					       + "Add this player to your roster?\n"
					       + "'y' for yes\n"
					       + "'p' to go to position selection screen\n"
					       + "and 'a' to see all players on " + showTeam(i) + ": ");
			
			String userChoice = sc.next();
			
			if (userChoice.length() != 1)
			{	
				System.out.println("Error: invalid input please try again");
				choosePlayer(i, place);
			}
			
			else if (userChoice.equalsIgnoreCase("y"))
			{	
				addPlayer(players(i).get(place));
				celebrate(i, place);
				enterRoster();
			}
			
			else if (userChoice.equalsIgnoreCase("p"))
				choosePosition(i);
			
			else if (userChoice.equalsIgnoreCase("a"))
				showAllPlayers(i);
		
			else
			{
				System.out.println("Error: invalid input please try again");
				choosePlayer(i, place);
			}
			
		}
		
		if (place == 1) 
		{
			System.out.print("\n" 
					+ players(i).get(place) + " is a defensive player\n"
			       + "College is: " + school + "\n"
			       + "Height is: " + height + "'\n"
			       + "Weight is: " + weight + "lbs\n"
			       + "Jersey number is: " +number + "\n"				       
			       + "Tackles: " + tackles + "\n"
			       + "Sacks: " + sacks + "\n"
			       + "Interceptions: " + interceptions + "\n"
			       + "Add this player to your roster?\n"
			       + "'y' for yes\n"
			       + "'p' to go to position selection screen\n"
			       + "and 'a' to see all players on " + showTeam(i) + ": ");
	
			String userChoice = sc.next();
			
			if (userChoice.length() != 1)
			{	
				System.out.println("Error: invalid input please try again");
				choosePlayer(i, place);
			}
			
			else if (userChoice.equalsIgnoreCase("y"))
			{	
				addPlayer(players(i).get(place));
				celebrate(i, place);
				enterRoster();
			}
			
			else if (userChoice.equalsIgnoreCase("p"))
				choosePosition(i);
			
			else if (userChoice.equalsIgnoreCase("a"))
				showAllPlayers(i);

			else
			{
				System.out.println("Error: invalid input please try again");
				choosePlayer(i, place);
			}
			
		}	
	}
	
	//starts program	
	public static void main(String[] args) {
		NFLPlayer start = new NFLPlayer();
		
		
		
		System.out.print(" Welcome to the NFL draft!\n"
				       + "----------------------------\n"
				       + "\n");
		
		start.printTeams();
	}
	
	
	//Generates a random number 1-6 to generate a celebrate message
	static Random r = new Random();

	static {
	    r.setSeed(System.currentTimeMillis());
	}
	
	public int random1Thru6() {
	    return r.nextInt(6) + 1;
	}

	//Overridden celebrate method
	@Override
	public void celebrate(int i, int place){
		int randomInteger;
		
		if (place == 0) //Player is offensive
		{
			randomInteger = random1Thru6();
			
			//System.out.println(randomInteger);
			
			switch (randomInteger) 
			{
			
				case 1: System.out.println(players(i).get(place) + " dances to celebrate his draft!");
				break;
		
				case 2: System.out.println(players(i).get(place) + " cartwheels to celebrate his draft!");
				break;
				
				case 3: System.out.println(players(i).get(place) + " throws a party to celebrate his draft!");
				break;
				
				case 4: System.out.println(players(i).get(place) + " sings to celebrate his draft!");
				break;
				
				case 5: System.out.println(players(i).get(place) + " gets root beer for everyone to celebrate his draft!");
				break;
				
				case 6: System.out.println(players(i).get(place) + " gets donuts to celebrate his draft!");
				break;
			}
		}
		
		else if (place == 1) //Player is defensive
		{
			randomInteger = random1Thru6();
						
			//System.out.println(randomInteger);
			
			switch (randomInteger) 
			{
			
				case 1: System.out.println(players(i).get(place) + " dances to celebrate his draft!");
				break;
					
				case 2: System.out.println(players(i).get(place) + " cartwheels to celebrate his draft!");
				break;
							
				case 3: System.out.println(players(i).get(place) + " throws a party to celebrate his draft!");
				break;
					
				case 4: System.out.println(players(i).get(place) + " sings to celebrate his draft!");
				break;
							
				case 5: System.out.println(players(i).get(place) + " gets root beer for everyone to celebrate his draft!");
				break;
							
				case 6: System.out.println(players(i).get(place) + " gets pizza to celebrate his draft!");
				break;
			}
		}
		
		
			
	}
		

}
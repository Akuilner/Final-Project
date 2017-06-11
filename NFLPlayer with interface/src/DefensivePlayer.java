public class DefensivePlayer extends nflPlayer {

	
	private String defensivePos;
	public String getPos() {
		return defensivePos;}
	public void setPos(String p) {
		defensivePos = p;
	}
	
	private int tackles;
	public int getTackles() {
		return tackles;}
	public void setTackles(int t) {
		tackles = t;
	}
	
	private double sacks;
	public double getSack() {
		return sacks;}
	public void setSack(double s) {
		sacks = s;
	}
	
	private int interceptions;
	public int getInter() {
		return interceptions;}
	public void setInter(int i) {
		interceptions = i;
	}
	
	private int random1Thru6() {
		int randomInteger = (int)Math.random() * 10;
		
		if (randomInteger > 6)
			random1Thru6();
		
		return randomInteger;
		
	}
	
	@Override
	public void celebrate() {
		int celebrateChoice = random1Thru6();
		
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
			
			case 6: System.out.println(getName() + " gets pizza to celebrate his draft!");
		}	
	}	
	
}

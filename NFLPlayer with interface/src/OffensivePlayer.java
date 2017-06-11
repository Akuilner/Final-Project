public class OffensivePlayer extends nflPlayer {
	
	private String offensivePos;
	public String getPos() {
		return offensivePos;}
	public void setPos(String p) {
		offensivePos = p;
	}
	
	private int touchDowns;
	public int getTouchDowns() {
		return touchDowns;}
	public void setTouchDowns(int tDS) {
		touchDowns = tDS;
	}
	
	private int interceptions;
	public int getInerceptions() {
		return interceptions;}
	public void setInterceptions(int inter) {
		interceptions = inter;
	}
	
	private double passYards;
	public double getPYards() {
		return passYards;}
	public void setPYards(double pYards) {
		passYards = pYards;
	}
	
	private double rushingYards;
	public double getRUYards() {
		return rushingYards;}
	public void setRUYards(double ruYards) {
		rushingYards = ruYards;
	}
	
	private double recievingYards;
	public double getREYards() {
		return recievingYards;}
	public void setREYards(double reYards) {
		recievingYards = reYards;
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
			
			case 6: System.out.println(getName() + " gets donuts to celebrate his draft!");
		}	
	}	
}
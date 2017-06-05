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
	
}
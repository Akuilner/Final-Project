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
	
	
}

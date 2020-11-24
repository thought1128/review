package kmw;


public interface NumberFace {
	public void manual();
	public int menu();
	public int menu2();
	public int[] level(int lv);
	public void levelMenu();
	public int time(int sec);
	public void timeMenu();
	public void random();
	public void memorization(int seconds);
	public void userSet();
	public void result();
	public void result(int[] array);
	public void rank(); 
	public boolean rank(int challenge, boolean ok);
	public void challenge();
	public void run();
	public String save(int score);

}
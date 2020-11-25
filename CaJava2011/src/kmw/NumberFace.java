package kmw;


public abstract class NumberFace {
	public abstract void manual();
	public abstract int  menu();
	public abstract int menu2();
	public abstract int[] level(int lv);
	public abstract void levelMenu();
	public abstract int time(int sec);
	public abstract void timeMenu();
	public abstract void random();
	public abstract void memorization(int seconds);
	public abstract void userSet();
	public abstract void result();
	public abstract void result(int[] array);
	public abstract void rank(); 
	public abstract boolean rank(int challenge, boolean ok);
	public abstract void challenge();
	public abstract void run();
	public abstract String save(int score);

}
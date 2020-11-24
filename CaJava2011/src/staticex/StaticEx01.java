package staticex;

public class StaticEx01 {
	static int count =0;
	StaticEx01(){
		count++;
		//System.out.println(count);
	}
	public static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		StaticEx01 st1= new StaticEx01();
		StaticEx01 st2= new StaticEx01();
		StaticEx01 st3= new StaticEx01();
		System.out.println(getCount());
		

	} 

}
package methodex;

public class OverloadEx01 {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		System.out.println(c.add(10.5, 4));
		System.out.println(c.add(10.5, 4, 1));
		
		c.disp('@', 3);
		c.disp('#', 5);
		c.disp('%', 7);
		
		c.disp(9,5,'&');
		c.disp('@','#',7);
		
		double result1= c.areaRectangle(10);
		double result2= c.areaRectangle(10,20);
		System.out.println(result1);
		System.out.println(result2);
	}

}

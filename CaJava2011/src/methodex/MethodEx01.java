package methodex;

public class MethodEx01 {

	public static void main(String[] args) {
		MethodEx01_01 me= new MethodEx01_01();
		int a=5, b=2, c=10;
		me.hap(a, b);
		me.cha(a, b);
		me.gop(a, b);
		me.mok(a, b);
		
		me.add(c);
		me.p(c);
		me.add(1, 20);
		me.p(1, 20);
	}

}

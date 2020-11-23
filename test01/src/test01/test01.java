package test01;

public class test01 {
	
	public static void main(String[] args) {
		test02 test = new test02() {
			String a="werwer";
			public String setS() {
				return a;
			}
		};
		test.df="aaa";
		System.out.println(test.setS());
		System.out.println(test.df);
		//test.add();
	}

}

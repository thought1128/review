package test;

import java.math.BigDecimal;

public class Test3 {

	public static void main(String[] args) {

		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}

		double x = 0.1;
		
		BigDecimal b = new BigDecimal(String.valueOf(x));
		String str = String.valueOf(b.add(b));
		double y = Double.parseDouble(str);
		System.out.println(y);
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = y;
		}
		 
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		String[] arr3 = new String[3];
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			arr3[i] = i+1+"등";
			System.out.println("arr2["+i+"] : "+arr3[i]);
		}
	}

}
 
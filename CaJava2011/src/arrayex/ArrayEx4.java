package arrayex;

public class ArrayEx4 {

	public static void main(String[] args) {
		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
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

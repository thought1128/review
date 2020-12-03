package review;
import java.util.Scanner;

class A{
	int a=123;
}

public class Ex03_arrangement {

	public static void main(String[] args) {
		/*
		 * int a=1,b=2,c=3,d=4,e=5; int[] array1= {1,2,3,4,5}; int[] array2= new
		 * int[]{1,2,3,4,5}; int[] array3= new int[5]; System.out.println(array1);
		 * System.out.println(array1[0]); System.out.println(array1[4]);
		 * System.out.println(array1.length); int i; int length=array1.length; for(i=0;
		 * i<length; i++) { System.out.println(array1[i]); } System.out.println(array2);
		 * System.out.println(array3); array3[0]=10; array3[3]=40; for(i=0; i<length;
		 * i++) { System.out.println(array3[i]); }
		 * 
		 * for(int x:array1) { System.out.println(x); }
		 */
		int[][]	array4= {{1,2,3},{4,5},{6,7,8,9},{10,11,12,13,14}};
		System.out.println(array4[0][0]);
		System.out.println(array4[1][1]);
		System.out.println(array4.length);
		System.out.println(array4[0].length);
		System.out.println(array4[1].length);
		System.out.println(array4[2].length);
		System.out.println(array4[3].length);
		
		int[][][] array5= {{{0},{1}},{{0},{1},{2}},{{0},{1},{2},{3}}}; 	
		for(int[] i:array4) {
			System.out.print(i+"\s");
		}
		System.out.println();
		for(int[] i:array4) {
			for(int j:i) {
				System.out.print(j+"\s");
			}
			System.out.println();
		}
		
		System.out.println();
		int x=1;
		for(int i:array4[x]) {
			System.out.print(i+"\s");
			x++;
			System.out.println(x);
		}
		
		System.out.println();
		for(int i=0; i<4; i++) {
			for(int j=0; j<array4[i].length; j++) {
				System.out.print(array4[i][j]+"\s");
			}
			System.out.println();
		}
		Scanner input=new Scanner(System.in);
		int[][] array6=new int[2][3];
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {
				array6[i][j]=input.nextInt();
			}
		}
		System.out.println();
		for(int[] i:array6) {
			for(int j:i) {
				System.out.print(j+"\s");
			}
		}
		input.close();
	}

}

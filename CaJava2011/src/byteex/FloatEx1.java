package byteex;

public class FloatEx1 {

	public static void main(String[] args) {
		double dNum = 3.14;
		float fNum = 3.14f;
		float sum = (float)dNum + fNum;
		float sum2 = (float)(dNum + fNum);
		System.out.println(dNum);
		System.out.println(fNum);
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println((int)(dNum+fNum));

	}

}

package stringex;

public class StringFormatEx1 {

	public static void main(String[] args) {
		
		System.out.println("# 위치: 오른쪽 붙임, 왼쪽 붙임");
		System.out.printf("%10s %10s\n","Java","PYTHON");
		System.out.printf("%-10s %-10s\n","Java","PYTHON");
		System.out.println();
		
		System.out.println("# 자리수: 10");
		System.out.printf("%d %d\n",12345,67890);
		System.out.printf("%10d%10d\n",12345,67890);
		System.out.println();
		
		System.out.println("# 순서: 2$ 1$");
		System.out.printf("%d %d\n",12345,67890);
		System.out.printf("%2$d %1$d\n",12345,67890);
		System.out.println();
		
		System.out.println("# 정밀도: .숫자");
		System.out.printf("%d %d\n",100,100);
		System.out.printf("%.3f %.5f\n",100.12345f,100.55678f);
		System.out.printf("%.3f %.5f\n",100000.89399f,100000.9999999);
		
	}

}

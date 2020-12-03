package iofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_10_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("scan.txt"));
		sc.useDelimiter(",");
		int sum=0,num,cnt=0;;
		while(sc.hasNextInt()) {
			num=sc.nextInt();
			sum+=num;
			cnt++;
		}
		System.out.println(sum);
		System.out.println(cnt);
		System.out.printf("%.2f",sum/(double)cnt);
	}

}

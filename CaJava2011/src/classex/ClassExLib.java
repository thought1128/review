package classex;

public class ClassExLib {
	String name="민우",address="인천광역시 계양구",hobby="없음",hometown="서울";
	int age=31,cellPhoneNumber=41977685,height=183,weight=78;
	char gender='남',familyName='김';

	public void printIntroduce() {
		System.out.println("이름 "+familyName+name);
		System.out.println("성별 "+gender);
		System.out.println("키 "+height);
		System.out.println("몸무게 "+weight);
		System.out.println("주소 "+address);
		System.out.println("고향 "+hometown);
		System.out.println("나이 "+age);
		System.out.println("핸드폰 번호 "+cellPhoneNumber);
		System.out.println("취미 "+hobby);
		
		
	}
}

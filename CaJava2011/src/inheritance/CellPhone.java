package inheritance;

public class CellPhone {
	String model;
	CellPhone(String model){
		this.model=model;
	}
	CellPhone(){
		
	}
	public void power() {
		System.out.println("전원을 켭니다.");
	}

	public void kakao() {
		System.out.println("카톡 카톡~");
		System.out.println("나: 왓츠업");
		System.out.println("친구: 하이! 뭐하니!");
		System.out.println("나: 코딩하지!!");
		System.out.println("카톡 종료");
	}
}

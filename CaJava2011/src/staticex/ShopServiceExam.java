package staticex;

public class ShopServiceExam {

	public static void main(String[] args) {
		ShopService sv1= ShopService.get();
		ShopService sv2= ShopService.get();
		if(sv1==sv2) {
			System.out.println("같은 객체입니다.");
		}

	}

}

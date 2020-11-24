package strdpgex;



public class StrPrg02 {

	public static void main(String[] args) {

		int[] lottos = new int[6];
		int menu = 0;
		boolean running = true;
		Lotto lotto= new Lotto(menu);
		while(running) {
			menu=lotto.menu();
			if(menu==1) {
				lotto.randomLotto();
				lotto.userNumber(lottos);
			}else if(menu==2) {
				lotto.result();
				lotto.result(lottos);
				lotto.rank(lottos);
			}else if(menu==3) {
				System.out.println("종료되었습니다.");
				running=false;
			}else {
				System.out.println("1~3 사이의 번호만 입력해주세요");
			}
		}
	}
}


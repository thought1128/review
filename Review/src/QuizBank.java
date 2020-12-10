
public class QuizBank {

	String[] problems = {
			"네트워크 처리 패키지는?",
			"서버쪽 소켓 클래스는?",
			"인터넷에서 컴퓨터를 식별하는 주소는?"
	};

	String[] answers = {"java.net","ServerSocket","IP주소"};

	private final int WAITING = 0;
	private final int PROBLEM = 1;
	private final int ANSWER = 2;
	private final int NUMPROBLEMS = 3;

	private int state = WAITING;
	private int current = 0;
	
	public String process(String theInput) {
//		theInput : y or n
		String theOutput = null;
		
		if(state == WAITING) {
			theOutput = "퀴즈를 시작합니다.(y/n)";
			state = PROBLEM;
		}
		else if(state == PROBLEM) {
			// 문제를 보내는 작업
			if(theInput.equals("y")) {
				theOutput = problems[current];
				state = ANSWER;
			}
			else { // "n"
				theOutput = "quit";
			}
			
		}
		else if(state == ANSWER) {
			// 클라이언트가 보내온 답과 정답을 비교하는 작업
			if(theInput.equals(answers[current])) {
				theOutput = "정답입니다. 계속하시겠습니까?(y/n)";
			}
			else { // 오답
				theOutput = "오답입니다. 계속하시겠습니까?(y/n)";
			}
			
			state = PROBLEM;
			current = (current + 1) % NUMPROBLEMS;
		}
		
		return theOutput;
		
	} // process 

}

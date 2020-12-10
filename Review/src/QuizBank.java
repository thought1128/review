
public class QuizBank {

	String[] problems = {
			"��Ʈ��ũ ó�� ��Ű����?",
			"������ ���� Ŭ������?",
			"���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ�?"
	};

	String[] answers = {"java.net","ServerSocket","IP�ּ�"};

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
			theOutput = "��� �����մϴ�.(y/n)";
			state = PROBLEM;
		}
		else if(state == PROBLEM) {
			// ������ ������ �۾�
			if(theInput.equals("y")) {
				theOutput = problems[current];
				state = ANSWER;
			}
			else { // "n"
				theOutput = "quit";
			}
			
		}
		else if(state == ANSWER) {
			// Ŭ���̾�Ʈ�� ������ ��� ������ ���ϴ� �۾�
			if(theInput.equals(answers[current])) {
				theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�?(y/n)";
			}
			else { // ����
				theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�?(y/n)";
			}
			
			state = PROBLEM;
			current = (current + 1) % NUMPROBLEMS;
		}
		
		return theOutput;
		
	} // process 

}

package arrayex;

public class ArrayEx051 {

	public static void main(String[] args) {
		int[][] math = new int[][] {{95,75,85},{75,95,100}};
		for(int i=0; i<math.length; i++) {
			for(int k=0; k<math[i].length; k++) {
				System.out.println("math["+(i+1)+"]["+(k+1)+"]="+math[i][k]);
				
			}
		}

	}
}
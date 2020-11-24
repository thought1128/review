package arrayex;

public class AddEx {
	public double add(double[] scores) {
		int sum=0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;	
	}
}

public class adder {
	public int Addition(String expression) {
		int sum = 0;
		for(String summand: expression.split("\\+"))
			sum += Integer.valueOf(summand);
		return sum;
	}
}

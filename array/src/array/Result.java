package array;

import java.util.List;

public class Result {
// Complete the 'simpleArraySum' function below.
// The function is expected to return an INTEGER.
	public static int simpleArraySum(List<Integer> ar) {
		int result = 0;
		for(int i = 0; i < ar.size();i++) {
			result += ar.get(i);
		}
		return result;
	}
}

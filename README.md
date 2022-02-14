# taller-github-flow

 class Result {
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
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new
				InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new
				OutputStreamWriter(System.out));
		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> ar =
				Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int result = Result.simpleArraySum(ar);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
 }
}

package array;

import java.io.*;
import java.util.*;
import java.util.stream.*;

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
package com.coding.problems.hackerrank;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     *
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        int[] frequency = new int[101];
        int result = Integer.MIN_VALUE;
        for(int i=0; i<a.size();i++){
            int value = a.get(i);
            frequency[value] = frequency[value]+1;
        }
        for(int j=1;j<=100;j++){
            result = Math.max(result, frequency[j] + frequency[j-1]);
        }

        return result;
    }

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

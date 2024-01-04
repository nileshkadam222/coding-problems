package com.coding.problems.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ElementOccuringOnceSolution {

    static int singleElement(int[] arr, int n) {
        // code here
        Map<Integer, Integer> countingMap = new HashMap<>();
        Arrays.stream(arr).forEach(f -> {
            if (countingMap.containsKey(f)) {
                int data = countingMap.get(f);
                countingMap.put(f, data + 1);
            } else {
                countingMap.put(f, 1);
            }
        });
        return  countingMap.entrySet().stream().filter(f-> f.getValue() == 1).map(m -> m.getKey()).findFirst().get();
    }
}

public class ElementOccuringOnce {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            ElementOccuringOnceSolution solution = new ElementOccuringOnceSolution();
            int ans = solution.singleElement(arr, n);
            System.out.println(ans);
        }

    }
}

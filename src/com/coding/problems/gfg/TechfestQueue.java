package com.coding.problems.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


class feststQueueSolution {
    public static long sumOfPowersOptimized(long a, long b) {
        // code here
        int ans = 0;
        for(long i=a;i<=b;i++){
            ans+=primes(i);
        }
        return ans;
    }
    public static long primes(long n){
        int ans = 0;

        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                ans++;
                n/=i;
            }
        }
        if(n!=1){
            ans++;
        }
        return ans;
    }
    public static long sumOfPowers(long a, long b) {
        // code here
        Map<Long, Integer> countMap = new HashMap<>();
        for(long num= a; num<= b;num++){
            long inputNumber = num;
            for(int div = 2; div * div <= inputNumber; div++){
                while(inputNumber % div ==0){
                    inputNumber = inputNumber / div;
                    int value = countMap.getOrDefault(inputNumber,0);
                    countMap.put(inputNumber, value+1);
                }
            }
            if(inputNumber != 1){
                int value = countMap.getOrDefault(inputNumber,0);
                countMap.put(inputNumber, value+1);
            }

        }
        return countMap.entrySet().stream().mapToInt(f->  f.getValue()).sum();
    }
}
public class TechfestQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            long a = Long.parseLong(reader.readLine().trim());
            long b = Long.parseLong(reader.readLine().trim());
            feststQueueSolution solution = new feststQueueSolution();
            long ans = solution.sumOfPowers(a, b);
            System.out.println(ans);
        }

    }
}

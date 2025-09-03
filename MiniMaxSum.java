// https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public static void miniMaxSum(List<Integer> arr) {
    List<Long> results = new ArrayList<>();
    long totalSum = sum(arr);

    for (int i = 0; i < arr.size(); i++) {
      results.add(totalSum - arr.get(i));
    }
    long max = Collections.max(results);
    long min = Collections.min(results);

    System.out.println(min + " " + max);
  }

  public static long sum(List<Integer> array) {
    long totalSum = 0;
    for (int num : array) {
      totalSum += num;
    }
    return totalSum;
  }
}

// https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public static String timeConversion(String time) {
        Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(AM|PM)");
        Matcher matcher = pattern.matcher(time);

        if (matcher.matches()) {
            int hour = Integer.parseInt(matcher.group(1));
            String minute = matcher.group(2);
            String second = matcher.group(3);
            String period = matcher.group(4);

            if (period.equals("AM")) {
                if (hour == 12) {
                    hour = 0;
                }
            } else {
                if (hour != 12) {
                    hour += 12;
                }
            }

            return String.format("%02d:%s:%s", hour, minute, second);
        } else {
            throw new IllegalArgumentException("Invalid time format: " + time);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}

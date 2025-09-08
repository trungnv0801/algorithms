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
}

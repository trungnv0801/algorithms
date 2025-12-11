// https://leetcode.com/problems/zigzag-conversion/

class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }

        String newString = "";
        int originalDiff = numRows * 2 - 2;
        int diff = originalDiff;
        int upperDiff = 0;

        boolean isGoingDown = true;

        int currIndex = 0;
        int currRow = 0;
        int startingIndex = 0;

        for(int i = 0; i < s.length(); i++) {

            System.out.println(currIndex);

            newString += s.charAt(currIndex);

            if(currRow == 0 || currRow == numRows - 1) {
                currIndex += originalDiff;
            } else { 
                if(isGoingDown) {
                    currIndex += diff;
                    isGoingDown = !isGoingDown;
                } else {
                    currIndex += upperDiff;
                    isGoingDown = !isGoingDown;
                }
            }

            if(currIndex >= s.length()) {
                currRow++;
                diff -= 2;
                upperDiff += 2;
                currIndex = currRow;
                isGoingDown = true;
            }
            if(currRow == numRows) {
                i = s.length();
            }
        }

        return newString;
    }
}

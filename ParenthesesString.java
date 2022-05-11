package leedtcode.May.CW4;

public class ParenthesesString {
    public static void main(String[] args) {

        // Given array arr[]
        String s = "))()))", locked = "010100";

        // Function call
        System.out.print(canBeValid(s, locked));
    }

    public static boolean canBeValid(String s, String locked) {
       /* int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        int remain = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '1' && s.charAt(i) == ')') {
                if (remain == 0) {
                    return false;
                } else {
                    remain--;
                }
            } else {
                remain--;
            }
        }

        remain = 0;
        for (int i = n - 1; i >= 0; i--) {
            // check locked '('
            if (locked.charAt(i) == '1' && s.charAt(i) == '(') {
                // don't have nothing left to pair '('
                if (remain == 0) {
                    return false;
                } else {
                    remain--;
                }
            } else {
                remain++;
            }
        }

        return true;*/

        int N = s.length();
        if (N % 2 == 1) {
            return false;
        }

        int balanceLeftToRight = 0, unlockedLeftToRight = 0;
        int balanceRightToLeft = 0, unlockedRightToLeft = 0;
        //checking left to right, "(" +1, ")" -1
        for (int i = 0; i < N && balanceLeftToRight + unlockedLeftToRight >= 0 && balanceRightToLeft + unlockedRightToLeft >= 0; i++) {
            if (locked.charAt(i) == '0') {
                unlockedLeftToRight++;
            } else {
                if (s.charAt(i) == '(') {
                    balanceLeftToRight++;
                } else {
                    balanceLeftToRight--;
                }
            }
            int rightToLeftIdx = N - i - 1;
            if (locked.charAt(rightToLeftIdx) == '0') {
                unlockedRightToLeft++;
            } else {
                if (s.charAt(rightToLeftIdx) == ')') {
                    balanceRightToLeft++;
                } else {
                    balanceRightToLeft--;
                }
            }
        }
        if (Math.abs(balanceLeftToRight) > unlockedLeftToRight || Math.abs(balanceRightToLeft) > unlockedRightToLeft) {
            return false;
        }
        return true;
    }
}

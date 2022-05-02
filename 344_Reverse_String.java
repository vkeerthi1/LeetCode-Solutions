package leedtcode.May;
//344. Reverse String
// Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.
//557. Reverse Words in a String III
 /*       Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
        Example 1:
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReversal {

    public static void main(String[] args) {
        String input = "dummy";
        System.out.print(reverse(input));
        System.out.print("\n");
        String input1 = "Let's take LeetCode contest";
        System.out.print(reverseWords(input1));

        System.out.print("\n");
        String input2 = "Let's take LeetCode contest";
        System.out.print(reverseWords2(input2));
    }

    public static String reverseWords2(String str) {
        /*StringBuffer s = new StringBuffer(str);
        str = s.reverse().toString();
        String [] rev = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for(int i = rev.length - 1; i >= 0; i--) {
            reverse.append(rev[i]).append(" ");
        }
        return reverse.toString();*/
        StringBuffer s = new StringBuffer(str);
        str = s.reverse().toString();
        String [] rev = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for(int i = rev.length - 1; i >= 0; i--) {
            reverse.append(rev[i]).append(" ");
        }
        return reverse.toString();
    }


    public static String reverseWords(String str) {
       return Arrays.asList(str.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] characters = str.toCharArray();
        int i = 0;
        int j = characters.length - 1;
        while (i < j) {
            swap(characters, i, j);
            i++;
            j--;
        }
        return new String(characters);
    }

    /**
     * Java method to swap two numbers in given array
     *
     * @param str
     * @param i
     * @param j
     */
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

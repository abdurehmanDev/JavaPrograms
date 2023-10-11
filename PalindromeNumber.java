import java.util.Scanner;




class StringPalindrome {
  public static void main(String[] args) {
    System.out.print("Enter the String: ");
  try (Scanner input = new Scanner(System.in)) {
    String str = input.nextLine();
    Solution ob = new Solution();
   System.out.println(ob.isPalindrome(str));
}
    
  }
}

class Solution {


static boolean isValid(String str, int n)
{
 
    // If first character is invalid
    if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
        || (str.charAt(0)>= 'A' && str.charAt(0) <= 'Z')))
        return false;
 
    // Traverse the string for the rest of the characters
    for (int i = 1; i < str.length(); i++)
    {
        if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')))
            return false;
    }
 
    // String is a valid identifier
    return true;
}
 

    String isPalindrome(String S) {
       int n = S.length();
        if (isValid(S, n)) {

        char[] ch = S.toCharArray();
        char[] reversedCh = new char[n]; // Create a new array for the reversed characters

        // Reverse the characters and store them in reversedCh
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            reversedCh[i] = ch[j];
        }

        // Create strings from char arrays for comparison
        String reversedStr = new String(reversedCh);
        String originalStr = new String(ch);

        if (originalStr.equals(reversedStr))
            return "String is palindrome";

        else
            return "String is not palindrome.";
      } else {
         return "String is not valid";
      }
    }
};

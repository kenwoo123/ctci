package crackingcodinginterview;

/**
 *
 * @author kenwoo
 */
public class q1 {
    public static boolean isUnique(String s) {
        //Assume ASCII, so 256 possible characters
        int[] arr = new int[256];
        //inc counter for char, check if its greater than 1, return true if finish iterating
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (++arr[c] > 1)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
                System.out.println(word + ": " + isUnique(word));
        }
    }
}

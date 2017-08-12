package crackingcodinginterview;

/**
 *
 * @author kenwoo
 */
public class q2 {
    public static boolean checkPermutation(String string1, String string2) {
        //Check if length are equal, if not return false
        if (string1.length() != string2.length())
            return false;
        
        int[] arr = new int[256];
        
        //store ASCII equivalent of both string into arr
        for(char c : string1.toCharArray()) {
            arr[c]++;
        }
        
        //If ascii array count is less than 0, it means string2 has different 
        //char than string1
        for(char c : string2.toCharArray()) {
            if(arr[c]-- < 0) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bdeac";
        String s3 = "zdfsdf";
        
        System.out.println(checkPermutation(s1,s2));
        System.out.println(checkPermutation(s1,s3));
    }
}

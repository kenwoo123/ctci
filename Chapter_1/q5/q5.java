package crackingcodinginterview;

/**
 *
 * @author kenwoo
 */
public class q5 {
    
    public static boolean oneAway(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        
	//check if string is more than 1 away
	if(Math.abs(len1 - len2) > 1)
            return false;
        
        int oneAway = 0;
        
        //Check which length is greater if it is
        String less = len1 > len2 ? s2 : s1;
        String more = len1 > len2 ? s1 : s2;
        
        for(int i = 0, i2 = 0; i < len1; i++, i2++) {
            char c1 = less.charAt(i);
            char c2 = more.charAt(i2);
            if(c1 != c2) {
                oneAway++;
                if(oneAway > 1) return false;
                if(len2 > len1) {
                    i2++;
                    if(c1 != more.charAt(i2)) return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "bone";
        String s2 = "boneq";
        String s3 = "borne";
        String s4 = "corn";
        
        System.out.println(oneAway(s1, s2));
        System.out.println(oneAway(s1, s3));
        System.out.println(oneAway(s1, s4));
    }
}

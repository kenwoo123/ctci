/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingcodinginterview;

/**
 *
 * @author kenwoo
 */
public class q9 {
    public static boolean isRotation(String s1, String s2) {
        if(!(s1.length() > 0 && s2.length() > 0) || s1.length() != s2.length()) return false;
        String s1s1 = s1 + s1;
        return s1s1.contains(s2);
    }
    
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", ""}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }
}

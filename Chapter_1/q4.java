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
public class q4 {
        public static boolean palindromePermutation(String s) {
        int[] arr = new int[256];
        //Store values into array
        int size = s.length();
        for(int i = 0; i < size; i++) {
            arr[s.charAt(i)]++;
        }
        int oddCount = 0;
        //Check if values are at most 1 odd by iterating through it
        for(int i = 0; i < 256; i++) {
            if(arr[i]%2 != 0) {
                oddCount++;
                if(oddCount > 1)
                    return false;
            }
        }
        return true;
    }
        
    public static void main(String[] args) {
        String word1 = "tactcoapapa";
        String word2 = "tacooa";
        System.out.println(word1 + ": " + palindromePermutation(word1));
        System.out.println(word2 + ": " + palindromePermutation(word2));
    }
}

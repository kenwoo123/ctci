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
public class q3 {
    public static String urlLify(String s) {
        //size of char array to create
        int size = s.length();
        //check if each character is a space, if it is increase length by 2;
        for (char c : s.toCharArray()) {
                if (c == ' ')
                        size = size + 2;
        }
        char[] cArr = new char[size];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
                //store each c in its own idx, if its a space store %20
                if (s.charAt(i) != ' ') {
                    cArr[j] = s.charAt(i);
                }
                else {
                        cArr[j] = '%';
                        cArr[++j] = '2';
                        cArr[++j] = '0';
                }
            j++;
        }
        return new String(cArr);
    }
        
    public static void urlLify2(char[] cArr, int trueLength) {
        //Count number of spaces
        int spaces = 0;
        for (char c : cArr) {
            if (c == ' ') spaces++;
        }
        
        int index = trueLength + spaces * 2 - 1;
        for (int i = trueLength - 1; i >=0; i--) {
            if (cArr[i] != ' ') {
                cArr[index] = cArr[i];
                index--;
            } else {
                cArr[index] = '0';
                cArr[index-1] = '2';
                cArr[index-2] = '%';
                index -= 3;
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "abc d e f";
        char[] arr = new char[str.length() + 3 * 2];
        for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
        }
        System.out.println(urlLify(str));
        urlLify2(arr, str.length());	
        System.out.println(new String(arr));       
    }
    
}

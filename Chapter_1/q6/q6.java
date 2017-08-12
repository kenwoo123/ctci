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
public class q6 {
    public static String compressString(String s1) {
	//iterate through string, construct a new string
	char currChar = s1.charAt(0);
	StringBuilder sb = new StringBuilder();
	int counter = 1;
	for(int i = 1; i < s1.length(); i++) {
            //if not equal, append out letter and counter then reset count
            char nextChar = s1.charAt(i);
            if(currChar != nextChar) {
                sb.append(currChar);
                sb.append(counter);
                counter = 1;	
            } else {
                counter++;
            }
            currChar = nextChar;
	}
        sb.append(currChar);
        sb.append(counter);
	String s = sb.toString();
	return (s.length() >= s1.length()) ? s1 : s;
    }
        
    public static void main(String[] args) {
        String str = "abbccccccde";
        System.out.println(compressString(str));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingcodinginterview;

import static crackingcodinginterview.q7.rotateMatrix;
import java.util.ArrayList;

/**
 *
 * @author kenwoo
 */
public class q8 {
       public static int[][] zeroMatrix(int arr[][]) {
        //find all 0 and record their position in the array
        ArrayList<Integer> rows = new ArrayList();
        ArrayList<Integer> columns = new ArrayList();
        //Row
        for(int i = 0; i < arr.length; i++) {
            //Column
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        //Set every row and columns stored in that arraylist to 0
        for(int row : rows) {
            //set each column
            for(int i = 0; i < arr[0].length; i++)
                arr[row][i] = 0;
        }
        for(int column : columns) {
            //set each row
            for(int i = 0; i < arr.length; i++)
                arr[i][column] = 0;
        }
        return arr;
    }
       
    public static void main(String[] args) {
        int[][] matrix = {{1,2,0,4},{5,6,7,8},{8,9,10,11},{12,13,0,15}};
        zeroMatrix(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

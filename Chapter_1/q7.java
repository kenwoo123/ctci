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
public class q7 {
    
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for(int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - first - 1;
            
            for(int i = layer; i < last; i++) {
                
                int top = matrix[first][i];
                
                //Left to top
                matrix[first][i] = matrix[last - i + first][first];
                
                //Bottom to left
                matrix[last - i + first][first] = matrix[last][last - i + first];
                
                //Right to bottom
                matrix[last][last - i + first] = matrix[i][last];
                
                //Top to right
                matrix[i][last] = top;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{8,9,10,11},{12,13,14,15}};
        rotateMatrix(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

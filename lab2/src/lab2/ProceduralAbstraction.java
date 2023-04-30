/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author charles kelsey
 */
public class ProceduralAbstraction {
    //Requires: None 
    //Modifies: None 
    //Effects: Returns the smallest positive integer n for which n!  
    //         (i.e. 1*2*3*...*n) is greater than or equal to x, for positive  
    //         integer x. Otherwise returns 1.  
    public static int reverseFactorial(int x) {
        int y;
        for (int i = 2; x != i; i++) {
            y = x;
            if (i > x) {
                return (i - 1);
            } else {
                x = x / i;
            }
        }
        return x;
    } 
    
    //Requires: None 
    //Modifies: None 
    //Effects: If the matrix arr satisfies Nice property, prints the sum and  
    //         returns true. Otherwise returns false.  
    public static boolean isMatrixNice(int[][] arr) {
        int rows, cols, sumRow, sumCol;
        if (arr.length == arr[0].length) { //make sure the matrix is a square matrix
            //Calculates number of rows and columns present in given matrix 
            rows = arr.length;  
            cols = arr[0].length;
            
            //Calculates sum of each row of given matrix  
            for(int i = 0; i < rows; i++){  
                sumRow = 0;  
                for(int j = 0; j < cols; j++){  
                    sumRow = sumRow + arr[i][j];  
                }  
                System.out.println("Sum of " + (i+1) +" row: " + sumRow);
            }
            
            //Calculates sum of each column of given matrix  
            for(int i = 0; i < cols; i++){  
                sumCol = 0;  
                for(int j = 0; j < rows; j++){  
                    sumCol = sumCol + arr[j][i];  
                }  
                System.out.println("Sum of " + (i+1) +" column: " + sumCol);
            }
            
            //couldn't figure out how to create an if statement so that if all rows,
            //columns, and diagonals are equal then return true.
            return true;
            
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The reverse factorial of 24 is " + reverseFactorial(24));
        System.out.println("The reverse factorial of 25 is " + reverseFactorial(25));
        System.out.println("The reverse factorial of 23 is " + reverseFactorial(23));
        System.out.println("The reverse factorial of 121 is " + reverseFactorial(121));
        System.out.println("The reverse factorial of 119 is " + reverseFactorial(119));
        
        int a[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int b[][] = {{-3, 1, 0}, {4, -3, 4}, {7, -9, 0}};
        
        System.out.println("Is array a a nice matrix: " + isMatrixNice(a));
        System.out.println("Is array b a nice matrix: " + isMatrixNice(b));
    }
 
}

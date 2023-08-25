package algorithms;

import java.io.*;


public class StairCaseDownRight {


        /*
         * Complete the 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void staircase(int n) {
/*            for (int i = 1; i < n; i++) {
                for(int k = 1; k <= n - i; k++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {

                    System.out.print("#");
                }
                System.out.println("");

            }*/
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n - i - 1)
                        System.out.print(" ");
                    else
                        System.out.print("#");
                }
                // Display in a new line
                System.out.println();
            }
        }
    public static void main(String[] args) throws IOException {
        int n = 4;
        staircase(n);

    }
    }



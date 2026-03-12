package pzn.java.oop.application;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result2 {

    /*
     * Complete the 'getOneBits' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> getOneBits(int n) {
        // Write your code here

        List<Integer> arrData = new ArrayList<>();

        double maxConstrain = Math.pow(10, 9);
        if (n > 1 & n < maxConstrain){
            while (n>0){
                int bit = n % 2;
                arrData.add(0, bit);
                n = n/2;
            }
        }
        List<Integer> result = new ArrayList<>();
        if (arrData.size() != 0){
            result.add(0);
            var idx = 0;
            for (var val:arrData){
                idx+=1;
                if (val != 0){
                    result.set(0, result.get(0) + 1);
                    result.add(idx);
                }

            }
        }
        System.out.println(result);
        return result;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result2.getOneBits(n);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

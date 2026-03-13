package pzn.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Eko Rochi Pambudi";
        /**
         * This class will be process with lazy step so it will be more efficient for huge data
         */
        StringTokenizer tokenizer = new StringTokenizer(name," ");
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}

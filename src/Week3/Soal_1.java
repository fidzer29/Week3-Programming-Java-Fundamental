package Week3;

import java.io.*;
import java.util.*;
public class Soal_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()){
            System.out.println("0");
            return;
        }
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
        String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
        int size = tokens.length;
        System.out.println(size);
        for(int i=0; i<size; i++){
            System.out.println(tokens[i]);
        }
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String result;
        
        if (N % 2 != 0) {
            result = "Weird";
        } else {
            if ((N > 1 && N < 6) || N > 20) {
                result = "Not Weird";
            } else result = "Weird";
        }
        
        System.out.println(result);

        scanner.close();
    }
}
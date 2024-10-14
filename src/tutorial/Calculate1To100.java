package tutorial;

import java.io.IOException;

public class Calculate1To100 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        // i  = 1, 2, 3, 4
        //sum = 1, 3, 6, 10
        for(int i=1; i<=100; i++){
            //1, 2, 3, 4, 5 .... 100
            sum = sum + i;
        }
        System.out.println("The value of sum is : " + sum);
    }
}

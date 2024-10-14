package tutorial;

import java.io.IOException;

public class ReverseString {
    public static void main(String[] args) throws IOException {

        String str = "Hello";
        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

    }
}

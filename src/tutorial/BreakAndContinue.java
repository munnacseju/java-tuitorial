package tutorial;

public class BreakAndContinue {
    public static void main(String[] args) {
        // continue, break
        for(int i=1; i<=10; i++) {
            if(i%2==1)continue;
            if(i==8)break;
            System.out.println("Value of i = :" + i);
        }

    }
}

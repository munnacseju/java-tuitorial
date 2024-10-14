package tutorial;

public class LeargeNumber {
    public static void main(String[] args) {
        int x = 100, y = 200, z = 300;
//        if(x>y){
//            System.out.println("The large number is: " + x);
//        } else if (y>x) {
//            System.out.println("The large number is: " + y);
//        }else {
//            System.out.println("No large number");
//        }

        if(x>y && x>z){
            System.out.println("The large number is :" + x);
        } else if (y>x && y>z) {
            System.out.println("The large number is :" + y);
        } else if (z>x && z>y) {
            System.out.println("The large number is :" + z);
        }else {
            System.out.println("No large number");
        }
    }
}

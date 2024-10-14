package tutorial;

public class EnamAndSwitch {
    public static void main(String[] args) {
        enum Department{
            CSE,
            IIT,
            MATH
        }
        Department department = Department.CSE;

        switch(department){
            case CSE:
                System.out.println("The department is CSE");
                break;
            case IIT:
                System.out.println("The department is IIT");
                break;
            case MATH:
                System.out.println("The department is MATH");
                break;
            default:
                System.out.println("No department here");
        }
    }
}

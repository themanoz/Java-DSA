import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char grade = s.next().charAt(0);

        double hra = 0.2 * basic;
        double da = 0.5 * basic;

        int allowance;
        if(grade == 'A'){
            allowance = 1700;
        }
        else if(grade == 'B'){
            allowance = 1500;
        }
        else{
            allowance = 1300;
        }

        int pf = (int) (0.11 * basic);

        int totalSalary = (int) (basic+hra+da+allowance -pf);
        System.out.println(totalSalary);
    }
}

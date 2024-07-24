import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Hindi :");
        double Hindi = sc.nextDouble();
        System.out.println("Enter marks of English :");
        double English = sc.nextDouble();
        System.out.println("Enter marks of Maths :");
        double Maths = sc.nextDouble();
        System.out.println("Enter marks of SST :");
        double SST = sc.nextDouble();
        System.out.println("Enter marks of IP :");
        double IP = sc.nextDouble();

        double total = Hindi + English + Maths + SST + IP;
        double per = total / 5;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + per);

        if (per >= 33) {
            if (per >= 45) {
                if (per >= 60) {
                    System.out.println("First Division");
                } else {
                    System.out.println("Second Division");
                }
            } else {
                System.out.println("Third Division");
            }
        } else {
            System.out.println("Fail");
        }
    }
}
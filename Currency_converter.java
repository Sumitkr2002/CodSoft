import java.util.*;
import java.text.DecimalFormat;

public class Currency_converter {
    public static void main(String[] args) {
        double rupee, dollar, pound, code, euro;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "*** Welcome to Currency Converter Project ***\nEnter the currency code: \n1: Rupee\n2: Dollar\n3: Pound\n4: Euro");
        code = sc.nextInt();

        if (code == 1) {
            System.out.println("Enter amount in Rupee:");
            rupee = sc.nextDouble();
            dollar = rupee / 77.34;
            System.out.println("Dollar: " + f.format(dollar));
            pound = rupee / 94.46;
            System.out.println("Pound: " + f.format(pound));
            euro = rupee / 80.36;
            System.out.println("Euro: " + f.format(euro));
        } else if (code == 2) {
            System.out.println("Enter amount in Dollar:");
            dollar = sc.nextDouble();
            rupee = dollar * 77.34;
            System.out.println("Rupee: " + f.format(rupee));
            pound = dollar * 0.82;
            System.out.println("Pound: " + f.format(pound));
            euro = dollar * 0.96;
            System.out.println("Euro: " + f.format(euro));
        } else if (code == 3) {
            System.out.println("Enter amount in Pound:");
            pound = sc.nextDouble();
            rupee = pound * 94.46;
            System.out.println("Rupee: " + f.format(rupee));
            dollar = pound * 1.22;
            System.out.println("Dollar: " + f.format(dollar));
            euro = pound * 1.17;
            System.out.println("Euro: " + f.format(euro));
        } else if (code == 4) {
            System.out.println("Enter amount in Euro:");
            euro = sc.nextDouble();
            rupee = euro * 80.36;
            System.out.println("Rupee: " + f.format(rupee));
            dollar = euro * 1.04;
            System.out.println("Dollar: " + f.format(dollar));
            pound = euro * 0.85;
            System.out.println("Pound: " + f.format(pound));
        } else {
            System.out.println("Invalid Code!");
        }
    }
}

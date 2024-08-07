import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price, sum = 0, vat, disc=0;
        String id;
        int pass;
        System.out.println("Enter your ID: ");
        id = in.nextLine();
        System.out.println("Enter your password: ");
        pass = in.nextInt();

        ArrayList<Double> prices = new ArrayList<>();
        System.out.println("Enter item prices, enter 0 to stop");

        while (true) {
            price = in.nextDouble();

            if (price == 0) {
                break;
            }

            prices.add(price);
        }

        for (double p : prices) {
            sum += p;
        }

        System.out.println("Sum = " + sum);
        System.out.println("is vat added?");
        String addVat = in.next();

        if (addVat.equals("yes")) {
            vat = sum + (0.13 * sum);
            System.out.println("vat added price: Rs " + vat);
        } else {
            vat = sum;
            System.out.println("vat isn't added.");
        }

        System.out.println("do you have discount?");
        String addDisc = in.next();

        if (addDisc.equals("yes")) {
            System.out.println("enter the discount percent (only less than 50):");
            double discPct = in.nextDouble();
            if (discPct < 50) {
                disc = vat - ((discPct / 100) * vat);
            }
        }
        else {
            disc = vat;
        }

        System.out.println("total discount " + disc);

        System.out.println("do the payment now:");
        double paid = in.nextDouble();
        int change = (int) (paid - disc);

        if (change >= 1000) {
            int times = change / 1000;
            System.out.println("1000 Rupee  " + times);
            change -= 1000 * times;
        }

        if (change >= 500) {
            int times = change / 500;
            System.out.println("500 Rupee  " + times);
            change -= 500 * times;
        }

        if (change >= 100) {
            int times = change / 100;
            System.out.println("100 Rupee  " + times);
            change -= 100 * times;
        }

        if (change >= 50) {
            int times = change / 50;
            System.out.println("50 Rupee  " + times);
            change -= 50 * times;
        }

        if (change >= 20) {
            int times = change / 20;
            System.out.println("20 Rupee  " + times);
            change -= 20 * times;
        }

        if (change >= 10) {
            int times = change / 10;
            System.out.println("10 Rupee  " + times);
            change -= 10 * times;
        }

        if (change >= 5) {
            int times = change / 5;
            System.out.println("5 Rupee  " + times);
            change -= 5 * times;
        }

        if (change >= 1) {
            int times = change;
            System.out.println("1 Rupee  " + times);
            change -= times;
        }

        System.out.println("byebye shop again");
    }
}

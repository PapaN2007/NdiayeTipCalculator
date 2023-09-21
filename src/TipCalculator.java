import java.util.Scanner;
public class TipCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip Calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        scan.nextLine();
        double tipDecimal = (double) tip / 100;
        double total = 0;
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50: ");
        double cost = scan.nextDouble();
        total += cost;

        while (cost != -1){
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50: ");
            cost = scan.nextDouble();
            total += cost;
        }

        double totaltip = total * tipDecimal;
        double totalbill = total + totaltip;
        System.out.println("----------------------------------------");
        System.out.println("Total bill before tip: " + total);
        System.out.println("Tip Percentage: " + tip);
        System.out.println("Total tip: $" + totaltip);
        System.out.println("Total bill with tip: " + totalbill);



    }
}

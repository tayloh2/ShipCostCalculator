//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ItemPrice = 0;
        double NewPrice = 0;
        System.out.println("Enter the price of your item.");
        ItemPrice = in.nextDouble();

        if(ItemPrice >= 100)
        {
         in.nextLine();
        System.out.println("You have free shipping! Your total cost is " + ItemPrice);
    }
    else
    {
        in.nextLine();
        NewPrice = ItemPrice + (ItemPrice * 0.02);
        System.out.println("Your cost for shipping is " + (ItemPrice * 0.02) + "and your total cost is " + NewPrice);

    }
        }
    }

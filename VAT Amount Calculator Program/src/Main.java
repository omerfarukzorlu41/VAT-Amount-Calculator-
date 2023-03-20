import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double number,vatRate,vatAmount,vatWithPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();
        if(0 <= number && number <= 1000){
           vatRate = 0.18;
           vatAmount = vatRate*number;
           vatWithPrice = number+vatAmount;

           System.out.println("Number: "+number);
           System.out.println("VAT Rate: "+vatRate);
           System.out.println("VAT Amount: "+vatAmount);
           System.out.println("VAT With Price: "+vatWithPrice);
        } else{
            vatRate = 0.08;
            vatAmount = vatRate*number;
            vatWithPrice = number+vatAmount;

            System.out.println("Number: "+number);
            System.out.println("VAT Rate: "+vatRate);
            System.out.println("VAT Amount: "+vatAmount);
            System.out.println("VAT With Price: "+vatWithPrice);
        }
    }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while(true) {
    float quantum;
    float rate; 
    int term;  
    float monthlyPayment;
    do { 
      System.out.print("Please Enter the loan quantum:");
      quantum = scanner.nextFloat();
    } while (quantum < 100000 || quantum > 15000000) ;
    
    do {
      System.out.print("Please enter a valild interest rate:");
      rate = scanner.nextFloat();
    } while (rate < 0 || rate > 25);
    
    do {
      System.out.print("Please enter the loan term in months:");
      term = scanner.nextInt(); 
    } while (term < 0 || term > 360);
    
    monthlyPayment = quantum * (rate / 1200) * (float) Math.pow(1 + (rate / 1200), term) / (float) (Math.pow(1 + (rate / 1200), term) - 1);

    System.out.println("The monthly repayment is: $" + 
 monthlyPayment); 
    }
  }
}
package program1_calculate;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declaring a scanner object
        Scanner sca = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter First Number: ");//input wizard
            int a = sca.nextInt();
            System.out.println("Please enter Second Number: ");//input wizard
            int b = sca.nextInt();
            System.out.println("Please enter the sumbol +,-,*,/: ");//input wizard
            char symbol = sca.next().charAt(0);
            Calculator calculator=new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would ypu like to do more calculations Please enter 'Y or 'N: ");//input wizard
            answer = sca.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //closing a scanner object
        sca.close();
    }
}

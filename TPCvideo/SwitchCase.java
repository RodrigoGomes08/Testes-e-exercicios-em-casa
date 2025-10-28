import java.util.Scanner;

/**
 * Escreva uma descrição da classe SwitchCase aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class SwitchCase
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter the second number: ");
        String operation = scanner.nextLine();
        
        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "div":
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                break;
            default:
                System.out.printf("%s is not a supported operation.", operation);
        }
    }
}
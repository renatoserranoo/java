import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number1 = input.nextInt();
        System.out.println(number1);
        int number2 = input.nextInt();
        System.out.println(number2);

        if(number1 == number2){
            System.out.println("é igual");
        }
        if(number1 <= number2){
            System.out.println("é menor ou igual");
        }
        if(number1 >= number2){
            System.out.println("é maior ou igual");
        }
        if(number1 != number2){
            System.out.println("é diferente");
        }
    }
}

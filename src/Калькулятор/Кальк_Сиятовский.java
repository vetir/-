package Калькулятор;
import java.util.Scanner;

public class Кальк_Сиятовский {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Произведите ваше вычисление введя число1, действие (+, -, *, /) и число2 через пробел: ");
        num1 = reader.nextDouble();
        op = reader.next().charAt(0);
        num2 = reader.nextDouble();
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.print("Ошибка, введите корректное действие!");
                return;
        }
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
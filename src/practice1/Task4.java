package practice1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, факториал которого хотите найти ");
        number = scanner.nextInt();
        System.out.println(factorial(number));
    }

    public static int factorial(int number){
        if(number > -1){
            int result = 1;
            for(int i = 1; i <= number; i++){
                result *= i;
            }
            return result;
        }else{
            System.out.println("Number < 0 Error");
            System.exit(0);
            return 1;
        }
    }
}

package practice1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int summa = 0;

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
            summa += array[i];
        }

        System.out.println("Summa = " + summa);
        System.out.println("Average = " + summa * 1.0 / size);
    }
}

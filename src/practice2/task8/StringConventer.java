package practice2.task8;
import java.util.Scanner;
import java.util.Arrays;

public class StringConventer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] str = new String[size];
        for(int i = 0; i < size; i++){
            str[i] = scanner.next();
        }

        for(int i = 0; i < size / 2; i++){
            String middle = str[i];
            str[i] = str[size - i - 1];
            str[size-i-1] =  middle;
        }

        System.out.println(Arrays.toString(str));
    }
}

package practice2.task10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            count++;
            String str = sc.next();
            if(str.equals("exit")){
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}

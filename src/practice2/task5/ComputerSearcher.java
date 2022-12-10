package practice2.task5;

import java.util.ArrayList;
import java.util.Scanner;
public class ComputerSearcher implements ComputerSearch {
    public ArrayList<Computer> read(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Computer> array = new ArrayList<>();
        array.ensureCapacity(size);
        for(int i = 0; i < size; i++){
            String name = scanner.next();
            array.add(new Computer(name));
        }
        return array;
    }
}

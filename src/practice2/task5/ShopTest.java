package practice2.task5;

public class ShopTest {
    public static void main(String[] args){
        Shop tester = new Shop();
        System.out.println(tester.findComputer("asus"));
        tester.removeComputer("asus");
        System.out.println(tester.findComputer("asus"));
        tester.addComputer("asus");
        System.out.println(tester.findComputer("asus"));
    }
}

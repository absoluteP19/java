package practice2.task5;

public class Computer {
    private String name;
    public Computer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }
}

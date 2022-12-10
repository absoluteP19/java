package practice2.task4;

public class Dog {
    private String name;
    private int age;

    public Dog(){}
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;

    }

    public int conventer(){
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", humanAge=" + conventer() +
                '}';
    }

}
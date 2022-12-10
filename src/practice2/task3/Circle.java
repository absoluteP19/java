package practice2.task3;

public class Circle {
    private Point point;
    private double radius;

    public Circle(Point point, double radius){
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint(){
        return point;
    }

    public double getRadius(){
        return radius;
    }

    public void setPoint(Point point){
        this.point = point;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius =" + radius +
                '}';
    }






}

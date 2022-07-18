package zadachi.den9.z2;

public class Rectangle extends Figure{

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        double s = width*height;
        return s;
    }


    @Override
    public double perimeter() {
        double p;
        p=2*(width + height);
        return p;
    }
}

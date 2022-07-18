package zadachi.den9.z2;

public class Circle extends Figure{

  private double circleRadius;

    public Circle( double circleRadius,String color) {
        super(color);
        this.circleRadius = circleRadius;
    }


    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        double s;
        s = Math.PI*(Math.pow(circleRadius,2));
        return s;
    }

    @Override
    public double perimeter() {
        double p;
        p = 2*Math.PI*circleRadius;
        return p;
    }
}

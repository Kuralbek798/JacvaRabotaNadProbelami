package zadachi.den9.z2;

public class Triangle extends Figure{

    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle( double lengthA, double lengthB, double lengthC,String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }


    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }



    @Override
    public double area() {
        double s;
        double p = perimeter()/2;

        s =Math.sqrt(p*(p-lengthA)*(p-lengthB)*(p-lengthC));
        return s;
    }
    @Override
    public double perimeter() {
        double p;
        p = lengthA + lengthB + lengthC;
        return p;
    }
}

package zadachi.den9.z2;

public class Test {
    public static void main(String[] args) {

       /* Circle circle = new Circle("red",5);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());*/
        Figure[]figures = { new Triangle(10,10,10, "Red"),
                            new Triangle(10,20,30,"Green"),
                            new Triangle(10,20,15,"Red"),
                            new Rectangle(5,10,"Red"),
                            new Rectangle(40,15,"Orange"),
                            new Circle(4,"Red"),
                            new Circle(10, "Red"),
                            new Circle(5,"Blue")};

System.out.println(calculateArea(figures));
System.out.println(calculateRedPerimeter(figures));

    }

    public static double calculateRedPerimeter(Figure[]figures ){
         double sum = 0;
        for (Figure figuras: figures) {
         if( figuras.getColor().equals("Red"))
             sum = sum + figuras.perimeter();

        }

        return sum;
    }
    public static double calculateArea(Figure[] figures){
        double sum = 0;
        for (Figure figuras:figures) {
            if(figuras.getColor().equals("Red"));
            sum += figuras.area();
        }
        return sum;
    }

}

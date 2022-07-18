package nested_class.nested_static_class;

public class Car {
    /* static nested класс очень похож на обычный внешний, но находится в нутри другого класса
    * Создавая обьект static nested класса, нужно указывать и класс, содержащий его
    * static nested класс может содержать static и non-static элементы
    * ststic nested класс может обращаться даже к private элементам внешнего класса, но только к static
    * Внешний класс может обращаться даже к private элементам static nested класса
    * */

    String color;
    int doorCount;
    Engine engine;
    private static int element; // static private

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int capacity; // не static элементы
        static int countOfEngineCreated; // static элемент

        public Engine(int capacity) {
            this.capacity = capacity;
            countOfEngineCreated++;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "capacity=" + capacity +
                    '}';
        }
    }
}
    class Test{
        public static void main(String[] args){
            Car.Engine engine = new Car.Engine(256); //создаем обьект engine используя класс Car но
                                                            // не создавая обьект car
          System.out.println(engine);
          Car car = new Car("red",2, engine);
          System.out.println(car);

        }

    }


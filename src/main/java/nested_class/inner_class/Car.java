package nested_class.inner_class;

public class Car {
    /* каждый объект inner класса всегда ассоциируется с объектом внешнего класса
    * Создавая объект inner класса, нужно перед этим создать объект внешнего класса
    * inner класс может содержать только non-static элементы
    * inner класс может обращаться даже к private элементам внешнего класса
    * Внешний класс может обращаться даже к private элементам inner класса, прежде создав его объект*/

    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(capacity);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String toString() {
        return "Car{" +
                "color=" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int capacity;

        public Engine(int capacity) {
            this.capacity = capacity;
        }

        public String toString() {
            return "Engine{" +
                    "capacity=" + capacity +
                    '}';
        }

    }
}
class Test{
    public static void main(String[] args){
         Car car = new Car("black",4);
      Car.Engine engine = car.new Engine(150);
car.setEngine(engine);
      System.out.println(car);
    }
}

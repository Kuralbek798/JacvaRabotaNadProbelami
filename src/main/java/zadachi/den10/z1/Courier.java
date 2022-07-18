package zadachi.den10.z1;

public class Courier implements Worker {

    private Warehouse w;

    private int salary;

    private final int TASK_SALARY = 100;

    private int earnedMoney;


    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Courier{" +
                "w=" + w +
                ", salary=" + salary +
                "' earnedMoney" + earnedMoney +
                '}';
    }

    /**
     *
     */
    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrders();

    }

    /**
     *
     */
    @Override
    public void bonus() {
        if(w.getCountDeliveredOrders() == 10_000){
            System.out.println("Количество доставленных товаров: " + w.getCountDeliveredOrders());
            earnedMoney = salary + 100_000;
            salary = 0;
            w.setCountDeliveredOrders(0);
            return;
        }else
            System.out.println("Бонус не доступен");
           return;
    }
}

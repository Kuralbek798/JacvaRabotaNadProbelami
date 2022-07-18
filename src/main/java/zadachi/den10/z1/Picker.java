package zadachi.den10.z1;

public class Picker implements Worker {
    private Warehouse w;
    private int salary;
    private final int TASK_SALARY = 80;

    private int earnedMoney;

    public int getEarnedMoney() {
        return earnedMoney;
    }

    public void setEarnedMoney(int earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    public Picker(Warehouse w) {
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
        return "Picker{" +
                "w=" + w +
                ", salary=" + salary +

                ", earnedMoney=" + earnedMoney +
                '}';
    }

    /**
     *
     */
    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementPickedOrders();
    }

    /**
     *
     */
    @Override
    public void bonus() {
     if(w.getCountPickedOrders() == 10_000) {
         System.out.println("Количество собранных товаров: " + w.getCountPickedOrders());
         earnedMoney = salary + 70_000;
         salary=0;
         w.setCountPickedOrders(0);
         return;
     }
     else
         System.out.println("бонус не доступен");
     return;
    }
}
class Test{
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        /*picker.doWork();
        System.out.println(picker.getEarnedMoney());
        System.out.println(warehouse.getCountPickedOrders());*/

        works(picker);

        System.out.println(picker);
        System.out.println(warehouse);
        System.out.println();
        works(courier);
        System.out.println(courier);
        System.out.println(warehouse);
    }
    public static void works(Worker worker){

        for (int i = 1; i <= 10000; i++) {
          worker.doWork();
        }
        worker.bonus();


    }

}
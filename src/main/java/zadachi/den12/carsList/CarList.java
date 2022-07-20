package zadachi.den12.carsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarList {

/*
    1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
    Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
     Вывести список в консоль.
*/

    public static void main(String[] args) {

        List<String> CarList = new ArrayList<>();
        Collections.addAll(CarList, "BMW", "Audi", "Mercedes","Lada", "Corvette");

        CarList.add(3,"Mazda");
        System.out.println();
        for (String dfd:CarList ) {
            System.out.print(dfd + ",");
        }
        System.out.println();
        CarList.remove(0);
        for (String df:CarList ) {
            System.out.print(df + ",");
        }




    }
}

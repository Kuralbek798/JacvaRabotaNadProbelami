package zadachi.den12.carsList;

import java.util.ArrayList;
import java.util.List;

public class NumList {
    public static void main(String[] args) {


        List<Integer> Nums = new ArrayList<>();
        List<Integer> sdf = new ArrayList<>();

        for (int i = 0; i < 555; i++) {

            if (i > 0 && i<=30 || i>299 && i<=350){
                if(i % 2 == 0){
                    sdf.add(i);
                }


            }

        }
        for (Integer s:sdf) {
            System.out.println(s);
        }

    }

}

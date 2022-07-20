package zadachi.den12.girl_with_dolls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Girl {
private String name;
private int age;
private List<Doll> dolls = new ArrayList<>();

/*public Girl(){
    this.name = "";
    this.dolls = new ArrayList<>();
}*/
public Girl(String name, int age, List<Doll> dolls ){
    this.name = name;
    this.age = age;
    this.dolls = dolls;
}


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public List<Doll> getDolls() {
        return this.dolls;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDolls(List<Doll> dolls) {
        this.dolls = dolls;
    }
}

class Test{
   public static void main(String[] args) {
        List<Doll> dollList = new ArrayList<>();
      /*   dollList.add(new Doll("Barbie", "Mattel"));
        dollList.add(new Doll("Princess", "Hasbro"));

        Girl girl = new Girl("Suzi",35,dollList);

    }*/

    Girl girl = new Girl ("Zhana",37, Arrays.asList(new Doll("Barbie", "Mattel"),
            new Doll("Princess", "Hasbro")));



       for (Doll doll : girl.getDolls())
           System.out.println(doll.getName());

}
}
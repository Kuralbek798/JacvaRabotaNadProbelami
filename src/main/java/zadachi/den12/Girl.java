package zadachi.den12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
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


}

 class Doll{
    private String name;
    private String manufacturer;

    public Doll(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }
}

class Test{
  /*  public static void main(String[] args) {
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll("Barbie", "Mattel"));
        dollList.add(new Doll("Princess", "Hasbro"));

        Girl girl = new Girl("Suzi",35,dollList);

    }*/
}
package zadachi.den9.z1;

import lombok.*;


@Getter
@Setter
//@AllArgsConstructor
public class Human {
   String name;

    public Human(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + name );
    }
}

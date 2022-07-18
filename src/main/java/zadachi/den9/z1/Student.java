package zadachi.den9.z1;

import lombok.*;

/*@Getter*/
public class Student extends Human{



    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo(){
        super.printInfo();
       System.out.println("Этот студент с именем имя: " + name);

   }

}

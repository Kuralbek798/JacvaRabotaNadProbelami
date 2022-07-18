package zadachi.den9.z1;

import lombok.Getter;

/*@Getter*/
public class Teacher extends Human {
    private final String subjectName;



    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем имя: " + name);
    }

    public String getSubjectName() {
        return subjectName;
    }
}

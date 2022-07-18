package zadachi.den9.z1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Bob", "Java");
        Teacher teacher = new Teacher("Jhon", "Java");
        student.printInfo();
        System.out.println(student.getGroupName());
        teacher.printInfo();
        System.out.println(teacher.getSubjectName());
    }
}

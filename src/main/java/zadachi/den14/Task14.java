package zadachi.den14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        File file = new File("src/main/resources/people");
       System.out.print( parseFileToObjList(file));
    }
    public static List<Person> parseFileToObjList(File file){
        List<Person> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] lin = (line.split(" "));


                int[] ages = {Integer.parseInt(lin[1])};
                if (Integer.parseInt(lin[1]) < 0)
                    throw new IllegalArgumentException();
                System.out.println(Arrays.toString(ages));


                persons.add(new Person(lin[0], ages[0] /*Integer.parseInt(lin[1])*/));


            }scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
           // throw new RuntimeException(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Не корректные входные параметры не возможно создать объект");
        }
        return persons;
    }
}

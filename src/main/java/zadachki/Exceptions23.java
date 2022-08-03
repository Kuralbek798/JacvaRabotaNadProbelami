package zadachki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptions23 {
/*    public static void main(String[] args)  {

        File file = new File("src/main/resources/rewq");
        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();

          if(line.length() != 10)throw new IllegalArgumentException();
            {
                printSumDigits(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        } catch(IllegalArgumentException e){
                    System.out.println("Некорректный входной файл");
        }

    }

    private static void printSumDigits(String line) {
        String[] numbersString = line.split("");
        //System.out.println(Arrays.toString(numbersString));
        int[] numbers = new int [10];
        int sum = 0;
        for (int i = 0; i <= numbers.length-1; i++) {
            numbers[i]= Integer.parseInt(numbersString[i]);
          sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println((sum));
    }



}*/


    public static void main(String[] args) {
        File file = new File("src/main/resources/people");
        System.out.println(parseFileToStringlist(file));
    }

    public static List<String> parseFileToStringlist(File file) {


        List<String> lin = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
               String [] chel = line.split(" ");
               if (Integer.parseInt(chel[1]) < 0 )
                    throw new IllegalArgumentException();


              lin.add(line);
            }

            return lin;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            System.out.println("Не коректные входные параметры");
        }

       return lin = null;
    }



}

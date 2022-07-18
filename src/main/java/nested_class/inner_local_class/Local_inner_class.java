package nested_class.inner_local_class;

public class Local_inner_class {
    public static void main(String[] args){
        Math math = new Math();
        math.getResult();
    }

}
class Math{
    private int a = 10;
    public void getResult(){
        /*Local inner класс располагается в блоках кода таких, как, например, метод или конструктор.
        * Local inner класс не может быть static(как и локальная переменная).
        * Область видимости Local inner класса - это блок, в котором он находится(метод или конструктор)
        * Local inner класс может обращаться даже к private элементам внешнего класса
        * Local inner класс может обращаться к элементам блока, в котором он написан при условии,
        * что они final или effectively final - после инициализации мы не можем изменить значение (ни как НЕ ОБОЗНАЧАЕТСЯ) */

        final int peremennaya = 23;

        class Delenie{
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                System.out.println("прайвит переменная внешнего класса класса " +  a);
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
        System.out.println("файнал переменная блока(внутри метода но не inner class) " + peremennaya );

    }
}

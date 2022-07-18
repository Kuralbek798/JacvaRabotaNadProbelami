package zadachki;

import java.util.List;
/*Создать класс User, содержащий private переменные login, password.
Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(),
который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем отправил запрос.
Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
В методе main(): создать экземпляр класса User и вызвать метод createQuery();
создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();*/

public class User {
    private  String login;
    private  List<Character> password;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Character> getPassword() {
        return password;
    }

    public void setPassword(List<Character> password) {
        this.password = password;
    }

    public void createQuery(){
        User.Query query = new User.Query();
        query.printToLog();
}



    public  class Query{
        public void printToLog(){
            System.out.println("The User with that password: " + password + " and " + login );
        }
    }
}

class Test{
    public static void main(String[] args) {

        User user = new User();
        user.createQuery();
        user.new Query().printToLog();
        User.Query query = new User().new Query();
        query.printToLog();
    }

}

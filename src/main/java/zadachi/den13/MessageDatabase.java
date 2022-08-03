package zadachi.den13;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    public MessageDatabase() {
    }

    public static void addNewMessage(User u1, User u2, String text){
messages.add(new Message(u1, u2,text));

    }

/*    public static List<Message> getMessages(){

    }*/

    public static void showDilog(User u1, User u2){
        for (Message message:messages) {
            if(message.getSender() == u1 && message.getReceiver() == u2 || message.getSender() == u2 && message.getReceiver() == u1){
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageDatabase;
    }



}
 class Test{

    public static void main(String[] args){
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hello from user1");
        user2.sendMessage(user2, "How are you?");

        user2.sendMessage(user1,"Hi user1 !");
        user2.sendMessage(user1,"I'am user2. Nice to meet you.");
        user2.sendMessage(user1, "I'am fine, and you?");

        user3.sendMessage(user1,"Hey my name user3.");
        user3.sendMessage(user1, "Do you remember me?");
        user3.sendMessage(user1, "We went to the same school");

        user1.sendMessage(user3, "Hey, user3. Of course i remember you!");
        user1.sendMessage(user3, "So nice nice to see you again");
        user1.sendMessage(user3,"Let's meet up. Are you free tomorrow?");

        user3.sendMessage(user1, "Yep, i'm free tomorrow. Let's go.");

        //MessageDatabase.showDilog(user1,user3);
        MessageDatabase.showDilog(user1,user2);





















    }
 }
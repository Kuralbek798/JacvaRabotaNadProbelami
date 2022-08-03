package zadachi.den13;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender +
                ", TO: " + receiver +
                ", Текст сообщения' " + text + '\'' +
                ", ON: " + date +
                '}';
    }

}
package zadachi.den13;


import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }


    public void subscribe(User user){
      this.subscriptions.add(user);
    }

    public boolean isSuscribed(User user){
        return this.subscriptions.contains(user);
           
    }  
            
        

    public boolean isFriend(User user){
        return this.subscriptions.contains(user) && user.getSubscriptions().contains(this);
    }

    public void sendMessage(User user, String text){
     MessageDatabase.addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public String getUserName() {
        return this.userName;
    }

    public List<User> getSubscriptions() {
        return this.subscriptions;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }
}

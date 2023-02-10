public class Twitter extends Network {
     public void login(String name,String password){
            System.out.println("Logging in to Twitter");
        
    }
    public void logout(){
        System.out.println("User"+this.name+"was posted on Twitter");

    }
    public void sendData(String message){
        System.out.println("Message: "+message+" was sent to Twitter");

    }
}

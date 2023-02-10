public abstract class  Network   {
    String name;
    String password;

    public abstract void login(String name,String password);
    public abstract void logout();
    public  abstract void sendData(String message);
    public void post(String message){
        login(name, password);
        sendData(message);
        logout();
    }
}
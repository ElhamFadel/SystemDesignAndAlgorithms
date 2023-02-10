import javax.swing.text.html.StyleSheet;

class Facebook extends Network{

   public void login(String name,String password){
         System.out.println("Logging in to Facebook");
    }
    public void logout(){
        System.out.println("User"+this.name+"was posted on Facebook");

    }
    public void sendData(String message){
        System.out.println("Message: "+message+" was sent to Facebook");
    }

}
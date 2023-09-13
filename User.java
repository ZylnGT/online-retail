package RetailSystemFiles;
public class User{
   protected int userId;
   protected String userName;
   protected String email;
   
   public User(int usId, String usName, String em){
      this.userId = usId;
      this.userName = usName;
      this.email = em;
   }
   
   public User(){
      this.userId = 0;
      this.userName = "";
      this.email = "";
   }
   
   public void setUserId(int id){
      userId = id;
   }
   
   public void setUserName(String name){
      userName = name;
   }
   
   public void setEmail(String email){
      this.email = email;
   }

   public String getName(){
      return userName;
   }
   
   public void LogIn(){
      System.out.println("User logged in");
   }
   
   public void LogOut(){
      System.out.println("User logged out");
   }



   public String toString(){
      return "user ID: " + userId + "\nusername: " + userName + " \nemail: " + email;
   }
}
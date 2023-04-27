
package prog5121part1;
import java.util.regex.*;
import java.util.Scanner;


public class Login {
    static String username;
    static String password;
    static String firstname;
    static String lastname;
    static String username1;
    static String password1;

         
    public static boolean checkUserName(String username){
         Scanner input = new Scanner(System.in);
        System.out.println("Enter username ");
        username = input.nextLine();
        
        /*.contains is to check if the string has the underscore character
            and the .length is to check the number of chracters the string
         */
        if (username.contains("_") && username.length() <= 5) {
            
            
            return true;
        } else {

            return false;
        }

     }
    public static boolean checkPasswordComplexity(String password){
        //
        Scanner input=new Scanner(System.in);
          System.out.println("Enter password ");
        password = input.nextLine();
        
        String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + "(?=.*[-+_!@#$%^&*., ?]).+$";

        // Compiles the ReGex
        Pattern x = Pattern.compile(regex);

        // Find match between given string
        // and regular expression
        Matcher p = x.matcher(password);

        // matches ReGex
        if (p.matches() && password.length() >= 8) {
            
            return true;

        } else {
            return false;
        }

     }
    
   public void registerUser(){
       if (checkUserName(username)){
           System.out.println("username successfully captured.");
    }else{
           System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .");
          
       }
       if(checkPasswordComplexity(password)){
           System.out.println("Password successfully captured.");
       }else{
           System.out.println("Password is not correctly formatted,  please ensure that  the password contains at least 8 characters, a capital letter, a number and a special character.");
           
       }
       }

    public static boolean loginUser(String username,String password) {
        Scanner input = new Scanner(System.in);
        System.out.println("Login to your account");
        System.out.println("Enter your username");
        username1 = input.nextLine();
        System.out.println("Enter your password");
        password1 = input.nextLine();
        
        if (username1.equals(username) && password1.equals(password)) {
           
            return true;
        } else {
            return false;

        }
    }
   public void returnLoginStatus(){
        if(loginUser(username, password)){
            System.out.println("Welcome "+ firstname+""+lastname+" it is great to see you again.");
        }else{
            System.out.println("Username or password is incorrect, please try again");
            
        }
      
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter first name");
         firstname=input.nextLine();
         System.out.println("Enter last name");
         lastname=input.nextLine();
        Login k1 = new Login();
          k1.registerUser();
          k1.returnLoginStatus();
    }
    
}


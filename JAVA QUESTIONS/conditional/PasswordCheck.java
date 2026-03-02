import java.util.*;
public class PasswordCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password : ");
        String pass = sc.nextLine();
        if(pass.equals("DreamBig2026")){
            System.out.print("Access Granted");
        }
        else 
         System.out.print("Access Denied");
        sc.close();
    }
}
import java.util.*;
public class pass_fail {
    public static void main(String[] args){
        System.out.print("Enter the Marks:");
        Scanner sc = new Scanner (System.in);
        int marks = sc.nextInt();
        if(marks >= 40){
            System.out.print("Pass");
        }
        else {
            System.out.print("Fail");
        }
        sc.close();
    }
    
}

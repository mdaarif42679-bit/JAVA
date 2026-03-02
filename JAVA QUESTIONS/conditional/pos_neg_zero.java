import java.util.*;
public class pos_neg_zero {
    public static void main(String[] args){
        System.out.print("Enetr the number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n > 0){
            System.out.print("Positive");
        }
        else if (n < 0){
            System.out.print("Negative");
        }
        else { 
            System.out.print("Zero");
        }
        sc.close();


    }
    
}

import java.util.*;
public class greatest_no {
    public static void main(String[] args){
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
         System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        if(a > b){
            System.out.print("Greatest a = " + a);
        }
        else { 
            System.out.print("Greatest b = " + b);
        }
        sc.close();
    }
    
}
// In Short 
// import java.util.*;
// public class greatest_no {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter 2nd number: ");
//         int b = sc.nextInt();  
//         System.out.println("Greatest = " + (a > b ? a : b));
//         sc.close();
//     }
// }
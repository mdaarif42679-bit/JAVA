import java.util.Scanner; 
 
public class GreaterThree { 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: "); 
       int a = sc.nextInt(); 
       System.out.print("Enter second number: "); 
       int b = sc.nextInt(); 
       System.out.print("Enter third number: "); 
       int c = sc.nextInt(); 
       if(a >= b && a >= c) 
           System.out.println("Greatest: " + a); 
       else if(b >= c) 
           System.out.println("Greatest: " + b); 
       else 
           System.out.println("Greatest: " + c); 
        sc.close();
   } 
} 


// in short
// import java.util.*;

// public class greater {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//         System.out.println("Greatest: " + Math.max(a, Math.max(b, c)));
//         sc.close();
//     }
//}
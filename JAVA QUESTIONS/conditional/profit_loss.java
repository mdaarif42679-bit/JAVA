import java.util.*;
public class profit_loss {
    public static void main(String[] args){
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter the  cost :");
        int cost = sc.nextInt();
        System.out.print("Enter the  sell :");
        int sell = sc.nextInt();
        if(sell > cost){
            System.out.print("Profit");
        }
        else if (sell < cost){
            System.out.print("Loss");
        }
        else 
            System.out.print("no profit no loss");
        sc.close();
    }
}


       // IN SHORT
// import java.util.*;
// public class profit_loss{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int cost = sc.nextInt() , sell = sc.nextInt();
//         System.out.print(sell > cost ? " Profit"  : sell < cost ? "Loss" : "No Profit No Loss");
//         sc.close();

//     }
// }
    
/// IN VERY SHORT
// import java.util.*;
// class P{public static void main(String[]a){Scanner sc=new Scanner(System.in);System.out.println(sc.nextInt()<sc.nextInt()?"Profit":"Loss");}}
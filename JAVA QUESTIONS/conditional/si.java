import java.util.*;
public class si {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int p = sc.nextInt();
        System.out.print("Enter time : ");
        int t = sc.nextInt();
        System.out.print("Enter rate : ");
        int r = sc.nextInt();
        int Si = (p*r*t)/100;
        if(Si > 100){
            System.out.println("High Interest");
        }
        else 
            System.out.print("Low interest");
        sc.close();
    }
}

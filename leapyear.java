import java.util.*;
public class leapyear{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to be checked");
        int year = sc.nextInt();
        if(year%4==0 || year%100==0){
            System.out.println("leap year");
        }else{
            System.out.println("notv a leap year");
        }
    }
}
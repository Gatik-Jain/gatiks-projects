import java.util.*;
public class pallendrom{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a palindrom");
        int num=sc.nextInt();
        int n=0;
        while(num>0){
            int remainder= num%10;
            num = num/10;
            n=(n*10)+remainder;
            
            
        }
        System.out.println(n);
        
    }
}
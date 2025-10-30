import java.util.*;
public class EveningEntry{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter token number");
        int token = sc.nextInt();
        if (token%2==0){
            System.out.println("you can Park");
        }else{
            System.out.println("you cannot park");
        }
    }
}
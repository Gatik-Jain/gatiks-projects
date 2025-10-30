import java.util.*;
public class forloop{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String password = "Neerja Modi";
        int i = 3;
        System.out.println("Enter password");
        String pass = sc.nextLine();
        while(i<3){
            if (pass != password){
                System.out.println("Invalid re-enter");
                System.out.println("Enter password");
                pass = sc.nextLine();
                i = i++;
            }else{
                System.out.println("Accepted");
                i = 4;
            }
        }        
    }
}
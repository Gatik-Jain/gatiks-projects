import java.util.Scanner;
public class IfThenElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit pin");
        int x = sc.nextInt();
        if (x>999 && x<10000){
            System.out.println("accepted");
            int digit1 = (x / 1000) % 10;
            int digit2 = (x / 100) % 10;
            int digit3 = (x / 10) % 10;
            int digit4 = (x / 1) % 10;
            
            System.out.println(digit1);
            System.out.println(digit2);
            System.out.println(digit3);
            System.out.println(digit4);
            
            int encrypt1 = (digit1*4) % 10;
            int encrypt2 = (digit2*3) % 10;
            int encrypt3= (digit3*2) % 10;
            int encrypt4 = (digit4*1) % 10;
            
            int pin = (encrypt1 * 1000) + (encrypt2 * 100) + (encrypt3 * 10) + (encrypt4);
            System.out.println(pin);
            
            
        
        
        } else {
            System.out.println("Rejected");
        }
    
        
        
        
        
      
    }

}



// Ask use to enter SAT score and whether has CS HL and physics HL as subjects or not basing on the given condition
import java.util.*;
public class SatScore{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter SAT score");
        int SAT = sc.nextInt();
        sc.nextLine();
        if (SAT>1600 || SAT<0){
            System.out.println("Invalid score");
        } else{
            if (SAT>=1500){
                System.out.println("Accepted");
            } else{
                System.out.println("Do you have Physics HL and Computer Science HL");
                String YorN = sc.nextLine();
                if (YorN.equals("Y")){
                    System.out.println("Enter your CS score");
                    int CS = sc.nextInt();
                    System.out.println("Enter your physics score");
                    int phy = sc.nextInt();
                    if (CS == 7 && phy == 7){
                        System.out.println("Accepted");
                    }else{
                        System.out.println("Rejected");
                    }
                }
                
                
            
            }
        
        }
    
    }
}
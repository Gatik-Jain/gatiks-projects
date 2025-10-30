import java.util.*;
public class WeatherSensor{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter today's Temperature");
        int temp = sc.nextInt();
        
        if(temp>0){
            System.out.println("Hot");            
        }else if(temp==0){
            System.out.println("neutral");
        }else{
            System.out.println("Freezing");
        }
    }   
}
    
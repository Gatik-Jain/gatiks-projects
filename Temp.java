//Enter the days name and the maximum and minimum temperature for each day and output average temp for each day.
import java.util.*;
public class Temp{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] days =new String[7];
    double[][] temp =new double[7][2];
    for (int i=0; i<7; i++){
        System.out.println("Enter day: ");
        String day = sc.nextLine();
        days[i]=day;
        System.out.println("Enter minimum temp for today: ");
        double min= sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter maximum temp for today: ");
        double max= sc.nextDouble();
        sc.nextLine();
        while(min>max){
            System.out.println("invalid, re-enter: ");
            System.out.println("Enter minimum temp for today: ");
            min= sc.nextDouble();
            System.out.println("Enter maximum temp for today: ");
            max= sc.nextDouble();
        } 
        temp[i][0]=min;
        temp[i][1]=max;
        
    }
    for (int i=0; i<7; i++){
        System.out.println("The average temperature on "+days[i]+" was "+(temp[i][0]+temp[i][1])/2);
    }
}
}
    
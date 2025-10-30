import java.util.*;
public class ClimateResearch{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days the tmperature has to b recorded for ");
        int n = sc.nextInt();
        int ND = 0;
        int MH = 0;
        int VHD = 0;
        int CD = 0;
        for (int i=0; i<n; i++){
            System.out.println("Enter today's temperature");
            double temperature = sc.nextDouble();
            if (temperature>=23 && temperature<=27){
                System.out.println("Normal Day"); 
                ND = ND+1;
            }else if(temperature>=27 && temperature<=30){
             System.out.println("Moderately Hot"); 
             MH = MH+1;
            }else if(temperature>30){
                System.out.println("Very Hot day");
                VHD = VHD+1;
            }else if(temperature<23){
                System.out.println("Cold day");
                CD = CD+1;
            }
            
        }
        System.out.println("Normal Days = " + ND);
        System.out.println("Moderately hot days = " + MH);
        System.out.println("Very hot days = " + VHD);
        System.out.println("Cold Days = " + CD);
    }
}
    
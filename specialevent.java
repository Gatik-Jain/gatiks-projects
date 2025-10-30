import java.util.*;
public class specialevent{
    public static void main(String[] args){
        Scanneer sc = new Scanner(System.in);
        System.out.println("enter no of people");
        int n = sc.nextInt();
        int x = n-1;
        String [][]A = new String[x][5];
        int []B = new String[5];
        while(x>0){
            System.out.println("enter yes if you will be coming or not for the next 5 days and no if not");
            A[x][0] = sc.nextline();
            A[x][1] = sc.nextline();
            A[x][2] = sc.nextline();
            A[x][3] = sc.nextline();
            A[x][4] = sc.nextline();
            x=x-1
        }
        x = n-1;
        int c = 0;
        for(i = 0; i<6; i++){
            if(A[x][0] == "yes"){
                c=c+1;
            }
            
        }
    }
}
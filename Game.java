import java.util.*;
public class Game{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your move");
        int Dice1 = sc.nextInt();
        System.out.println("Your move");
        int Dice2 = sc.nextInt();
        if(Dice1==Dice2){
            System.out.println("Draw");
        }else {
            if(Dice1>Dice2){
                System.out.println("player 1 wins");                
            }else{
                System.out.println("player 2 wins");   
            }
        }
    }
}
    
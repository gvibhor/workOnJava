package java.work;
import java.util.Scanner;
public class farmerCowDuck {
    static int duck=0,cow=0;
    static void data(int eyes, int legs)
    {
        int n;
        if(eyes%2==1||legs%2==1)
        {
            System.out.println("Invalid Input"); 
            System.exit(0);
        }
        eyes=eyes/2;
        cow=eyes/2;
        duck = cow + (eyes %2);
        n=((cow*4)+(duck*2));
        //System.out.println(n);
        do
        {
            if(n<legs)
            {
                cow++;
                duck--;
            }
            else
            {
                cow--;
                duck++;
            }
        n=((cow*4)+(duck*2));   
        }while(n!=legs);
        
        System.out.println("Cows: "+cow+" "+"Ducks :"+duck);
        
    }
    public static void main(String[] args) {
        int eyes=0,legs=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Farmer Duck And Cow problem");
        System.out.println("Eyes:");
        eyes = sc.nextInt();
        System.out.println("Legs:");
        legs = sc.nextInt();
        data(eyes,legs);
    }
   
}

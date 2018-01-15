package Java_Work;
public class Pattern_1 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
                if(k<i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}

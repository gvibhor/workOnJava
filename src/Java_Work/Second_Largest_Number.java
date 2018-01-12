package Java_Work;
public class Second_Largest_Number {
    public static void main(String[] args) {
        int arr[]={5,1,7,3,9,5,4,10};
        int num=0,secondnum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(secondnum!=num)
                secondnum=num;
            
            if(num<arr[i])
                num=arr[i];
        }
        System.out.println("Second Largest number : "+secondnum+"\nLargest Number : "+num);
    
    }
    
}

package Java_Work;
public class Bubble_Sort {
    public static void arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
    int arr[]={0,3,10,5,1,9,62,0};
    System.out.print("Array : ");
    arr(arr);
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[i])
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    System.out.print("\nSorted Array : ");
    arr(arr);
    }
    
}

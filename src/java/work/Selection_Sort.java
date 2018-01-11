package java.work;
public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={6,4,7,8,4,6,7,5,3,6,8,9,10};
        int min;
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=min;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                    min=j;
            }
            int temp;
            temp = arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
    
    
}

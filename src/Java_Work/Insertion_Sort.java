package Java_Work;
public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[]={9,3,56,2,0,5,7},min;
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=min;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                    min=j;
            }
            int temp = arr[min];
            for(int k=min;k>i;k--)
            {
                arr[k]=arr[k-1];
            }
            arr[i]=temp;
        }
        System.out.print("\nSorted Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}

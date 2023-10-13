import java.util.*;
public class LinearSearch{
    public static int Search(int arr[],int n,int a){
        int i =0;
        while(i<n){
            if(arr[i]==a){
                return i;
            }
            i++;
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a =sc.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter the array:");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter The finding key: ");
        int b=sc.nextInt();
        if(0 <= Search(arr,a,b)){
            System.out.print("Index is: "+ Search(arr,a,b));
        }
    }
}
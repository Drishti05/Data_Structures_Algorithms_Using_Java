import java.util.Scanner;
public class ReverseAnArray{
    public static void reverse(int[] arr){
        int size=arr.length;
        int end=size-1;
        for(int start=0;start<size/2;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the Element");
            arr[i]=sc1.nextInt();
        }
        System.out.println("The original array:");
        print(arr);
        reverse(arr);
        System.out.println();
        System.out.println("The reversed array:");
        print(arr);

    }
    
}

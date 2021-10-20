import java.util.*;
public class MinStepsInInfiniteGrid {
    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int x,y,step=0;
        for(int i=0;i<A.size()-1;i++){
            x=A.get(i);
            y=B.get(i);
            step+=Math.max(Math.abs(x-A.get(i+1)),Math.abs(y-B.get(i+1)));
        }
        return step;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the number of points");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        ArrayList<Integer> list1=new ArrayList<>(size);
        ArrayList<Integer> list2=new ArrayList<>(size);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the coordintes of points");
        for(int i=0;i<size;i++){
            System.out.println("Enter x-coordinate");
            list1.add(sc.nextInt());
            System.out.println("Enter y-coordinate");
            list2.add(sc.nextInt());
        }
        int ans=coverPoints(list1,list2);
        System.out.println("The answer is "+ans);

    }
}


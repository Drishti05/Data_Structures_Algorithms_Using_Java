import java.util.*;
public class MinimumLightsToActivate {
    public static int solve(ArrayList<Integer> A, int B){
        int curr=0;
        int count=0;
        boolean turn=true;
        int min,max;
        int size=A.size();
        while(curr<size && turn==true){
            turn=false;
            min=curr-B+1<0 ? 0:curr-B+1;
            max=curr+B-1>=size ? size-1:curr+B-1;
            while(max>=min){
                if(A.get(max)==1){
                    turn=true;
                    count++;
                    curr=max+B;
                    break;
                }
                max--;
            }

        } 
        if(turn==false) return -1;
        else return count;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of bulbs in the corridor");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        ArrayList<Integer> list=new ArrayList<>(size);
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<size;i++){
            list.add(sc1.nextInt());
        }
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the power of the light");
        int power=sc2.nextInt();
        int res=solve(list,power);
        System.out.println("The minimum number of bulbs that needs to be turned on "+res);
        
    }
    
}

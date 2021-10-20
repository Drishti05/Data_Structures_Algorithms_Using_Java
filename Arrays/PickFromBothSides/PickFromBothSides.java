import java.util.*;
public class PickFromBothSides {
    public static int solve(ArrayList<Integer> A, int B) {
        int res=0;
        for(int i=0;i<B;i++){
            res+=A.get(i);
        }
        int lsum=res, rsum=0,index=B-1,i=A.size()-1;
        while(index>=0){
            rsum+=A.get(i);
            lsum-=A.get(index);
            res=Math.max(lsum+rsum,res);
            index--;
            i--;
        }
        return res;
}
public static void main(String[] args) {
  System.out.println("Enter the size of ArrayList");  
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  ArrayList<Integer> list=new ArrayList<>(size);
  Scanner sc1=new Scanner(System.in);
  System.out.println("Enter the elements");
  for(int i=0;i<size;i++){
      list.add(sc1.nextInt());
  }
  System.out.println("Enter the number of elements to be consider");
  Scanner sc2=new Scanner(System.in);
  int num=sc2.nextInt();
  int res=solve(list,num);
  System.out.println(res);

}
}


import java.util.*;
import java.util.ArrayList;

public class matchesproblem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<>();
        System.out.println("enter number of teams");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        schedule s=new schedule();
         System.out.println(s.scheduler(a,n));
        simulator  si=new simulator();
        si.simulator(a,n);



    }
    
}
class schedule{
   List scheduler(List<String> array,int n){
        Scanner sc=new Scanner(System.in);
        
        ArrayList<String> matches=new ArrayList<>();
         for(int i=0;i<n;i++){
            for(int h=i+1;h<n;h++){
                matches.add(array.get(i)+"vs"+array.get(h));
            }
         }
         return matches;
    }
}
class simulator{
        void simulator(List<String> array,int n){
         ArrayList<Integer> n1=new ArrayList<Integer>();
        int a1;
          for(int k=0;k<10;k++)
         {
            n1.add(k);
         }
         for(a1=0;a1<n1.size();a1++){
            if(a1<n){
                System.out.println(array.get(a1));
            }
            for(int s=0;s<n1.size();s++){
                if(n1.get(s)+n1.get(a1)==n-1){
                    System.out.println("matches won by team:"+n1.get(a1));
                    System.out.println("matches lost by team:"+n1.get(s));
                    break;
                }

            }
        }    
        } }           
               
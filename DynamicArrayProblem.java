import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArrayProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt(); 
        int lastAns = 0;
        
        List<Integer>[] sequenceList = new List[n];
        for(int i =0; i<n; i++){
            sequenceList[i] = new ArrayList<>();
        }
        
        for(int i =0; i<n; i++){
         int qType = in.nextInt();
         int x = in.nextInt();
         int y = in.nextInt();
         System.out.println("sequence list" +(x^lastAns)%n); 
         List<Integer> sequence = sequenceList[(x^lastAns)%n];
            if(qType ==1){
                sequence.add(y);
            }
            else if(qType == 2){
                lastAns = sequence.get(y%sequence.size());
                System.out.println(lastAns);
                
            }
            
        }   
        in.close();
    }
}
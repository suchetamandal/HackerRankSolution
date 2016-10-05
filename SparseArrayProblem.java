import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SparseArrayProblem {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        int n;
        int q;
        n = sc.nextInt();
        List<String> strings = new ArrayList<String>();
        
        for(int i =0; i<n; i++){
            strings.add(sc.next());
        }
        
        q = sc.nextInt();
        
        List<String> queries = new ArrayList<String>();
        for(int i =0; i<q; i++){
        	queries.add(sc.next());
        }
        int[] numberFound = new int[q];
        
        for(int i =0; i<q; i++){
            String query = queries.get(i);
            for(int j =0; j<n; j++){
                if(strings.get(j).equals(query)){
                    numberFound[i] = numberFound[i] + 1;
                }
            }
        }
        
        for(int i=0; i<q; i++){
            System.out.println(numberFound[i]);
        }
        
    }
}
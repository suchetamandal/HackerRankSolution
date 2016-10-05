import java.util.Scanner;

public class LeftRotationProblem {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int d = sc.nextInt();
       int a; 
       int firstData; 
       
       int[] data = new int[n];
        for(int i =0;i<n;i++){
            data[i] = sc.nextInt();
        }
        
      for(int i=1; i<=d;i++){
          firstData = data[0]; 
          for(int j=0; j<n; j++){
              if(j>0){
                  a=j-1;
                  data[a] = data[j];
             }  
          }
          data[n-1] = firstData;
      } 
        
      for(int i =0;i<n;i++){
          System.out.print(data[i]+ " ");
      }  
    }
}
import java.util.Scanner;

public class LAB_3A1 {
    public static void main(String [] args){

        int n;
        int m;
        int SUM=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first element");
        n = sc.nextInt();
        System.out.println("enter the second element");
        m = sc.nextInt();
        
        if(m>n){
            for(int i=n;i<=m;i++){
                SUM= SUM + i;
            }  
        }
        else{
            for(int i=m;i<n;i++){
                SUM= SUM + i;
            }
        }
        System.out.println(SUM);
    }  
}

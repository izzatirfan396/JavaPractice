
package Lab6_Methods;

public class q4 {
    public static void main(String[] args) {
        System.out.println("GCD for (24,8) : "+ EA(24,8) );
        System.out.println("GCD for (625,200) : "+ EA(625,200));
    }
    public static int EA(int n , int r){
       while(r!=0){
           int temp = r;
           r = n%r;
           n=temp;
        }
    return n ;
    }
    
}

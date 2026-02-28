
package Lab6_Methods;

public class Q1_triangularNumber {
    public static void main(String[] args) {
        System.out.println("The first 20 triangular number: ");
        
        for(int i = 1 ; i<=20 ;i++){
             
            
            System.out.println(i + " : " + triangularNumber (i));
        }
                
    }
    public static int triangularNumber(int n){
        int sum = 0 ;
        for(int i = 1 ; i <= n ; i ++){
            sum += i ;
        }
        return sum;
    }
    
}

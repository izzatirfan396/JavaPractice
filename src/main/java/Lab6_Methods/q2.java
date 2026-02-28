
package Lab6_Methods;

public class q2 {
    public static void main(String[] args) {
        System.out.println("----Triangle----");
        for(int i = 1 ; i<=4 ; i++){
            multiPrint(4-i,' ');
            multiPrint(2*i - 1 , '*');
            System.out.println();
        }
        
        System.out.println("----Diamond----");
        for (int i = 1; i <=3 ; i++) {
            multiPrint(3-i,' ');
            multiPrint(2*i-1 ,'*');
            System.out.println();
        }  
        for (int i = 2; i >=1 ; i--) {
            multiPrint(3-i,' ');
            multiPrint(2*i-1 ,'*');
            System.out.println();
        }
    }
    public static void multiPrint(int n , char c){
        for(int i = 0 ; i<n ; i++){
            System.out.print(c);
        }
    }
}

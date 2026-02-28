
package Lab5_Array;
import java.util.Scanner ; 
import java.util.Random ; 

public class q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner k = new Scanner(System.in);
        int [] numb = new int[20];
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i = 0 ; i < numb.length ; i++){
            numb [i] = rand.nextInt(101);
            System.out.print(numb[i] + ", ");
        }
        System.out.println();
        System.out.println("Array in descending order");
        for(int i = 0 ; i < numb.length - 1 ; i++){
            for(int j = 0 ; j < numb.length - 1 - i ; j++){
                if(numb[j] < numb[j+1]){
                    int temp = numb[j];
                    numb[j]=numb[j+1];
                    numb[j+1]=temp;
                }
            }
        }
        for(int i = 0 ; i < numb.length ; i++){
            System.out.print(numb[i] + ", ");
        }
        System.out.println();
        System.out.print("Enter a number to search: ");
        System.out.println( );
        int search = k.nextInt();
        
        boolean found = false;
            for(int i = 0 ; i < numb.length ; i++){
                if(numb[i]== search){
                    System.out.println(search +" found");
                    System.out.println("Linear Search - " + (i+1)+ " loop(s)");
                        found = true;
                    break;
                }
            }
            if (found){
            int min = 0;
            int max = 19;
            int count = 0 ;
           
            
            while(min<= max){
                count +=1 ;
                int mid = (max+min)/2 ; 
            if(search == numb[mid]){
                break; 
            }
            else if(search < numb[mid]){
                min = mid + 1 ;
            }
            else{
                max = mid - 1;
            }
   
            }
            System.out.println(search +" found");
                    System.out.println("Binary Search - " + count +" loops(s)");
            }else{
                System.out.println(search + " was not found in the list.");
            }
        
    }
    
}

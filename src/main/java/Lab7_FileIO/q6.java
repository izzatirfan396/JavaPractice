
package Lab7_FileIO;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class q6 {
    public static void main(String[] args) {
        
try{
    
    String [] productID = new String[7] ;
    String [] productName = new String[7] ;
    Double [] productPrice = new Double[7] ; 
    
    Scanner data = new Scanner( new  FileInputStream ("product.txt"));
    for (int i = 0; i < 7; i++) {
        
    
    
        
        String product = data.nextLine();
        String [] productA = product.split(",");
        
        productID[i] = productA[0];
        productName[i] = productA[1];
        productPrice[i] = Double.parseDouble(productA[2]);
       
    
 }
    
  data.close(); 
    
    String [] orderID = new String[5];
    int [] orderQ = new int[5];
    
    Scanner dataOrder = new Scanner(new FileInputStream("order.txt"));
    
    for (int i = 0; i < 5; i++) {
        
    
        String order = dataOrder.nextLine();
        String [] orderA = order.split(",");
        
        orderID[i] = orderA[1];
        orderQ[i] = Integer.parseInt(orderA[2]);
       
       
    
 }
    dataOrder.close();
    
     System.out.println("ProductID  ProductName  Quantity  Price  TotalPrice");

            for (int i = 0; i < orderID.length; i++) {

                // search matching ProductID in product.txt
                for (int j = 0; j < productID.length; j++) {

                    if (orderID[i].equals(productID[j])) {

                        double totalPrice = productPrice[j] * orderQ[i];

                        System.out.println(
                                productID[j] + "  " +
                                productName[j] + "  " +
                                orderQ[i] + "  " +
                                productPrice[j] + "  " +
                                totalPrice
                        );

                        break; // stop searching once found AND exit the INSIDE LOOP ONLY@ J  LOOP ONLYYY , so it still going to loop for i which is check the next order id
                    }
                }
            }
    
    
    
}catch(IOException ex){
    System.out.println("Error : " + ex );
}
}
}

package Lab8_Class;

public class WeightCalculator {
    
private int age;
private double height;
private double RW;
    
    public WeightCalculator(int age , double height){
        
        this.age = age;
        this.height = height;
        
        System.out.println("age : " + this.age);
        System.out.println("height : " + this.height);
        
    }
    
    public double recommendWeight(){
        
        RW = (this.height - 100 + ((double) this.age / 10))* 0.9 ;
        
        
        return RW ;
    }
}


package Lab8_Class;

import java.util.Random;

public class dice {
    
    /*roll()
    getvalue()
    sides()
    setSides(sides)
    */
    
    private int sides ; 
    private int value;
    private Random rand;

    public dice(int sides){ //constructor@method for this class dice , the name must be the same dice = dice 
        
        this.sides = sides ;
        this.rand = new Random(); 
    
    }
    
    public int roll(){
        this.value = this.rand.nextInt(sides)+ 1 ;
        return(this.value);
    }
    
    public int getValue(){
        return this.value;
    }
    
}

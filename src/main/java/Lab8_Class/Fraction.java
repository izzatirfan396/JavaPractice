
package Lab8_Class;



public class Fraction {
    
    private int nume ;
    private int deno ; 
    
    public Fraction(int nume , int deno){ //A constructor initializes an object, while mutator methods modify the object after it has been created.
    
    this.nume = nume;
    this.deno = deno;
        
}
    
    public void setNume(int nume){ //mutator@SET value from tester ---> class
        
       this.nume = nume;
        
    }
    
    public void setDeno(int deno){ //mutator@SET value from tester ---> class
        
       this.deno = deno;
        
    }
    
    public double getNume(){ //accessor@Get value from this class --> tester
       
        return this.nume ;
        
    }
    
    public double getDeno(){ //accessor@Get value from this class --> tester
        
        return this.deno;
        
    }
    
    public void GCD(){
        
        int n , r , temp ;
        n = this.nume;
        r= this.deno ; 
        
        while(r!=0){
            temp = r ;
            r = n%r ; 
            n = temp;
            
        }
        
        this.nume = this.nume/n ;
        this.deno = this.deno/n;
        
        System.out.println("The reduced fraction : " + this.nume + "/" + this.deno);
        
    }
    
}



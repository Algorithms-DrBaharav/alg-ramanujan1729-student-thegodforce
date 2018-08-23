import java.lang.Math;
/**
 *
 * @author YourNameHere
 * 
 * 
 *  See README file for description
 * 
 */



// Your work here. Just carete one class and one main function.
public class Main1729{
    public static void main(String[] args){
        int goal=87539319;
       int max_number=(int)Math.cbrt(goal);

       
       for(int x=0; x<=max_number; x++){
           for(int y=0; y<=x; y++){
               if (Math.pow(x, 3)+ Math.pow(y, 3) == goal){
                   System.out.println("Potential numbers: " + x + ", " + y);
               }
               else{
                   
               }
           }
           
       }
       
       
    }
    

}
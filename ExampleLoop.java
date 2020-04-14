/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ασκηση.pkg1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;


public class ExampleLoop {

  //use an example of a for loop
    //in a dropdown result
    
    public static void main(String[] args) {
        
        
        //an example of a for loop
        for (int i=1; i<=10; i++)
        {
            //use a for inside a for loop to achieve our exersise goal
            for (int y=1; y<=i; y++ )
            {
                
            //first print inside the second for loop (get all the numbers)
                
                
                System.out.print(y);
            }
            
            //print every loop in a dropdown result
            System.out.println();
        }
    
       
    }
    
}

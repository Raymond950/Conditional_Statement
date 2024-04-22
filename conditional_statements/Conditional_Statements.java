/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional_statements;

/**
 *
 * @author PC
 */

import java.util.*;
public class Conditional_Statements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation op = new Operation();
        Scanner sc = new Scanner(System.in);
        Conditonal con = new Conditonal();
       
        System.out.print("Please Enter number: \n"
                + "1: conditional \n"
                + "2: addition\n"
                + "3: substraction\n"
                + "4: product\n"
                + "5: division\n");
          int a;
        a=sc.nextInt();
        switch(a){
            case 1:
                con.iseven();
                break;
            case 2:
                op.add();
                break;
            case 3:
                op.sub();
                break;
            case 4:
                op.prod();
                break;
            case 5:
                op.div();
                break;
        }
        
        
    }
    
}

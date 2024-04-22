/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditional_statements;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Conditonal {
    
    void iseven(){
         Scanner sc = new Scanner(System.in);
     int number =sc.nextInt();
        if(number%2==0){
            System.out.print("The number is even");
            
        }
        else if(number%2==1){
            System.out.print("The number is odd");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditional_statements;

/**
 *
 * @author PC
 */
public class Operation {
    int c=100;
    int b=100;
    
    void add(){
        int sum;
        sum=c+b;
        System.out.print("The sum of c and b is :"+sum);
              
    }
    void sub(){
        int sub;
        sub=c-b;
        System.out.print("The substraction of c and b is :"+sub);
    }
    void prod(){
          int prod;
        prod=c*b;
        System.out.print("The product of c and b is :"+prod);
    }
    void div(){
          int div;
        div=c/b;
        System.out.print("The division of c and b is :"+div);
        
    }
}

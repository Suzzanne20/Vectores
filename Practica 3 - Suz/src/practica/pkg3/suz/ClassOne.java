/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3.suz;

/**
 *
 * @author susan
 */
public class ClassOne extends ClassX {
//no hay Bob el Constructor//
    
    public ClassOne(){
    
    }

    public int facto(int num1){
        if(num1==0) return 1;
        else 
        return num1*facto(num1-1);
    }

    public int tabMult(int num1){
        for(int i=1; i<=10; i++){
            System.out.println(num1+" * "+i+" = "+num1*i) ;
        }
        return 0;
    }
}






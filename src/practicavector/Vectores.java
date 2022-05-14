/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicavector;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author susan
 */
public class Vectores {
    private int[] vector;//declaracion del Vector
    private int contador;

    public Vectores(){
    vector=new int[10];
    this.contador=0;
    }

public int ingVect(){
int [] nums = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int result = nums.length;
int sum = Arrays.stream(nums).sum();
int resultp = sum/15;
System.out.println("Cantidad de Elementos almacenados: "+result);
System.out.println("La suma de todos los elmentos es: "+sum);
System.out.println("El promedio de los elementos es: "+resultp);

return 0;
}
   

 /*public int parimp(){
    Scanner in = new Scanner(System.in);

    vector = new int[10];

        for(int i=1; i<=10; i++){
            System.out.print("(" + i + "/10) ");
            vector[i]=in.nextInt();

        }

        return 0;
    }

*/


/*
public void Vect(String oper , int primer, int segundo, int result){
contador=contador+1;
vector[contador]="--> "+primer+" "+oper+" "+segundo+" = "+result;
}

public void mostrarVect(){
try{
    System.out.println(vector.length);
    for(int i=1; i<vector.length;i++){
        if (!vector[i].isEmpty()){
           System.out.println(vector[i]);
        }       
    }
}catch(Exception e){
    System.out.println(e.getMessage());
        }

    }  

*/


}

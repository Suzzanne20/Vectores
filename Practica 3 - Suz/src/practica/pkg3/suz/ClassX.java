 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3.suz;

/**
 *
 * @author susan
 */
public class ClassX {
//Bob el Constructor//
    int num1, num2 ;
    private String[] vector;//declaracion del Vector
    private int contador;

    public ClassX(){
    vector=new String[10];//iniciar vector
    this.contador=0;
    }

    public int suma(int num1, int num2){
        int result=num1+num2;
        this.historial("+", num1, num2, result);

        return result;
    }
    public int resta(int num1, int num2){
        int result;
        result=num1-num2;
        this.historial("-", num1, num2, result);
        return result;
    }
    public int multi(int num1, int num2){
        int result=num1*num2;
        this.historial("*", num1, num2, result);
        return result;
    }
    public int divi(int num1, int num2){
        int result=num1/num2;
        this.historial("/", num1, num2, result);
        return result;
    }

public void historial(String oper , int primer, int segundo, int result){
contador=contador+1;
vector[contador]="--> "+primer+" "+oper+" "+segundo+" = "+result;
}

public void mostrarHistorial(){
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

}


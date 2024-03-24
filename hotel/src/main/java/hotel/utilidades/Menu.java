/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.utilidades;

/**
 *
 * @author juanc
 */
public class Menu {
    Lectura le= new Lectura();
    
    public int OpcionesMenu(){
     System.out.println("Menú:");
     System.out.println("1. Agregar empleado");
     System.out.println("2. Mostrar empleados");
     System.out.println("3. Salir");
     int opcionElegida= le.valInt("Ingrese una opción: ");
     return opcionElegida;
    }
    public void EscogerDiaSemana(){
    
    
    }
    public void EscogerDia(){
        
    }
}

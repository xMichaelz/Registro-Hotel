/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author juanc
 */
public class Receptionist extends Employee{

    public Receptionist() {
    }

    public Receptionist(String area, String turno) {
        super(area, turno);
    }

    public Receptionist(String area, String turno, String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(area, turno, TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
    }

    public Receptionist(String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receptionist{");
        sb.append('}');
        return sb.toString();
    }
    
    
}

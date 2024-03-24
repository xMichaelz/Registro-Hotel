/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author juanc
 */
public class HouseKeeping extends Employee{

    public HouseKeeping() {
    }

    public HouseKeeping(String area, String turno) {
        super(area, turno);
    }

    public HouseKeeping(String area, String turno, String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(area, turno, TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
    }

    public HouseKeeping(String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HouseKeeping{");
        sb.append('}');
        return sb.toString();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author juanc
 */
public class Employee extends Person {
    private String area;
    private String turno;

    public Employee() {
    }
    
    public Employee(String area, String turno) {
        this.area = area;
        this.turno = turno;
    }

    public Employee(String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
    }

    
    public Employee(String area, String turno, String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
        this.area = area;
        this.turno = turno;
    }
    
    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("area=").append(area);
        sb.append(", turno=").append(turno);
        sb.append('}');
        return sb.toString();
    }
    
    
}

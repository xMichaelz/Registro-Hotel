/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author juanc
 */
public class Chef extends Employee {
    private String nacionalidad;

    public Chef() {
    }
    
    public Chef(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Chef(String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
    }

    public Chef(String nacionalidad, String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
        this.nacionalidad = nacionalidad;
    }

    public Chef(String nacionalidad, String area, String turno) {
        super(area, turno);
        this.nacionalidad = nacionalidad;
    }

    public Chef(String nacionalidad, String area, String turno, String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(area, turno, TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
        this.nacionalidad = nacionalidad;
    }
    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Chef{");
        sb.append("nacionalidad=").append(nacionalidad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}

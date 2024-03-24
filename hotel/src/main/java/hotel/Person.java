/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author juanc
 */
public class Person {
    private String TipoIdentificacion;
    private int NumeroIdentificacion;
    private double Telefono;
    private String Nombre;

    public Person() {
    }

    public Person(String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        this.TipoIdentificacion = TipoIdentificacion;
        this.NumeroIdentificacion = NumeroIdentificacion;
        this.Telefono = Telefono;
        this.Nombre = Nombre;
    }
    /**
     * @return the TipoIdentificacion
     */
    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    /**
     * @param TipoIdentificacion the TipoIdentificacion to set
     */
    public void setTipoIdentificacion(String TipoIdentificacion) {
        this.TipoIdentificacion = TipoIdentificacion;
    }

    /**
     * @return the NumeroIdentificacion
     */
    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    /**
     * @param NumeroIdentificacion the NumeroIdentificacion to set
     */
    public void setNumeroIdentificacion(int NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    /**
     * @return the Telefono
     */
    public double getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(double Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personas{");
        sb.append("TipoIdentificacion=").append(TipoIdentificacion);
        sb.append(", NumeroIdentificacion=").append(NumeroIdentificacion);
        sb.append(", Telefono=").append(Telefono);
        sb.append(", Nombre=").append(Nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import hotel.utilidades.Lectura;

/**
 *
 * @author juanc
 */
public class Manager extends Employee {
    
    private Employee empleado;
    Lectura le = new Lectura();

    public Manager() {
    }
    
    public Manager(Employee empleado) {
        this.empleado = empleado;
    }

    public Manager(Employee empleado, String area, String turno) {
        super(area, turno);
        this.empleado = empleado;
    }

    public Manager(Employee empleado, String area, String turno, String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(area, turno, TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
        this.empleado = empleado;
    }

    public Manager(String TipoIdentificacion, int NumeroIdentificacion, double Telefono, String Nombre) {
        super(TipoIdentificacion, NumeroIdentificacion, Telefono, Nombre);
    }

    
    /**
     * @return the epmpleado
     */
    public Employee getEpmpleado() {
        return empleado;
    }

    /**
     * @param empleado the epmpleado to set
     */
    public void setEpmpleado(Employee empleado) {
        this.empleado = empleado;
    }

    public Receptionist[][] GuardarMatrix(Receptionist[][] recepcionista, Receptionist receptionist){
        le.MostrarSemana();
        int diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar: ");
        diaSemana=diaSemana-1;
        le.MostrarTurno();
        int dia= le.valInt("ingrese el turno que quiere Trabajar: ");
        dia=dia-1;
        boolean bandera=true;
        while(bandera){
            if(recepcionista[diaSemana][dia]==null){
                recepcionista[diaSemana][dia]= receptionist;
                bandera=false;
            }else if(le.ValidarMatrix(recepcionista)){
               System.out.println("Ya no hay turnos de trabajo para guardar");
               bandera=false;
            }else{
                System.out.println("Ya hay alguien en ese horario ingrese otro dia o otro turno ");
                System.out.println("Estos son las jornadas que hay hasta el momento");
                le.MostrarMatrix(recepcionista);
                le.MostrarSemana();
                diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar: ");
                diaSemana=diaSemana-1;
                le.MostrarTurno();
                dia= le.valInt("ingrese el turno que quiere Trabajar: ");
                dia=dia-1;
            }
        }
        return recepcionista;
    }
    
    public Chef[][] GuardarMatrix(Chef[][] chefcito, Chef chef){
        le.MostrarSemana();
        int diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar: ");
        diaSemana=diaSemana-1;
        le.MostrarTurno();
        int dia= le.valInt("ingrese el turno que quiere Trabajar");
        dia=dia-1;
        boolean bandera=true;
        while(bandera){
            if(chefcito[diaSemana][dia]==null){
                chefcito[diaSemana][dia]= chef;
                bandera=false;
            }else if(le.ValidarMatrix(chefcito)){
               System.out.println("Ya no hay turnos de trabajo para guardar");
               bandera=false;
            }else{
                System.out.println("Ya hay alguien en ese horario ingrese otro dia o otro turno: ");
                System.out.println("Estos son las jornadas que hay hasta el momento");
                le.MostrarMatrix(chefcito);
                le.MostrarSemana();
                diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar");
                le.MostrarTurno();
                dia= le.valInt("ingrese el turno que quiere Trabajar");
                dia=dia-1;
            }
        }
        return chefcito;
    }
    public Manager[][] GuardarMatrix(Manager[][] man, Manager manager){
        le.MostrarSemana();
        int diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar: ");
        diaSemana=diaSemana-1;
        le.MostrarTurno();
        int dia= le.valInt("ingrese el turno que quiere Trabajar: ");
        dia=dia-1;
        boolean bandera=true;
        while(bandera){
            if(man[diaSemana][dia]==null){
                man[diaSemana][dia]= manager;
                bandera=false;
            }else if(le.ValidarMatrix(man)){
               System.out.println("Ya no hay turnos de trabajo para guardar");
               bandera=false;
            }else{
                System.out.println("Ya hay alguien en ese horario ingrese otro dia o otro turno");
                System.out.println("Estos son las jornadas que hay hasta el momento");
                le.MostrarMatrix(man);
                le.MostrarSemana();
                diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar: ");
                diaSemana=diaSemana-1;
                le.MostrarTurno();
                dia= le.valInt("ingrese el turno que quiere Trabajar: ");
                dia=dia-1;
            }
        }
        return man;
    }
    public HouseKeeping[][] GuardarMatrix(HouseKeeping[][] limpieza, HouseKeeping houseKeeping){
        le.MostrarSemana();
        int diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar: ");
        diaSemana=diaSemana-1;
        le.MostrarTurno();
        int dia= le.valInt("ingrese el turno que quiere Trabajar: ");
        dia=dia-1;
        boolean bandera=true;
        while(bandera){
            if(limpieza[diaSemana][dia]==null){
                limpieza[diaSemana][dia]= houseKeeping;
                bandera=false;
            }else if(le.ValidarMatrix(limpieza)){
               System.out.println("Ya no hay turnos de trabajo para guardar");
               bandera=false;
            }else{
                System.out.println("Ya hay alguien en ese horario ingrese otro dia o otro turno");
                System.out.println("Estos son las jornadas que hay hasta el momento");
                le.MostrarMatrix(limpieza);
                le.MostrarSemana();
                diaSemana= le.valInt7("ingrese el dia de la semana que quiere Trabajar: ");
                diaSemana=diaSemana-1;
                le.MostrarTurno();
                dia= le.valInt("ingrese el turno que quiere Trabajar: ");
                dia=dia-1;
            }
        }
        return limpieza; 
    }
    
}
    


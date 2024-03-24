package hotel.utilidades;

import hotel.*;
import java.util.Scanner;

public class Lectura {

    Scanner sc = new Scanner(System.in);

    public int leerInt(String mensaje) {
        System.out.println(mensaje);
        int dato = sc.nextInt();
        return dato;
    }

    public String leerString(String mensaje) {
        System.out.println(mensaje);
        String dato = sc.next();
        return dato;
    }
    
    public String valString(String mensaje) {
        String dato;

        do {
            System.out.print(mensaje);
            dato = leerString("");  

            if (contieneNumeros(dato)) {
                System.out.println("Error. Por favor ingrese solo letras.");
            }
        } while (contieneNumeros(dato));

        return dato;
    }

    public static boolean contieneNumeros(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public double leerDouble(String mensaje) {
        System.out.println(mensaje);
        double dato = sc.nextDouble();
        return dato;
    }

    public double valDouble(String mensaje) {
        double dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextDouble()) {
                System.out.println("Valor no válido");
                System.out.println("Debe ser un número positivo: ");
                sc.next();
            }
            dato = leerDouble("");
            if (dato < 0){
                System.out.println("El numero debe ser mayor que 0: ");
            }
        } while (dato < 0);
        return dato;
    }

    public int valInt(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                System.out.println("Debe ser un número entero: ");
                sc.next();
            }
            dato = leerInt("");
        } while (dato < 1 && dato>3);
        return dato;
    }
     public int valInt7(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                System.out.println("Debe ser un número entero: ");
                sc.next();
            }
            dato = leerInt("");
        } while (dato < 1 && dato>7);
        return dato;
     }
     
    public int valIntInf(String mensaje) {
    int dato;
    do {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("Valor no válido");
            System.out.print("Debe ser un número entero: ");
            sc.next();
        }
        dato = sc.nextInt();
    } while (dato < 1);
    return dato;
}

     
    public Receptionist capturarInformacionReceptionist() {
        String nombre= valString("ingrese el nombre del recepcionista que va a registrar: ");
        String tipoDeIdenticacion= leerString("ingrese el tipo de indentificacion del recepcionista"+ nombre+ ": ");
        int num = valIntInf("Ingrese el número de identificación de "+ nombre+ ": ");
        double telefono = valDouble("Ingrese el número de telefono de "+ nombre+ ": ");
        Receptionist nuevoEmpleado = new Receptionist(tipoDeIdenticacion, num , telefono,nombre);
        return nuevoEmpleado ;
        
    }
     public Chef capturarInformacionChef() {
        String nombre= valString("ingrese el nombre del Chef que va a registrar: ");
        String tipoDeIdenticacion= leerString("ingrese el tipo de indentificacion del Chef "+ nombre+ ": ");
        int num = valIntInf("Ingrese el número de identificación de "+ nombre+ ": ");
        double telefono= valDouble("Ingrese el número de telefono de "+ nombre+ ": ");
        String nacionalidad= leerString("Ingrese la nacionalidad de "+ nombre+ ": ");
        Chef nuevoEmpleado = new Chef(nacionalidad,tipoDeIdenticacion, num , telefono,nombre);
        return nuevoEmpleado ;
        
    }
     public Manager capturarInformacionManager() {
        String nombre= valString("ingrese el nombre del Manager que va a registrar: ");
        String tipoDeIdenticacion= leerString("ingrese el tipo de indentificacion del Manager "+ nombre+ ": ");
        int num = valIntInf("Ingrese el número de identificación de "+ nombre+ ": ");
        double telefono= valDouble("Ingrese el número de telefono de "+ nombre+ ": ");
        Manager nuevoEmpleado = new Manager(tipoDeIdenticacion, num , telefono,nombre);
        return nuevoEmpleado ;
        
    }
     public HouseKeeping capturarInformacionHouseKeeping() {
        String nombre= valString("ingrese el nombre del HouseKeeping que va a registrar: ");
        String tipoDeIdenticacion= leerString("ingrese el tipo de indentificacion del HouseKeeping"+ nombre+ ": ");
        int num = valIntInf("Ingrese el número de identificación de "+ nombre+ ": ");
        double telefono = valDouble("Ingrese el número de telefono de "+ nombre+ ": ");
        HouseKeeping nuevoEmpleado = new HouseKeeping(tipoDeIdenticacion, num , telefono,nombre);
        return nuevoEmpleado ;
        
    }
    public void MostrarSemana(){
     System.out.println("Estos son los Horarios");
     System.out.println("1 Lunes");
     System.out.println("2 Martes");
     System.out.println("3 Miercoles");
     System.out.println("4 Jueves");
     System.out.println("5 Viernes");
     System.out.println("6. Sabado");
     System.out.println("7 Domingo");
     
    }
     public void MostrarTurno(){
     System.out.println("Estos son los Horarios");
     System.out.println("1 Mañana de 6:00 A.M a 2:00 P.M");
     System.out.println("2 Tarde de 2:00 P.M a 10:00 P.M");
     System.out.println("3 Noche de 10:00 P.M a 6:00 A.M");
     
    }
    public boolean ValidarMatrix(Receptionist[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Si encontramos un elemento con valor cero, significa que hay espacio
                if (matriz[i][j] == null) {
                    return false;
                }
            }
        }
        // Si no encontramos ningún cero, la matriz está llena
        return true;
    }
    public boolean ValidarMatrix(Chef[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Si encontramos un elemento con valor cero, significa que hay espacio
                if (matriz[i][j] == null) {
                    return false;
                }
            }
        }
        // Si no encontramos ningún cero, la matriz está llena
        return true;
    }
    public boolean ValidarMatrix(HouseKeeping[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Si encontramos un elemento con valor cero, significa que hay espacio
                if (matriz[i][j] == null) {
                    return false;
                }
            }
        }
        // Si no encontramos ningún cero, la matriz está llena
        return true;
    }
    public boolean ValidarMatrix(Manager[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Si encontramos un elemento con valor cero, significa que hay espacio
                if (matriz[i][j] == null) {
                    return false;
                }
            }
        }
        // Si no encontramos ningún cero, la matriz está llena
        return true;
    }
    
    public void MostrarMatrix(Receptionist[][] matrizEmpleados) {
    String[] dia= {"         lunes","        martes","     miercoles","        jueves","       viernes","        sabado","       domingo"};
    for (int i = 0; i < matrizEmpleados.length; i++) {
        for (int j = 0; j < matrizEmpleados[i].length; j++) {
            Receptionist empleado = matrizEmpleados[i][j];
            if(i==0 && j==0){
                System.out.println("               Mañana \t"+ "Tarde \t" + "Noche \t");
            }
            if(j==0){
                System.out.print(dia[i]+"\t");
            }
            if (empleado != null) { // Asegúrate de que el objeto no sea null
                System.out.print(empleado.getNombre()+"\t"); // Imprime el nombre del empleado
            }else{
                System.out.print(null + "\t");
            }
        
        }
        System.out.println();
    }  
    }
    
    public void MostrarMatrix(Manager[][] matrizEmpleados) {
    String[] dia= {"         lunes","        martes","     miercoles","        jueves","       viernes","        sabado","       domingo"};
    for (int i = 0; i < matrizEmpleados.length; i++) {
        for (int j = 0; j < matrizEmpleados[i].length; j++) {
            Manager empleado = matrizEmpleados[i][j];
            if(i==0 && j==0){
                System.out.println("               Mañana \t"+ "Tarde \t" + "Noche \t");
            }
            if(j==0){
                System.out.print(dia[i]+"\t");
            }
            if (empleado != null) { // Asegúrate de que el objeto no sea null
                System.out.print(empleado.getNombre()+"\t"); // Imprime el nombre del empleado
            }else{
                System.out.print(null + "\t");
            }
        
        }
        System.out.println();
    }  
    }
    
    public void MostrarMatrix(HouseKeeping[][] matrizEmpleados) {
    String[] dia= {"         lunes","        martes","     miercoles","        jueves","       viernes","        sabado","       domingo"};
    for (int i = 0; i < matrizEmpleados.length; i++) {
        for (int j = 0; j < matrizEmpleados[i].length; j++) {
            HouseKeeping empleado = matrizEmpleados[i][j];
            if(i==0 && j==0){
                System.out.println("               Mañana \t"+ "Tarde \t" + "Noche \t");
            }
            if(j==0){
                System.out.print(dia[i]+"\t");
            }
            if (empleado != null) { // Asegúrate de que el objeto no sea null
                System.out.print(empleado.getNombre()+"\t"); // Imprime el nombre del empleado
            }else{
                System.out.print(null + "\t");
            }
        
        }
        System.out.println();
    }
    }
    
    public void MostrarMatrix(Chef[][] matrizEmpleados) {
    String[] dia= {"         lunes","        martes","     miercoles","        jueves","       viernes","        sabado","       domingo"};
    for (int i = 0; i < matrizEmpleados.length; i++) {
        for (int j = 0; j < matrizEmpleados[i].length; j++) {
            Chef empleado = matrizEmpleados[i][j];
            if(i==0 && j==0){
                System.out.println("               Mañana \t"+ "Tarde \t" + "Noche \t");
            }
            if(j==0){
                System.out.print(dia[i]+"\t");
            }
            if (empleado != null) { // Asegúrate de que el objeto no sea null
                System.out.print(empleado.getNombre()+"\t"); // Imprime el nombre del empleado
            }else{
                System.out.print(null + "\t");
            }
        
        }
        System.out.println();
    } 
    }
    
}
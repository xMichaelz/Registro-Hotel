package hotel;

import hotel.utilidades.Lectura;
import hotel.utilidades.Menu;

public class Centro {

    public static void Control(String[] args) {
        Manager[][] manager = new Manager[7][3];
        Chef[][] chef = new Chef[7][3];
        HouseKeeping[][] houseKeeping = new HouseKeeping[7][3];
        Receptionist[][] receptionist = new Receptionist[7][3];
        Manager ma = new Manager();
        Menu me = new Menu();
        Lectura le = new Lectura();
        boolean bandera = true; 
        while (bandera) {

            int opcionMenu = me.OpcionesMenu();

            if (opcionMenu == 1) {
                boolean bandera1 = true;
                while (bandera1) {
                    System.out.println("(Debe ingresar todo en minusculas)");
                    String tipoEmpleado = le.leerString("Ingrese el tipo de empleado a agregar Recepcionista, Manager, HouseKeeping o Chef ");
                    switch (tipoEmpleado) {
                        case "recepcionista":
                            Receptionist recepcionista = le.capturarInformacionReceptionist();
                            receptionist = ma.GuardarMatrix(receptionist, recepcionista);
                            bandera1 = false;
                            break;
                        case "manager":
                            Manager managerc = le.capturarInformacionManager();
                            manager = ma.GuardarMatrix(manager, managerc);
                            bandera1 = false;
                            break;
                        case "housekeeping":
                            HouseKeeping houseKeepingc = le.capturarInformacionHouseKeeping();
                            houseKeeping = ma.GuardarMatrix(houseKeeping, houseKeepingc);
                            bandera1 = false;
                            break;
                        case "chef":
                            Chef chefc = le.capturarInformacionChef();
                            chef = ma.GuardarMatrix(chef, chefc);
                            bandera1 = false;
                            break;
                        default:
                            System.out.println("Tipo de empleado no válido. Intente de nuevo.");
                            break;
                    }
                }

            } else if (opcionMenu == 2) {
                boolean bandera1 = true;
                while (bandera1) {
                    String tipoEmpleado = le.leerString("Ingrese el tipo de empleado que quiere ver sus horarios Recepcionista, Manager, HouseKeeping o Chef ");
                    switch (tipoEmpleado) {
                        case "recepcionista":
                            le.MostrarMatrix(receptionist);
                            bandera1 = false;
                            break;
                        case "manager":
                            le.MostrarMatrix(manager);
                            bandera1 = false;
                            break;
                        case "housekeeping":
                            le.MostrarMatrix(houseKeeping);
                            bandera1 = false;
                            break;
                        case "chef":
                            le.MostrarMatrix(chef);
                            bandera1 = false;
                            break;
                        default:
                            System.out.println("Tipo de empleado no válido. Intente de nuevo.");
                            break;
                    }
                }

            } else if (opcionMenu == 3) {
                System.out.println("saliendo del sistema fue un placer haberle ayudado...");
                bandera = false;
            }

        }

    }

}

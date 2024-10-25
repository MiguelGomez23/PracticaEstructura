import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

    @SuppressWarnings("null")
    public static void main(String[] args) {

        System.out.println("Prestamos de equipos de la universidad San Juan de Dios");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        Metodosedi objMetodosedi = new Metodosedi();
        Metodoseing objMetodoseing = new Metodoseing();
        Metodostab objMetodostab = new Metodostab();
        Metodoscomp objMetodoscomp = new Metodoscomp();

        LinkedList<Tableta> listatab = new LinkedList<>();
        LinkedList<computadores> listacomp = new LinkedList<>();
        LinkedList<prestamoseingenieria> listaeing = new LinkedList<>();
        LinkedList<prestamosediseño> listaedi = new LinkedList<>();

        listatab = objMetodostab.ImportarArchivo();
        listacomp = objMetodoscomp.ImportarArchivo();

        int opc = 0;
        do {
            System.out.println("Seleccione la opcìon que desea." +
                    "\n1. Estudiante diseño." +
                    "\n2. Estudiante ingenieria." +
                    "\n3. Ver inventario." +
                    "\n4. Salir");
            System.out.println();
            if (sc.hasNextInt()) {
                opc = sc.nextInt();
                int est;
                switch (opc) {
                    case 1:
                        int opt = 0;
                        do {
                            System.out.println("Estudiante de diseño");
                            System.out.println("\n1. Solicitar prestamo de equipo." +
                                    "\n2. Modificar prestamo de equipo." +
                                    "\n3. Regresar el equipo." +
                                    "\n4. Buscar equipo." +
                                    "\n5. Volver al menú principal.");
                            System.out.println();
                            if (sc.hasNextInt()) {
                                opt = sc.nextInt();
                                switch (opt) {
                                    case 1:
                                        System.out.println("Solicitar prestamo de equipo.\n");
                                        listaedi = objMetodosedi.ImportarArchivo();
                                        listatab = objMetodostab.ImportarArchivo();
                                        
                                        listaedi = objMetodosedi.LlenarLista(listaedi);
                                        System.out.println();
                                        listatab = objMetodostab.LlenarLista(listatab);

                                        
                                        objMetodosedi.ExportarArchivo(listaedi);
                                        break;

                                    case 2:
                                        System.out.println("Modificar prestamo de equipo.\n");
                                        listaedi = objMetodosedi.ImportarArchivo();
                                        //listaedi = objMetodosedi.ImportarArchivo();
                                        Metodosedi objmetodos = new Metodosedi();
                                        String SerialBuscar = "";
                                        System.out.println("Ingrese la cédula");
                                        SerialBuscar = sc.next();
                                        System.out.println();
                                        prestamosediseño result = objmetodos.Buscar(listaedi, SerialBuscar);

                                        if (result == null) {                                                                               
                                            System.out.println();
                                            System.out.println("El registro no existe");
                                            System.out.println();

                                        } else {
                                            System.out.println("Cedula: " + " " + result.getCedula());
                                            System.out.println("Nombre: " + " " + result.getNombre());
                                            System.out.println("Apellido: " + " " + result.getApellido());
                                            System.out.println("Telefono: " + " " + result.getTelefono());
                                            System.out.println(
                                                    "Modalidad de estudio: " + " " + result.getModalidadEstudio());
                                            System.out.println(
                                                    "cantidad de Asignaturas: " + " "
                                                            + result.getCantidadAsignaturas());
                                            System.out.println("Serial: " + " " + result.getSerial());
                                            System.out.println("------------------------------- \n");
                                        }
                                        objMetodosedi.ExportarArchivo(listaedi);
                                        break;

                                    case 3:
                                        System.out.println("Regresar el equipo.\n");
                                        listaedi = objMetodosedi.ImportarArchivo();
                                        objMetodosedi.ExportarArchivo(listaedi);
                                        break;

                                    case 4:
                                        System.out.println("Buscar equipo");
                                        listatab = objMetodostab.ImportarArchivo();
                                        Metodostab objmetodostab = new Metodostab();
                                        String SerialBuscarb = "";
                                        System.out.println("Ingrese el serial");
                                        SerialBuscarb = sc.next();
                                        Tableta resultb = objmetodostab.Buscar(listatab, SerialBuscarb);

                                        if (resultb == null) {
                                            System.out.println("El registro no existe");

                                        } else {
                                            System.out.println();
                                            System.out.println("Serial: " + " " + resultb.getSerial());
                                            System.out.println("Marca: " + " " + resultb.getMarca());
                                            System.out.println("Tamaño: " + " " + resultb.getTamano());
                                            System.out.println("Precio: " + " " + resultb.getPrecio());
                                            System.out.println(
                                                    "Almacenamiento: " + " " + resultb.getAlmacenamiento());
                                            System.out.println(
                                                    "Peso: " + " "
                                                            + resultb.getPeso());
                                            System.out.println();
                                            System.out.println("------------------------------- \n");
                                        }
                                        break;

                                    case 5:
                                        System.out.println("Regresando al menú principal.\n");
                                        break;

                                    default:
                                        System.out.println("Opción del 1 al 5.\n");
                                        break;
                                }
                            } else {
                                System.out.println("Por favor, ingrese un número entero.\n");
                                sc.next();
                            }
                        } while (opt != 5);
                        break;

                    case 2:
                        int optt = 0;
                        do {
                            System.out.println("Estudiante de ingenieria");
                            System.out.println("\n1. Solicitar prestamo de equipo." +
                                    "\n2. Modificar prestamo de equipo." +
                                    "\n3. Regresar el equipo." +
                                    "\n4. Buscar equipo." +
                                    "\n5. Volver al menú principal.");
                            System.out.println();
                            if (sc.hasNextInt()) {
                                optt = sc.nextInt();
                                switch (optt) {

                                    case 1:
                                        System.out.println("Solicitar prestamo de equipo.\n");
                                        listaeing = objMetodoseing.ImportarArchivo();
                                        computadores cp = new computadores();
                                        cp.SeleccionarSO();
                                        cp.SeleccionarPr();
                                        break;

                                    case 2:
                                        System.out.println("Modificar prestamo de equipo.\n");
                                        listaeing = objMetodoseing.ImportarArchivo();
                                        break;

                                    case 3:
                                        System.out.println("Regresar el equipo.\n");
                                        listaeing = objMetodoseing.ImportarArchivo();
                                        break;

                                    case 4:
                                        System.out.println("Buscar equipo");
                                        listacomp = objMetodoscomp.ImportarArchivo();
                                        Metodoscomp objMetodoscompb = new Metodoscomp();
                                        String SerialBuscarb = "";
                                        System.out.println("Ingrese la serial que desea buscar");
                                        SerialBuscarb = sc.next();
                                        computadores result = objMetodoscompb.Buscar(listacomp, SerialBuscarb);

                                        if (result == null) {
                                            System.out.println("El registro no existe");
                                        } else {
                                            System.out.println();
                                            System.out.println("Cedula: " + " " + result.getSerial());
                                            System.out.println("Nombre: " + " " + result.getMarca());
                                            System.out.println("Apellido: " + " " + result.getTamano());
                                            System.out.println("Telefono: " + " " + result.getPrecio());
                                            System.out.println("Numero de semestre: " + " " + result.getSistemaOperativo());
                                            System.out.println("Promedio: " + " " + result.getProcesador());
                                            System.out.println();
                                            System.out.println("------------------------------- \n");
                                        }
                                        break;

                                    case 5:
                                        System.out.println("Regresando al menú principal.\n");
                                        break;

                                    default:
                                        System.out.println("Opción no válida, seleccione del 1 al 5.\n");
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Por favor, ingrese un número entero.\n");
                                sc.next();
                            }
                        } while (optt != 5);
                        break;

                    case 3:
                        System.out.println("Ver inventario");
                        System.out.println("1.Estudiante de diseño, 2. Estudiante de ingenieria");
                        est = sc.nextInt();
                        if (est == 1) {
                            System.out.println();
                        System.out.println("          TABLETS\n");
                        System.out.println();
                        objMetodostab.MostrarLista(listatab);
                        System.out.println();
                            
                        } else {
                            System.out.println();
                            System.out.println("          COMPUTADORES\n");
                            System.out.println();
                        objMetodoscomp.MostrarLista(listacomp);
                        System.out.println();
                        }
                        
                        
                        
                        break;

                    case 4:
                        System.out.println("Saliste");
                        sc.close();
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción de 1 a 4.");
                        break;
                }
            } else {
                System.out.println("Por favor, ingrese un número entero.");
                sc.next();
            }
        } while (opc != 4);
    }
}
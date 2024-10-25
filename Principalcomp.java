import java.util.LinkedList;
import java.util.Scanner;

public class Principalcomp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodoscomp m = new Metodoscomp();
        int opt = 0;
        LinkedList<computadores> lista = new LinkedList<>();
        boolean bandera = true;
        lista = m.ImportarArchivo();
        while (bandera) {
            System.out.println("Ingrese la opcion");
            System.out.println("1: LLenar lista");
            System.out.println("2: Mostrar Lista");
            System.out.println("3: Importar Archivo");
            System.out.println("4: Exportar Archivo");
            System.out.println("5: Buscar por serial");
            if (sc.hasNextInt()) {
                opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        lista = m.LlenarLista(lista);
                        break;
                    case 2:
                        m.MostrarLista(lista);
                        break;
                    case 3:
                        //lista = m.ImportarArchivo();
                        //break;
                    case 4:
                        m.ExportarArchivo(lista);
                        break;
                    case 5:
                        Metodoscomp b = new Metodoscomp();
                        String SerialBuscar = "";
                        System.out.println("Ingrese el serial que desea buscar");
                        SerialBuscar = sc.next();
                        computadores result = b.Buscar(lista, SerialBuscar);

                        if (result == null) {
                            System.out.println("El registro no existe");
                        } else {
                            System.out.println("El serial es: " + result.getSerial());
                            System.out.println("La marca es: " + result.getMarca());
                            System.out.println("El tamaño es: " + result.getTamano());
                            System.out.println("El precio es: " + result.getPrecio());
                            System.out.println("El sistema operativo es: " + result.getSistemaOperativo());
                            System.out.println("El procesador es: " + result.getProcesador());
                        }
                        break;

                    
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción de 1 a 5.");
                        break;
                }
            } else {
                System.out.println("Por favor, ingrese un número entero.");
                sc.next();
            }
        }
        sc.close();
    }
}
import java.util.LinkedList;
import java.util.Scanner;

public class Metodoscomp {
    public LinkedList<computadores> LlenarLista(LinkedList<computadores> lista) {
        boolean bandera = true;
        Metodoscomp m = new Metodoscomp();
        int opt = 0;
        Scanner sc = new Scanner(System.in);

        while (bandera) {
            System.out.println("Ingrese el serial");
            String Serial = sc.next();

            // Verificamos si ya existe
            computadores a = m.BuscarPorSerial(lista, Serial);
            if (a != null && a.getSerial() != null) {
                System.out.println("El registro ya existe, por favor ingrese otro serial\n");
                continue; // Continuamos con el ciclo en lugar de romperlo
            }

            // Creamos una nueva instancia solo si el serial no existe
            a = new computadores();
            a.setSerial(Serial);
            sc.nextLine();

            

            System.out.println("Ingrese el tamaño");
            while (!sc.hasNextFloat()) {
                System.out.println("Opcion no valida, por favor ingrese un tamaño válido");
                sc.next(); // Descartar entrada inválida
            }
            a.setTamano(sc.nextFloat());
            sc.nextLine();

            System.out.println("Ingrese el precio");
            while (!sc.hasNextFloat()) {
                System.out.println("Opcion no valida, por favor ingrese un precio válido");
                sc.next(); // Descartar entrada inválida
            }
            a.setPrecio(sc.nextFloat());
            sc.nextLine();

            System.out.println("Ingrese el sistema operativo");
            a.setSistemaOperativo(sc.next());
            sc.nextLine();

            System.out.println("Ingrese el procesador");
            a.setProcesador(sc.next());
            sc.nextLine();

            // Agregar a la lista
            lista.add(a);

            // Preguntar si desea continuar
            System.out.println("Desea continuar 1: Si, 2: No");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida, por favor ingrese un número válido");
                sc.next(); // Descartar entrada inválida
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 2) {
                bandera = false; // Finalizamos el ciclo
            }
        }
        sc.close();
        return lista;
    }

    public void MostrarLista(LinkedList<computadores> lista) {
        for (computadores computadores : lista) {
            System.out.println("Serial: " + " " + computadores.getSerial());
            System.out.println("Precio: " + " " + computadores.getPrecio());
            System.out.println("Tamaño: " + " " + computadores.getTamano());
            System.out.println("Precio: " + " " + computadores.getPrecio());
            System.out.println("Sistema operativo: " + " " + computadores.getSistemaOperativo());
            System.out.println("Procesador: " + " " + computadores.getProcesador());

            System.out.println("------------------------------- \n");

        }
    }

    public void ExportarArchivo(LinkedList<computadores> lista) {
        ExportarArchivocomp e = new ExportarArchivocomp();
        e.exportarArchivo(lista);
    }

    public LinkedList<computadores> ImportarArchivo() {
        ImportarArchivoTxtcomp i = new ImportarArchivoTxtcomp();
        LinkedList<computadores> lista = i.leerArchivo("computadoreses");
        return lista;
    }

    public computadores BuscarPorSerial(LinkedList<computadores> lista, String serial) {
        for (computadores comp : lista) {
            if (comp.getSerial().equals(serial)) {
                return comp; // Retorna el objeto encontrado
            }
        }
        return null; // Retorna null si no se encuentra
    }

    public computadores BuscarPorMarca(LinkedList<computadores> lista, String marca) {

        for (computadores compMarca : lista) {
            if (compMarca.getMarca().equals(marca)) {
                return compMarca; // Retorna el objeto encontrado
            }
        }

        return null;

    }

    public computadores BuscarPorTamano(LinkedList<computadores> lista, Float tamano) {
        for (computadores compTamano : lista) {
            if (compTamano.getTamano() == tamano) {
                return compTamano; // Retorna el objeto encontrado
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }

    public computadores BuscarPorPrecio(LinkedList<computadores> lista, Float precio) {
        for (computadores compPrecio : lista) {
            if (compPrecio.getPrecio() == precio) {
                return compPrecio; // Retorna el objeto encontrado
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }

    public computadores BuscarPorSistemaOPerativo(LinkedList<computadores> lista, String sistemaoperativo) {

        for (computadores compSistemaOPerativo : lista) {
            if (compSistemaOPerativo.getSistemaOperativo().equals(sistemaoperativo)) {
                return compSistemaOPerativo; // Retorna el objeto encontrado
            }
        }

        return null;

    }
    public computadores BuscarPorProcesador(LinkedList<computadores> lista, String procesador) {

        for (computadores compProcesador : lista) {
            if (compProcesador.getProcesador().equals(procesador)) {
                return compProcesador; // Retorna el objeto encontrado
            }
        }

        return null;

    }

}
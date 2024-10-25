import java.util.Scanner;

public class computadores {
    String Serial;
    String Marca;
    float Tamano;
    float Precio;
    String SistemaOperativo;
    String Procesador;

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getTamano() {
        return Tamano;
    }

    public void setTamano(float tamano) {
        Tamano = tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public void SeleccionarSO() {

        Scanner scanner = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("Seleccione el sistema operativo que desea:");
            System.out.println("1. Windows 7");
            System.out.println("2. Windows 10");
            System.out.println("3. Windows 11");
            System.out.println();
            if (scanner.hasNextInt(opt)) {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        SistemaOperativo = "Windows 7";
                        break;
                    case 2:
                        SistemaOperativo = "Windows 10";
                        break;
                    case 3:
                        SistemaOperativo = "Windows 11";
                        break;
                    default:
                        System.out.println("Opción inválida, por favor ingrese del 1 al 3");
                        break;
                }
            } else {
                System.out.println("Ingrese un número entero");
                scanner.next();
            }
        } while (opt < 1 || opt > 3);

        System.out.println("Sistema operativo seleccionado: " + SistemaOperativo);
    }

    public void SeleccionarPr() {

        Scanner scanner = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("Seleccione el procesador que desea:");
            System.out.println("1. AMD Ryzen");
            System.out.println("2. Intel® Core™ i5");
            if (scanner.hasNextInt(opt)) {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        Procesador = "AMD Ryzen";
                        break;
                    case 2:
                        Procesador = "Intel® Core™ i5";
                        break;
                    default:
                        System.out.println("Opción inválida, ingrese 1 o 2");
                        break;
                }
            } else {
                System.out.println("Ingrese un número entero");
                scanner.next();
            }
        } while (opt < 1 || opt > 2);

        System.out.println("Procesador seleccionado: " + Procesador);
    }
}
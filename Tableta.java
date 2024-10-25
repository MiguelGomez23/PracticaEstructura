import java.util.Scanner;

public class Tableta {

    String Serial;
    String Marca;
    float Tamano;
    float Precio;
    String Almacenamiento;
    float Peso;

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

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        Almacenamiento = almacenamiento;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public void SeleccionarAlmacenamiento() {

        Scanner scanner = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("Seleccione el almacenamiento que desea");
            System.out.println("1. 256 GB");
            System.out.println("2. 512 GB");
            System.out.println("3. 1 TB");
            System.out.println();
            if (scanner.hasNextInt()) {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        Almacenamiento = "256 GB";
                        break;
                    case 2:
                        Almacenamiento = "512 GB";
                        break;
                    case 3:
                        Almacenamiento = "1 TB";
                        break;
                    default:
                        System.out.println("Opción inválida,por favor eliga una opción de 1 a 3\n");
                        break;
                }
            } else {
                System.out.println("Por favor, ingrese un número entero.\n");
                scanner.next();
            }
        } while (opt < 1 || opt > 3);

        // scanner.close();
        System.out.println("Almacenamiento seleccionado: " + Almacenamiento);
    }
}
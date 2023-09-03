import java.util.Scanner;

public class StarProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario un valor
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();

        // Crea un arreglo de String con el valor ingresado
        String[] a = new String[]{String.valueOf(valor)};

        // Llama a la clase Sierpinsky con el valor como argumento
        Sierpinsky.main(a);
    }
}


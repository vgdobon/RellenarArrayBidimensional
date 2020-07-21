import java.util.Scanner;
    // Crear un array 5x5 de floats, darles valor aleatorio e imprimirlo
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantas filas quieres tu array");
        int filas = sc.nextInt();
        System.out.println("De cuantas columnas quieres tu array");
        int columnas = sc.nextInt();
        ArrayBidimensional nuevoArray= new ArrayBidimensional(filas,columnas);

        nuevoArray.rellenar();
        nuevoArray.draw();
    }
}

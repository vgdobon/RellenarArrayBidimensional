import java.util.Random;

public class ArrayBidimensional {
    private float [][] arrayBidimensional;

    public ArrayBidimensional(int filas,int columnas){
        arrayBidimensional= new float [filas][columnas];
    }

    public void rellenar(){
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                arrayBidimensional[i][j]= new Random().nextFloat();
            }
        }
    }

    public void draw(){
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.print(arrayBidimensional[i][j]);
            }
            System.out.println();
        }
    }

}

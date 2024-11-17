import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Introduce un valor o símbolo");
        char patron= input.next().charAt(0);                        //Sentencia para leer únicamente el primer caracter introducido

        int tamany=0;

        while (true){                                               //Bucle para asegurar que el usuario introduce los datos solicitados
            System.out.println("Introduce un tamaño para el tablero (de 1 a 15)");
            if(input.hasNextInt()){
                tamany=input.nextInt();
                if(tamany>=1 && tamany<=15){
                    break;
                }
            }
          else{
                input.next();
            }
            System.out.println("Valor erróneo. Por favor, introduce un valor comprendido entre 1 y 15 ambos incluidos");
        }
    for (int fila=0; fila<8;fila++){                                                  //Itera sobre las 8 filas del tablero
        for (int i=0; i<tamany; i++){                                                //Altura de la fila
            for (int columna=0; columna<8;columna++){
                char imprimirTablero;
                if ((fila+columna)%2==0){
                    imprimirTablero=patron;
                }else {
                    imprimirTablero=' ';
                }
                //Controla la anchura
                for (int j=0; j<tamany;j++) {
                    System.out.print(imprimirTablero);
                }
            }
            System.out.println();
        }
    }

    }
}
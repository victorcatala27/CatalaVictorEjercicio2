import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Introduce un valor o símbolo");
        char patron= input.next().charAt(0);            //Sentencia para leer únicamente el primer caracter introducido

        int tamany=0;

        while (true){                                   //Bucle para asegurar que el usuario introduce los datos solicitados
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


    }
}
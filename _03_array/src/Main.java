import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);

        //Creamos nuestro array que guardará las notas de los estudiantes
        double[] notas = new double[10];
        double sumaTotal = 0;

        //Ciclo for para pedir al usuario las notas de los 10 estudiantes
        //Inicia en cero, llega hasta 9 y aumenta en q
        for(int i = 0; i<10; i++){
            System.out.println("Ingrese la nota del estudiante #"+(i+1));
            try {
                //Guarda en la variable notas la posición que se está iterando
               notas[i] = objScanner.nextDouble();
               //sumaTotal = sumaTotal + notas
               sumaTotal += notas[i];
            }catch (Exception e){
                System.out.println("Nota no valida");
                break;
            }
        }
        //Variable para guardar el promedio general de las notas
        double promedio = sumaTotal/notas.length;
        System.out.println(promedio);

    }
}
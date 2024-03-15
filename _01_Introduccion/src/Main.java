import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println: Permite imprimir un mensaje en consola
       System.out.println("Hola Mundo");

       /*
       //Instanciar las clase Scanner nos permite crear un objeto para

       //leer los datos ingresados desde la consola
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = objScanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = objScanner.nextInt();

        System.out.println("Ingresa tu altura: ");
        double altura = objScanner.nextDouble();

        System.out.println("Datos " + " nombre: " + nombre + " edad: " + edad + " altura: "+ altura);

        objScanner.close();

        if (edad >= 18){
            System.out.println(nombre + " Eres mayor de edad");
            if(altura >= 1.80){
                System.out.println(altura + "Eres de estatura promedio");
            }else{
                System.out.println("Eres una persona de estatura baja");
            }
        }else {
            System.out.println(nombre + " Eres  menor de edad");
            if(altura >= 1.80){
                System.out.println(altura + "Eres de estatura promedio");
            }else{
                System.out.println("Eres una persona de estatura baja");
            }
        }
        */


        //Ejercicio 1
        //Calculadora basica

        Scanner objScanner1 = new Scanner(System.in);

        String option = JOptionPane.showInputDialog("MENU DE OPERACIONES\n 1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División");

        //Obtener los dos números a operar
        String num1 = JOptionPane.showInputDialog("Ingrese el primer número");
        String num2 = JOptionPane.showInputDialog("Ingrese el segundo número");

        //Convertir los números que están en string a entero
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);

        switch (option){
            case "1":
                JOptionPane.showInputDialog(a + " + "+ b +" = "+ (a+b));
                break;
            case "2":
                JOptionPane.showInputDialog(a + " - "+ b +" = "+ (a-b));
                break;
            case "3":
                JOptionPane.showInputDialog(a + " * "+ b +" = "+ (a*b));
                break;
            case "4":
                if(b == 0){
                    JOptionPane.showInputDialog("El número"+ b +"debe ser diferente que el número"+ a);
                }else{
                    JOptionPane.showInputDialog(a + " / "+ b +" = "+ (a/b));
                }
                
        }
    }
}
package riwi.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleado objEmpleado = new Empleado();
        int id = 0;

        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado");
        objEmpleado.setNombre(objScanner.nextLine());

        System.out.println("Ingresa el salario base del empleado");
        objEmpleado.setSalario(objScanner.nextDouble());

    }







}

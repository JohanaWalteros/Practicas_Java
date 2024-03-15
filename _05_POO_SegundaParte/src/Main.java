import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Se instancia inventario, por que esta clase tiene el método de agregar, eliminar y listar
        //Crear una nueva instanciar es para llamar los métodos de una clase

        //La variable inventario, va a traer todos los métodos que estan en la clase inventario
        Inventario inventario = new Inventario();


        int opcion = 0;
        do {
            System.out.println(""" 
                Menú Inventario 
                1. Agregar un producto 
                2. Listar productos 
                3. Eliminar productos 
                4. Salir 
                """);

            Scanner objScanner = new Scanner(System.in);
            opcion = objScanner.nextInt();

            switch (opcion){
                case 1:

                    //Se instancia la clase producto especifico por van a ingresar datos
                    ProductoEspecifico producto = new ProductoEspecifico();
                    System.out.println("Ingrese en nombre del producto");
                    String nombre = objScanner.next();

                    System.out.println("Ingrese el id del producto");
                    int id = objScanner.nextInt();

                    //

                    System.out.println("Ingrese el precio del producto");
                    double precio = objScanner.nextDouble();

                    System.out.println("Ingrese la categoría del producto");
                    String categoria = objScanner.next();

                    System.out.println("Ingrese la marca del producto");
                    String marca = objScanner.next();

                    producto.setId(id);
                    producto.setPrecio(precio);
                    producto.setCategoria(categoria);
                    producto.setMarca(marca);
                    producto.setNombre(nombre);

                    inventario.agregar(producto);
                    break;

                case 2:
                    //Primero llamar a la variable que esta instanciada, que es inventario,
                    // luego el método que es listar

                    inventario.listar();

                    break;

                case 3:
                    inventario.listar();

                    System.out.println("Ingrese el id del producto que desea eliminar");
                    int idProducto = objScanner.nextInt();

                    inventario.eliminar(idProducto);
                    break;
            }

        } while (opcion != 4);


    }
}
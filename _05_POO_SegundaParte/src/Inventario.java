import java.util.ArrayList;

public class Inventario {

    // ArrayList (lista o tipo de dato lista) recibe un tipo de dato que es producto especifico
    //Lista producto es el nombre del atributo, lo que quiere decir que espera que ingrese un producto
    ArrayList<ProductoEspecifico> listaProductos;

    //Este es el constructor. Con this se trae la información que está dentro del array, luego se instancia (new)
    //la lista para crear y guardar la información
    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    //Métodos
    //Void no retorna informacion, recibe un parametro productoPorAgregar que es de tipo ProductoEspecifico
    public void agregar(ProductoEspecifico productoPorAgregar) {

        //This trae la informacion de lista de productos y add agrega el poducto nuevo a la lista
       //Se valida si el producto fue agregado ya que el método de listas add es boolean
        if (this.listaProductos.add(productoPorAgregar)) {
            System.out.println("El producto ha sido agregado correctamente");
        } else {
            System.out.println("Opps hay un error, el producto no ha sido agregado");
        }
    }

    public void eliminar(int idProducto) {


        //Remove if, funciona como un for Each: recorre cada producto de la lista producto ((this.listaProductos)
        //compara si el id que esta en la lista y el íd que ingreso el usuario son iguales, si son
        //iguales, los elimina(.removeIf)
        if (this.listaProductos.removeIf(producto -> producto.getId() == idProducto)) {
            System.out.println("El producto  ha sido eliminado");
        } else {
            System.out.println("El producto  no ha sido eliminado correctamente");
        }
    }

    public void listar(){
        System.out.println(this.listaProductos.size());

        if(this.listaProductos.isEmpty()){
            System.out.println("No hay productos en la lista");
        }else {
            for (ProductoEspecifico productoTem : this.listaProductos) {
                System.out.println(productoTem.toString());
            }
        }
    }
}

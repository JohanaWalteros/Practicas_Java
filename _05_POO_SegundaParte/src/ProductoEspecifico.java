public class ProductoEspecifico extends Producto{
    private String categoria;
    private  String marca;

    public  ProductoEspecifico(){

    }

    public ProductoEspecifico(int id, String nombre, int precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "id: " + getId() + "Nombre: " + getNombre() +"Marca: "+this.marca + "Precio: "+getPrecio() +"Categoría: "+this.categoria;
    }
}

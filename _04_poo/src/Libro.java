public class Libro {

    //1. Atributos
    private String titulo;
    private String autor;
    private String publicacion;
    private Boolean prestado;

    //Método constructor

    public Libro(String titulo, String autor, String publicacion, Boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.prestado = prestado;
    }

    //2. Métodos: para obtener la información de los atributos. Se crean métodos públicos
    //Get obtiene la información, This, hace referencia a la clase
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    //Set gurda información
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public void  cambiarEstado(){
       this.prestado = !this.prestado;
    }

    //Override: sobrecarga, cuando algo tiene un @ se llama decorador
    @Override
    public String toString() {
        return "Libro:\n " +
                "Titulo = " + titulo + '\n' +
                "Autor = " + autor + '\n' +
                "Publicacion = " + publicacion + '\n' +
                "Prestado = " + prestado;
    }
}

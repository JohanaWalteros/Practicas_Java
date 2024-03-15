import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*Lista de Reproducción Musical: Imagina que estás creando una aplicación para gestionar
        listas de reproducción musicales. Cada canción es representada simplemente por su nombre.
        El programa debe permitir:
             Añadir y remover canciones de la lista de reproducción.
             Mostrar la canción actual y las siguientes en la lista.
               Saltar a la siguiente canción.*/

        //El < > es un genérico, son como parámetros
        //Creación de la lista de canciones
        ArrayList<String> playList = new ArrayList<String>();

        int option = 0;
        int cancionActual = 0;

        do{

            try{
                //El option es entero (Intenger), paseInt convierte de string a entero
                option = Integer.parseInt(JOptionPane.showInputDialog("PLAYLIST\n" +
                        "1. Agregar canción\n" +
                        "2. Remover canción\n" +
                        "3.Mostrar canción actual y siguiente en la lista\n" +
                        "4. Saltar a la siguiente canción\n" +
                        "5. Salir\n" +
                        "Ingrese una opción"));

                switch (option){
                    case 1://Añadir una canción

                        //Solicitud de nueva canción al usuario
                        String nuevaCancion = JOptionPane.showInputDialog("Ingrese el nombre de la canción a agregar");

                        //Agregar nueva canción a la play list
                        playList.add(nuevaCancion.toLowerCase());

                        JOptionPane.showInputDialog(null,"Nueva canción agregada correctamente🎧🎶");
                        break;

                    case 2://Eliminar canción
                        String eliminarCancion = JOptionPane.showInputDialog("Ingrese el nombre de la canción que desea eliminar");

                        //Eliminar la canción que tenga ese nombre
                        if (playList.remove(eliminarCancion.toLowerCase())){

                            JOptionPane.showInputDialog(null,eliminarCancion+"Eliminada correctamente");
                        }else {
                            JOptionPane.showInputDialog(null,eliminarCancion+"No se encuentra en la play lista");
                        }
                        break;

                    case 3://Mostrar la canción actual y la siguiente en la lista
                        //Preguntar si la play list esta vacía
                        if(playList.isEmpty()){
                            JOptionPane.showInputDialog(null,"La play list esta vacía");
                        }else {
                            //Creamos una variable para guardar en texto todas las canciones
                            String listaTotal = "";

                            //Agregamos la canción actual
                            listaTotal += "Canción actual\n"+playList.get(cancionActual)+"\n"+"\n\n Siguientes en la lista\n";

                            for (int i = cancionActual; i <playList.size()-1 ; i++){
                                listaTotal += "🎶"+playList.get(i+1)+"\n";
                            }
                            JOptionPane.showInputDialog(null, listaTotal);
                        }
                        break;

                    case 4://Saltar a la siguiente canción

                        //Validar que si haya una siguiente canción
                        if(cancionActual +1 < playList.size()){
                            cancionActual++;
                            JOptionPane.showInputDialog(null, playList.get(cancionActual)+"Reproducida correctamente");
                        }else {
                            JOptionPane.showInputDialog(null,"PlayList finalizada");
                            cancionActual = 0;
                        }
                        break;
                }




            }catch (Exception e){
                JOptionPane.showInputDialog(null,"Caracteres no validos");
            }


        }while (option !=5);
    }
}

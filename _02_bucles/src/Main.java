//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Contador simple: Ecribe un programa que utilice*/

       for(int i=1; i<=10;i++){
           System.out.println(i);
       }

       /*2. */
        int contador = 0;
        int sumaTotal = 0;

        while (contador <= 100){
            sumaTotal += contador;
            contador++;
        }

        System.out.println(sumaTotal);

        /*Tabla del 1 al 10*/

        for(int i=1; i<=10; i++){
            System.out.println(\n );
        }




    }
}
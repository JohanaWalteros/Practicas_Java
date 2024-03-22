import controller.CoderController;
import database.ConfigDB;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoderController objCoderController = new CoderController();
        String option ="";
        do{

            option = JOptionPane.showInputDialog("""
                    Menu
                    1. List Coders
                    2. Insert Coder
                    3. Update Coder
                    4. Delete Coder
                    5. Get By name
                    6. Exit
                    
                    Chose an option:
                    """);

            switch (option){
                case "1"://Listar todos los coder
                    objCoderController.getAll();
                    break;
                case "2":
                    objCoderController.create();
                    break;
            }
        }while (!option.equals("6"));


    }
}
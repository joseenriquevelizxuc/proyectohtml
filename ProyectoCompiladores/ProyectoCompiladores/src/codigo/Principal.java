/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ENRIQUE
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\src\\codigo\\Lexer.flex"; 
        String ruta2 = "C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\src\\codigo\\LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\src\\codigo\\Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        jflex.Main.generate(archivo);
        archivo = new File(ruta2);
        jflex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\src\\codigo\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\sym.java"), 
                Paths.get("C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\src\\codigo\\sym.java")
        );
        Path rutaSin = Paths.get("C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\src\\codigo\\Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\Sintax.java"), 
                Paths.get("C:\\Users\\ENRIQUE\\Desktop\\Tarea Compi\\TERCER PARCIAL\\ProyectoCompiladores\\ProyectoCompiladores\\src\\codigo\\Sintax.java")
        );
    }
}

package model;
import java.util.*;
import java.io.*;

public class EjemploIO {

    public static void main(String[] args) throws Exception {

        Scanner stdin = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo: ");
        String nombre = stdin.next();
        File archivo = new File(nombre);
        Scanner archivoEntrada = new Scanner(archivo);

        while (archivoEntrada.hasNext()) {
            String lineaActual = archivoEntrada.nextLine();
            System.out.println(lineaActual);
        }
        archivoEntrada.close();
        stdin.close();
    }
}
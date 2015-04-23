package model;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) throws FileNotFoundException {
        File arc1 = new File("textFile.txt");

        Scanner scn = new Scanner(arc1);
        scn.hasNext();

    }
}

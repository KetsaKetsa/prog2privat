package Teil1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class STLReader {

    static String DATEINAME = "C:\\Users\\Cripa\\NetBeans - Projekte\\PROG2\\src\\main\\java\\Teil1\\Triangle.stl";                           //<-HIER DATEINAME einfügen, wenn nicht im gleichen Verzeichnis -> Dateipfad!

    public static void main(String[] args) {

        einlesen(DATEINAME);

    }

    public static void einlesen(String dateiname) {

        try {
            File stldatei = new File(dateiname);
            Scanner sc1 = new Scanner(stldatei);

            while (sc1.hasNextFloat() != true) {
                if (sc1.hasNextFloat() == true) {
                    System.out.println(sc1.next());
                }
                System.out.println("T " + sc1.next());
            }
            sc1.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

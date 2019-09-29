package sekcja14;


import sekcja14.io.Location;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter locFile = new FileWriter("test.txt");
        locFile.write("haha ");


        locFile.close();


    }
}



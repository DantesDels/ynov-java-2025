package fr.ynov.java.medium;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void javaProg() throws IOException {
        FileWriter fw = new FileWriter("res/testReadFile.txt", true);
        fw.write("\n Something");
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        javaProg();
    }
}

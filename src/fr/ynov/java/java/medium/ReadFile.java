package fr.ynov.java.java.medium;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class ReadFile {
    public static void javaProg () {
        URL url = ReadFile.class.getResource("testReadFile.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        javaProg();
    }
}
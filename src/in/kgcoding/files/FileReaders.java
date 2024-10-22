package src.in.kgcoding.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file");
        String fileName = scanner.next();

        try (FileReader fileReader = new FileReader(fileName)){
            int read;
            while ((read = fileReader.read()) != -1){
                System.out.print((char) read);
            }

        } catch (FileNotFoundException fileNotFoundException){
            System.out.printf("%s not found Exception %s",fileName, fileNotFoundException.getMessage());
        }
        catch (IOException ioException){
            System.out.printf("Exception %s ",ioException.getMessage());
        }
    }
}

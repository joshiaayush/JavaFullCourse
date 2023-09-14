package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        try{
            File file = new File("test1.txt");
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else System.out.println("File already present..");
            System.out.println(file.isFile());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.getTotalSpace());
            System.out.println(file.exists());
            System.out.println(file.canWrite());

        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}

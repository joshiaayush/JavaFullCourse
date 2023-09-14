package filehandling;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("new.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write("Pune".getBytes());
            System.out.println("File write Successful !");

            bufferedOutputStream.close();
            fileOutputStream.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("new.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i != -1){
                System.out.println((char) i);
                i = bufferedInputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

        }
    }


}

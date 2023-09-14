package filehandling;

import java.io.*;

public class ByteArrayOutputDemo {
    public static void main(String[] args) {

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
            FileOutputStream fileOutputStream1 = new FileOutputStream("pqr.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("abc");

            ByteArrayOutputStream obj = new ByteArrayOutputStream();
            byte [] str = "Pune".getBytes();
            obj.write(str);

            obj.writeTo(fileOutputStream);
            obj.writeTo(fileOutputStream1);
            obj.writeTo(fileOutputStream2);

            System.out.println("File write successful......");
        }catch (Exception e ){
            throw new RuntimeException();
        }

        try {
            FileInputStream fileInputStream1 = new FileInputStream("xyz.txt");
            FileInputStream fileInputStream2 = new FileInputStream("pqr.txt");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);

            for (int i = sequenceInputStream.read(); i != -1;){
                System.out.print((char) i+"😉");
                i = sequenceInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//^_^(┬┬﹏┬┬)^_^OwOX_X;((￣y▽￣)╭ Oho.....--<-<-<@
// 🤣👨‍🍳👨‍🏭👨‍🔬😁😋😉😆

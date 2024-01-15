package designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFileInputStreamMain {
    static int c;
    public static void main(String[] args) {
        try{
            InputStream in = new MyFileInputStream(new BufferedInputStream(new FileInputStream("/Users/niharsh/work/learn-java/src/designpatterns/decorator/text.txt")));
            while ( (c=in.read()) >=0){
                System.out.print((char) c);
            }
        }
        catch (IOException io){
            io.printStackTrace();
        }
    }
}

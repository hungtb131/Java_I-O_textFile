package Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void writer(String pathname, String string) {
        try {
            File file = new File(pathname);
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(string);
            fileWriter.close();
        }catch (IOException e){
            System.err.println("Eror");
        }
    }


    public void bufferWriter(String pathname) {
        try {
            File file = new File(pathname);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String string = "xyz";
            bufferedWriter.write(string);
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (IOException e){
            System.err.println("Eror!");
        }
    }
}

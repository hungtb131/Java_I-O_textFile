package Writer;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        Writer writer = new Writer();
        writer.writer("test_writer.txt", string);
        writer.bufferWriter("test_writer1.txt");
    }
}

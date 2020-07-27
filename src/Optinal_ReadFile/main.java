package Optinal_ReadFile;

import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter path : ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(file.getAbsolutePath());
    }
}

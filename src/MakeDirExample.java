import java.io.File;

public class MakeDirExample {
    public static void main(String[] args) {

        File dir1 = new File("C:/test2/test3");

        System.out.println("Pathname: " + dir1.getAbsolutePath());
        System.out.println("Path Exists? " + dir1.exists());
        System.out.println("Parent Path Exists? " + dir1.getParentFile().exists());

        // Với mkdir(), thư mục chỉ được tạo ra nếu thư mục cha tồn tại.
        boolean created = dir1.mkdir();

        System.out.println("Directory created? " + created);

        System.out.println("--------------------");

        File dir2 = new File("C:/test2/test3/test4");

        System.out.println("Pathname: " + dir2.getAbsolutePath());
        System.out.println("Exists? " + dir2.exists());

        //
        created = dir1.mkdirs();

        System.out.println("Directory created? " + created);
    }

}

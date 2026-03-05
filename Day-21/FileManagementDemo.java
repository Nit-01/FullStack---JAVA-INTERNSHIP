
import java.io.*;

class FileManagementDemo {
    public static void main(String[] args) throws Exception {

        File file = new File("data.txt");

        if(file.createNewFile()) {
            System.out.println("File created");
        }

        FileWriter fw = new FileWriter(file);
        fw.write("Java File Handling Example");
        fw.close();

        FileReader fr = new FileReader(file);
        int ch;

        while((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }

        fr.close();

    }
}
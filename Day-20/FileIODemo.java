import java.io.*;

class FileIODemo {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");

        int ch;

        while((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("File copied successfully");

    }
}
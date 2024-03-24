import java.io.*;
public class FileWrite {
    public static void main(String[] args){
        String filePath = "exam.txt";
        File file = new File(filePath);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String text = "This is an example of writing a file.\nFile operations are performed with Java.";
            bufferedWriter.write(text);
            bufferedWriter.close();
            System.out.println("file writing completed successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

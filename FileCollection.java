import java.io.*;
public class FileCollection {
    public static void main(String[] args) throws IOException {
        String filePath = "exam.txt";
        File file = new File(filePath);
        int sum  = 0;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){//satır okuma işlemi gerçekleştiriyor.
                int number = Integer.parseInt(line);// satırları ınteger yapıyor.
                sum += number;
            }
            bufferedReader.close();
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

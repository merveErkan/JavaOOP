import java.io.*;
import java.util.Scanner;

public class UserFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter the file name:");
        String name = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(name);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("please enter the text (press q to exit):");
            String text = scanner.nextLine();
            while (!(text = scanner.nextLine()).equals("q")){// q olana kadar devam ediyor dosyanın içine yazdırmaya
                bufferedWriter.write(text);// metni yazıyor
                bufferedWriter.newLine();// yeni satıra geçiriyor.
            }
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

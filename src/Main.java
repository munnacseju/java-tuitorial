import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public static String amount = null;

    public static void main(String[] args) throws IOException {
        File myFile = new File("/home/m/Documents/practice/practice/files/my-file.txt");
        if(myFile.createNewFile()){
            System.out.println("File created");
        }else {
            System.out.println("File already exists");
        }

        FileWriter myFileWriter = new FileWriter(myFile, true);
        myFileWriter.append(". Appending something more...");
        myFileWriter.close();
        Scanner fileReader = new Scanner(myFile);
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }

        if(myFile.delete()){
            System.out.println("File deleted");
        }else {
            System.out.println("File can't be deleted");
        }

    }
}

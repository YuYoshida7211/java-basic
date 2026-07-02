import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) {
       try{
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Java!\n");
            writer.write("This is a file example.\n");
            writer.close();
            System.out.println("ファイルに書き込みました。");

            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            System.out.println("ファイルの内容");

            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
            
        } catch(IOException e){
            System.out.println("エラーが発生しました: " + e.getMessage());
        }
    }
}

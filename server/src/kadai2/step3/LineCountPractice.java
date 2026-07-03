import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountPractice{
    public static void main(String[] args){
        String filePath ="example.txt";
        int lineCount=0;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            while(br.readLine() !=null){
                lineCount++;
            }
            System.out.println("ファイルの行数:" + lineCount + "冊");
        }catch(IOException e){
            e.printStackTrace();
        }
     }
}
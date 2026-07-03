import java.io.File;

public class FileCheckPractice{
    public static void main(String[] args){
        String filePath = "test.txt";
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("ファイルは存在します。");
        } else {
            System.out.println("ファイルは存在しません。");
        }
    }
}
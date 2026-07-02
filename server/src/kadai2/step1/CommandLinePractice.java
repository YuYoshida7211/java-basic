import java.util.Scanner;

public class CommandLinePractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();
        System.out.println("こんにちは、" + name + "さん！");
        scanner.close();
    }
}

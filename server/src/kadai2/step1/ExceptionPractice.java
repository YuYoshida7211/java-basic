import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class ExceptionPractice {

    //メソッド作成
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("年齢は18歳未満はアクセスできません！");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("年齢を入力してください: ");
        int age = scanner.nextInt();
        try{
            checkAge(age);
            System.out.println("アクセスOK！");
        } catch(InvalidAgeException e){
            System.out.println("エラー: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
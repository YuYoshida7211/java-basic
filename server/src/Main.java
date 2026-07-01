import person.Person;
import car.Car;

public class Main {
  public static void main(String[] args) {
      System.out.println("Hello World!");
//変数
    System.out.println("-----変数の宣言-----");

String str = "hoge";
System.out.println(str);

int num = 69;
System.out.println(num);

boolean bool = false;
System.out.println(bool);

double d;

String strNull = null;
System.out.println(strNull);

String[] strArray = {"田中", "佐藤", "久保田","鈴木","河本"};
for (String names : strArray) { System.out.println(names); }

Person person = new Person();
person.id = 1;
person.name = "田中";
person.age = 30;
System.out.println("ID: " + person.id);
System.out.println("Name: " + person.name);
System.out.println("Age: " + person.age);

//メソッドを作ってみよう
System.out.println("-----メソッドの呼び出し-----");
   // 2.1
    greet();

    // 2.2
    greetWithName("太郎");

    // 2.3
    int result = add(10, 20);
    System.out.println("合計: " + result);

    // 2.4
    String combined = joinStrings("Hello", "Java");
    System.out.println(combined);

    // 2.5
    checkAge(18);

    //配列
    System.out.println("-----配列の操作-----");
    //3.1
    int[] arr = {10,20,30,40,50};
    System.out.println("配列の要素表示");
    for (int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    
    // 3.2
    int[] arr2 = {1,2,3,4,5};
    int sum = 0;
    for (int i=0;i<arr2.length;i++){
      sum += arr2[i];
    }
    System.out.println("配列の要素の合計: " + sum);

    //3.3
    int[] arr3 = {3,5,7,2,8};
    int max = arr3[0];
    for (int i=0;i<arr3.length;i++){
      if(arr3[i]>max){
        max = arr3[i];
      }
    }
    System.out.println("配列の要素の最大値: " + max);

    //3.4
    int[][] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<arr4.length;i++){
    for (int j=0; j<arr4[i].length;j++){
      System.out.print(arr4[i][j] + " ");
    }
    System.out.println(); // 改行
  }

  //クラスとオブジェクト
  System.out.println("-----クラスとオブジェクト-----");
  //4.1
  //objectの生成
  Car car = new Car("トヨタ", 120);

  car.drive();

  System.out.println("車のブランド: " + car.brand);
  System.out.println("車の速度: " + car.speed);

  //ループと条件分岐
  System.out.println("-----ループと条件分岐-----");
  //5.1
  System.out.println("1から20までの偶数を表示");
  for (int i=1;i<=20;i++){
    if (i%2==0){
      System.out.println(i);
    }
  }
  //5.2
  System.out.println("FizzBuzzプログラム");
  for (int i=1;i<=30;i++){
    if(i%3==0){
      System.out.println("Fizz");
    } else if(i%5==0){
      System.out.println("Buzz");
    } else if(i%3==0 && i%5==0){
      System.out.println("FizzBuzz");
      } else {
      System.out.println(i);
    }
  }
  //5.3
  System.out.println("数値を逆順に並べて表示");
  int[] arr5 ={5,10,15,20};
  for (int i=arr5.length-1;i>=0;i--){
    System.out.println(arr5[i]);
  }
  //6
  System.out.println("-----例外処理-----");
  int[] arr6 ={1,2,3};
  try{
    System.out.println(arr6[3]);
  } catch (ArrayIndexOutOfBoundsException e){
    System.out.println("範囲外のアクセスです");
  }finally {
    System.out.println("例外の発生に関わらず、このブロックは実行されます。");
  }
    System.out.println("プログラムの実行を続けます。");

}

// 2.1
public static void greet() {
}

// 2.2
public static void greetWithName(String name) {
    System.out.println("こんにちは、" + name + "さん！");
}

// 2.3
public static int add(int a, int b) {
    return a + b;
}

// 2.4
public static String joinStrings(String str1, String str2) {
    return str1 + str2;
}

//2. 5
public static void checkAge(int age) {
    if (age >= 20) {
        System.out.println("成人です");
    } else {
        System.out.println("未成年です");
    }
  }
}




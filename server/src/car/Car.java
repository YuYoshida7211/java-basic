package car;

public class Car{
    public String brand;
    public int speed;

    // コンストラクタ
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // メソッド
    public void drive(){
        System.out.println("車が走り出しました");
    }
}
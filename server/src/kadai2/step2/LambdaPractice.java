import java.util.function.BiFunction;

public class LambdaPractice {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("乗算: " + multiply.apply(10, 5));
    }
}
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, String> words = new HashMap<>();

        words.put("Java", "プログラミング言語");
        words.put("Spring", "フレームワーク");
        words.put("JUnit", "テストツール");

        for (Map.Entry<String, String> entry : words.entrySet()) {
            System.out.println("キー: " + entry.getKey() + " / 値: " + entry.getValue());
        }

    }
}
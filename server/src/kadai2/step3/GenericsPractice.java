class Box<T>{
    private T value;
    public void set (T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}

public class GenericsPractice{
    public static void main(String[] args){
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("文字列:" + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("整数:" + intBox.get());
    }
}
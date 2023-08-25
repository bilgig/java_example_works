package generics;

public class BoundedClass01 <T extends Comparable<T>>{
    private T data;
    private T data2;

    public BoundedClass01(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

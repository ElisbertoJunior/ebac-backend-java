package fruta;

public class GenericEntry<T, E> {
    private T data;

    private E code;

    public GenericEntry(T data, E code) {
        this.data = data;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public E getCode() {
        return code;
    }
}

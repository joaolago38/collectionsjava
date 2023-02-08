package streams.java8;

public class Data {
    private int id;

    Data(int i) {
        this.setId(i);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Data[%d]", this.id);
    }
}

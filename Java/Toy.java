package Java;

public class Toy {
    private int toyId;
    private String toyName;

    public Toy(int toy_id, String toy_name) {
        this.toyId = toy_id;
        this.toyName = toy_name;
    }

    public int getToy_id() {
        return toyId;
    }

    public void setToy_id(int toy_id) {
        this.toyId = toy_id;
    }

    public String getToy_name() {
        return toyName;
    }

    public void setToy_name(String toy_name) {
        this.toyName = toy_name;
    }

    @Override
    public String toString() {
        return "Toy [toy_id = " + toyId + ", toy_name = " + toyName + "\n" + "]";
    }

}
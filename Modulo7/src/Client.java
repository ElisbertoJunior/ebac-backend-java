public class Client {
    private int code;
    private String name;
    private String address;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void registerAddress(String newAddress) {
        setAddress(newAddress);
    }

    public void printClient() {
        System.out.println("Nome: " + this.name);
        System.out.println("Codigo: " + this.code);
        System.out.println("Endereco: " + this.address);
    }
}

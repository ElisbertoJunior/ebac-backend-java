public class FirstClass {
    public static void main(String[] args) {
        Client client = new Client();
        client.registerAddress("Rua 32 A N 180");
        client.setCode(1);
        client.setName("Elisberto");

        client.printClient();

    }
}


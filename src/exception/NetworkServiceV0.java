package exception;

public class NetworkServiceV0 {

    public void sendMessages(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();

    }
}

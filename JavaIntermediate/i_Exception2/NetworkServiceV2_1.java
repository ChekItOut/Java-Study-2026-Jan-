package i_Exception2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) {
        String address = "https://api.networkservice.com/v2/";

        NetworkClientV2 client = new NetworkClientV2(address);
        try {
            client.initError(data);
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e){
            System.out.println("오류발생: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
        client.disconnect();


    }
}

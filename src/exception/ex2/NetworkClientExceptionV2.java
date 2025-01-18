package exception.ex2;

public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV2(String errcode, String message) {

        super(message);
        this.errorCode = errcode;
    }

    public String getErrorCode(){
        return errorCode;
    }

}

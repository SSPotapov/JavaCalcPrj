package calc;
public class CustomException extends Exception {
    String msg;
    CustomException(String str){
        msg = str;
    }

    public String toString() {
        return ("throws Exception //" + msg);
    }
}

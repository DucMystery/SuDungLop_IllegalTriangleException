public class IllegalTriangleException extends Exception {

    private String message;

    public IllegalTriangleException(String message){
        this.message =message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public IllegalTriangleException setMessage(String message) {
        this.message = message;
        return this;
    }
}

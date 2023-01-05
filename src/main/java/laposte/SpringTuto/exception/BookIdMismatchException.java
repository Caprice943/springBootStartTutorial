package laposte.SpringTuto.exception;

public class BookIdMismatchException  extends RuntimeException{
    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
    public BookIdMismatchException (){
        super ();
    }

    public BookIdMismatchException(String message) {
        super(message);
    }

}


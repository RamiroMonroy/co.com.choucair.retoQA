package co.com.choucair.retoQA.exceptions;

public class ThreadStoppedException extends RuntimeException {

    public ThreadStoppedException(String message, Throwable cause){
        super(message,cause);
    }
}

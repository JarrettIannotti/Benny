package edu.iannotjf.Assign07;

public class TreasureMapException extends Exception {
    public TreasureMapException(String message){
        super(message);
    }
    public TreasureMapException(String message, Exception e){
        super(message, e);
    }
}

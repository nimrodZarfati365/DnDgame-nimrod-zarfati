package exeptions;

public class RoomCretionExeption extends RuntimeException{
    public RoomCretionExeption(String errorMessage , Throwable err){
        super(errorMessage,err);
    }
}

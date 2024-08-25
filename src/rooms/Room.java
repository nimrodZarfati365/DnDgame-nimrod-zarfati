package rooms;

import java.util.Map;

public abstract class Room {

    protected Map<String, Room> adjacentRooms;
    protected Room previousRoom;
    protected String currentDirection;
    protected boolean isTriggered = false ;

    public Room(Map<String , Room> adjacentRooms , Room previousRoom , String currentDirection){
        this.adjacentRooms = adjacentRooms;
        this.previousRoom = previousRoom;
        this.currentDirection = currentDirection;
    }

    public abstract void affectPlayer();

}

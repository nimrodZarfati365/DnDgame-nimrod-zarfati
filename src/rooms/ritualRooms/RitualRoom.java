package rooms.ritualRooms;

import rooms.Room;

import java.util.Map;

public abstract class RitualRoom extends Room {
    public RitualRoom(Map<String, Room> adjacentRooms, Room previousRoom, String currentDirection) {
        super(adjacentRooms, previousRoom, currentDirection);
    }
}

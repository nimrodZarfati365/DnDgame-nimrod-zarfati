package rooms.ritualRooms;

import rooms.Room;

import java.util.Map;

public class AntidoteRitualRoom extends  RitualRoom{
    public AntidoteRitualRoom(Map<String, Room> adjacentRooms, Room previousRoom, String currentDirection) {
        super(adjacentRooms, previousRoom, currentDirection);
    }

    @Override
    public void affectPlayer() {
      System.out.println("you've been released from the curse");
    }
}

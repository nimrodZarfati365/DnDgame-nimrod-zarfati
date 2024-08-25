package rooms;

import java.util.Map;
import java.util.Random;

public class TreasureRoom extends Room {

    public TreasureRoom(Map<String, Room> adjacentRooms, Room previousRoom, String currentDirection) {
        super(adjacentRooms, previousRoom, currentDirection);
    }

    protected int randomizeGold(){
        Random random = new Random();
        return random.nextInt(50) + 1;
    }

    @Override
    public void affectPlayer() {
        isTriggered = true ;
        System.out.println(String.format("the player got %n gold !! ",randomizeGold()));

    }


}


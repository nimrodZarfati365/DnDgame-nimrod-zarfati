package rooms;

import java.util.Map;
import java.util.Random;

public class TrappedRoom extends  Room {
    public TrappedRoom(Map<String, Room> adjacentRooms, Room previousRoom, String currentDirection) {
        super(adjacentRooms, previousRoom, currentDirection);
    }

    protected boolean chancesToGetTrapped(){
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void affectPlayer() {
        isTriggered = true ;
       if (chancesToGetTrapped()){
           System.out.println("you got trapped!!");
       }
       else{
           System.out.println("you entered a trapped room but you've been able to doge the trap");
       }
    }
}

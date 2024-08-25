package factories;
import java.util.Objects;
import java.util.Random;

import exeptions.RoomCretionExeption;
import rooms.Room;
import rooms.ritualRooms.RitualRoom;

public class RoomFactory {
    protected String roomPath = "rooms.ritualRooms";
    protected static String[] RoomNames = {"TrappedRoom" , "TreasureRoom" , "RitualRoom"} ;

    public static String getRandomRoomName(){
        Random random = new Random();
        int randomIndex = random.nextInt(RoomNames.length); // Generates a random index within the array bounds
        return RoomNames[randomIndex];
    }

    public static Room createRoom()  {
        try{
            String roomType = getRandomRoomName();
            if(Objects.equals(roomType, "RitualRoom")){

            }
            else{
                return (Room) Class.forName(roomType).newInstance();
            }


        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            throw new RoomCretionExeption("there was an error while creating a ritual room" , e);
        }

    }


}

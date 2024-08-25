package game;

import factories.RoomFactory;
import rooms.Room;

public class Game {
    protected boolean isOver = false ;
    protected Room startingRoom = RoomFactory.createRoom();
    public void startGame(){
        while (!isOver){
            System.out.println("choose direction witch to go");
        }
    }
}

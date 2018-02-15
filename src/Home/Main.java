package Home;

import Home.Rooms.Kitchen;
import Home.Rooms.LivingRoom;
import Home.Rooms.Room;

public class Main {
    public static void main(String[] args) {

    }

    public static void setHome(){
        Kitchen kitchen = new Kitchen();
        Room room1 = new Room(kitchen.GetKitchenLight());
        Room room2 = new Room(kitchen.GetKitchenLight());
        Room room3 = new Room(kitchen.GetKitchenLight());
        Room room4 = new Room(kitchen.GetKitchenLight());
        LivingRoom livingRoom = new LivingRoom(kitchen.GetKitchenLight());
    }
}

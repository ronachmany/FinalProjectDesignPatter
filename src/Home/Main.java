package Home;

import Home.Rooms.Kitchen;
import Home.Rooms.LivingRoom;
import Home.Rooms.Room;

import java.io.Console;

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

        System.out.println("ברוך הבא לבית החכם של אלמוג");
    }
}

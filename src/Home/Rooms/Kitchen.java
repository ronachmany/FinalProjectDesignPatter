package Home.Rooms;

import Home.items.Door;
import Home.items.Light.KitchenLight;
import Home.items.TV.TV;

public class Kitchen{
    private final Door door;
    private final TV tv;
    private KitchenLight kitchenLight;
    public Kitchen() {
        this.kitchenLight = new KitchenLight();
        this.door = new Door();
        this.tv = new TV();
    }

    public KitchenLight GetKitchenLight() {
        return kitchenLight;
    }
}

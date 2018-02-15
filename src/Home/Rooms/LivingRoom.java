package Home.Rooms;

import Home.items.Light.KitchenLight;
import Home.items.WaterHeater;

/**
 * Created by hackeru on 15/02/2018.
 */
public class LivingRoom extends Room {
    WaterHeater waterHeater;
    public LivingRoom(KitchenLight kitchenLight) {
        super(kitchenLight);
        this.waterHeater = WaterHeater.newInstance();
    }
}

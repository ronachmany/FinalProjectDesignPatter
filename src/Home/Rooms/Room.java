package Home.Rooms;

import Home.items.Door;
import Home.items.Light.KitchenLight;
import Home.items.Light.Light;
import Home.items.Light.RegularLight;
import Home.items.TV.TV;

public class Room {
    private Light light;
    protected Door door;
    protected TV tv;
    public Room(KitchenLight kitchenLight){
        this.light = new RegularLight(kitchenLight);
        this.door = new Door();
        this.tv = new TV();
    }

    public void LightOn(){
        this.light.On();
    }
    public void LightOff(){
        if(!door.GetIsOpen()){
            this.light.Off();
        }
    }
    public boolean GetLightIsOn(){
        return this.light.GetLightIsOn();
    }

    public void CloseDoor(){
        this.door.Close();
    }
    public void OpenDoor(){
        this.door.Open();
    }
    public boolean GetDoorIsOpen(){
        return this.door.GetIsOpen();
    }

    public void TvOn(){
        this.tv.On();
    }
    public void TvOff(){
        this.tv.Off();
    }
    public boolean GetTvIsOn(){
        return this.tv.getIsOn();
    }

}

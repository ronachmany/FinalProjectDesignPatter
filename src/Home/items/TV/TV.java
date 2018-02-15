package Home.items.TV;

/**
 * Created by hackeru on 15/02/2018.
 */
public class TV {

    private Boolean isOn;

    public TV() {
        this.isOn = false;
    }

    public void On() {
        this.isOn = true;
    }

    public void Off() {
        this.isOn = false;
    }

    public Boolean getIsOn() {
        return isOn;
    }
}

/**
 * Created by hackeru on 15/02/2018.
 */
public class TV implements Switch {

    private Boolean isOn;

    public TV() {
        this.isOn = false;
    }

    @Override
    public void On() {
        this.isOn = true;
    }

    @Override
    public void Off() {
        this.isOn = false;
    }

    public Boolean getOn() {
        return isOn;
    }
}

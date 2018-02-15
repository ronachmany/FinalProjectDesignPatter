import java.util.ArrayList;

/**
 * Created by hackeru on 15/02/2018.
 */
public class TV implements Switch {

    private Boolean isOn;
    private ArrayList<Playable> VODCatalog;

    public TV() {
        this.VODCatalog = new ArrayList<>();
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

    public void AddToVodCatalog(Playable item){
        this.VODCatalog.add(item);
    }
}

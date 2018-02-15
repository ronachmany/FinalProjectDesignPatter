import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by hackeru on 15/02/2018.
 */
public class WaterHeater implements Switch {
    private static WaterHeater waterHeater;

    private boolean isOn;
    private int startTime;
    private int endTime;

    private WaterHeater() {
        this.isOn = false;
        startTime = 1800;
        endTime = 0000;
    }

    public static WaterHeater NewInstance(){
        if (waterHeater == null){
            waterHeater = new WaterHeater();
        }

        return waterHeater;
    }

    @Override
    public void On() {
        int currTime = Integer.parseInt(new SimpleDateFormat("HHmm").format(Calendar.getInstance().getTime()));
        if (currTime >= startTime){
            isOn = true;
        }
    }

    @Override
    public void Off() {
        this.isOn = false;
    }
}

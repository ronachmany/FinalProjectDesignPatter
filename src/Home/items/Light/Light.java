package Home.items.Light;

import Home.Patterns.Observer;

public abstract class Light implements Observer {
    protected boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void On() {
        this.isOn = true;
    }

    public void Off() {
        this.isOn = false;
    }

    @Override
    public void update(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean GetLightIsOn() {
        return this.isOn;
    }
}

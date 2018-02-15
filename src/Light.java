public class Light implements Switch{
    private boolean isOn = false;
    @Override
    public void On() {
        if (canOff()){
            this.isOn = true;
        }
    }

    @Override
    public void Off() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean canOff(){
        return true;
    }
}

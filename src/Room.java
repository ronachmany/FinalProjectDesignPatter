public class Room {
    private Light light;
    private Door door;
    private TV tv;
    public Room(){
        this.light = new Light();
        this.door = new Door();
        this.tv = new TV();
    }
}

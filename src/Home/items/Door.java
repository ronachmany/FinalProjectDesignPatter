package Home.items;

public class Door{
    boolean isOpen = false;

    public Door() {
        this.isOpen = false;
    }

    public void Open() {
        this.isOpen = true;
    }

    public void Close() {
        this.isOpen = false;
    }

    public boolean GetIsOpen() {
        return isOpen;
    }
}

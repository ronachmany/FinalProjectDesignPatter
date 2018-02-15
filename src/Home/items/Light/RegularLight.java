package Home.items.Light;

public class RegularLight extends Light {
    private KitchenLight kitchenLight;

    public RegularLight(KitchenLight kitchenLight) {
        super();
        this.kitchenLight = kitchenLight;
        this.kitchenLight.attach(this);
    }
}

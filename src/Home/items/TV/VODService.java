package Home.items.TV;

import java.util.ArrayList;

/**
 * Created by hackeru on 15/02/2018.
 */
public class VODService {
    private ArrayList<Playable> catalog;

    public VODService() {
        catalog = new ArrayList<>();
    }

    public void AddToCatalog(Playable item){
        this.catalog.add(item);
    }

    public Playable OrderMovie(){
        for (Playable item: this.catalog
             ) {
            if(item instanceof Movie){
                return item;
            }
        }

        return null;
    }

    public Playable OrderSeries(){
        for (Playable item: this.catalog
                ) {
            if(item instanceof Series){
                return item;
            }
        }

        return null;
    }
}

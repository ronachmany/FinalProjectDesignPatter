import java.util.ArrayList;
import java.util.LinkedList;

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

    public Playable OrderMovie(String name){
        for (Playable item: this.catalog
             ) {
            if(item instanceof Movie){
                return item;
            }
        }

        return null;
    }

    public Playable OrderSeries(String name){
        for (Playable item: this.catalog
                ) {
            if(item instanceof Series){
                return item;
            }
        }

        return null;
    }
}

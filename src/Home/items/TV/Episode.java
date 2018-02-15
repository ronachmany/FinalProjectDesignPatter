package Home.items.TV;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Episode implements Playable {
    private String name;
    private PlayState state;

    public Episode(String name) {
        this.name = name;
        this.state = PlayState.Stop;
    }

    @Override
    public void Play() {
        this.state = PlayState.Play;
    }

    @Override
    public void Pause() {
        this.state = PlayState.Pause;
    }

    @Override
    public void Stop() {
        this.state = PlayState.Stop;
    }
}

package Home.items.TV;

import Home.Switch;

/**
 * Created by hackeru on 15/02/2018.
 */
public class TV implements Switch {

    private Boolean isOn;

    public TV() {
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

    public Boolean getIsOn() {
        return isOn;
    }

    /**
     * Created by hackeru on 15/02/2018.
     */
    public static class Episode implements Playable {
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

    /**
     * Created by hackeru on 15/02/2018.
     */
    public static class Movie implements Playable{
        private String name;
        private PlayState state;

        public Movie(String name) {
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

    /**
     * Created by hackeru on 15/02/2018.
     */
    public static interface Playable {
        void Play();
        void Pause();
        void Stop();
    }

    /**
     * Created by hackeru on 15/02/2018.
     */
    public static enum PlayState {
        Play,
        Pause,
        Stop
    }

    /**
     * Created by hackeru on 15/02/2018.
     */
    public static class Series implements Playable {
        private String name;
        private PlayState state;

        public Series(String name) {
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
}

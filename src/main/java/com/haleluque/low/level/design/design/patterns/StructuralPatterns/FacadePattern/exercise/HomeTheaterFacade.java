package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FacadePattern.exercise;

public class HomeTheaterFacade {

    private final DVDPlayer dvdPlayer;
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final LightingControl lightingControl;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        this.lightingControl = new LightingControl();
    }

    public void watchMovie(int dimmingPercentage, int volumeLevel) {
        System.out.println("Get ready to watch a movie");

        //Dim the lights
        lightingControl.dim(dimmingPercentage);

        //Turn on the projector
        projector.on();

        // Set the projector input to DVD
        projector.setInput();

        // Turn on the sound system.
        soundSystem.on();

        // Set the sound system volume
        soundSystem.setVolume(volumeLevel);

        //Play the DVD.
        dvdPlayer.play();

        System.out.println("Movie is ready to watch!");
    }
}

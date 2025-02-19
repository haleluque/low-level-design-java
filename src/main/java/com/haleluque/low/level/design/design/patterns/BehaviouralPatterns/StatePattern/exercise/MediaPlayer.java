package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.StatePattern.exercise;

//Context class
public class MediaPlayer {

    private State state;

    public MediaPlayer() {
        state = new PlayingState();
    }
    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.pressPlay();
    }

    public void stop() {
        state.pressStop();
    }

    public void pause() {
        state.pressPause();
    }

    public void displayState() {
        state.display();
    }
}
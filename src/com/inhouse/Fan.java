package com.inhouse;

/**
 * Class to represent fan *
 *
 */
public class Fan {
    // object for SpeedState indicating speed of the fan

    private Speed speedState;
    // object for DirectionState indicating direction of the fan
    private Direction directionState;

    /**
     * Constructor of the class instantiating speed and direction state objects
     *
     */
    public Fan() {
        speedState = new Speed();
        directionState = new Direction();
    }

    /**
     * This method calls the next state method on the interface which will check
     * for the max speed. If max speed is reached, the speed is set to 0
     *
     */
    public void increaseSpeed() {
        speedState.state();
    }

    /**
     * This method checks for the direction of the fan and reverses it
     *
     */
    public void reverseDirection() {
        directionState.state();
    }

    /**
     * This method returns the current speed of the fan.
     *
     * @return current speed
     */
    public int getCurrentSpeed() {
        return speedState.getCurrentSpeed();
    }

    public boolean isDirectionReverse() {
        return directionState.reverse();
    }
}
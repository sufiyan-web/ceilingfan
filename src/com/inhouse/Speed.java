package com.inhouse;

import com.inhouse.interfaces.CeilingFanState;

/**
 * Class to represent speed
 *
 *
 */
public class Speed implements CeilingFanState {
    // integer variable declaring the highest speed of the fan

    private static int MAX_SPEED = 3;
    // integer variable declaring the lowest speed of the fan
    private static int MIN_SPEED = 0;
    // integer variable declaring the current speed of the fan
    private int fanSpeed;

    /**
     * Default constructor setting the current speed to 0
     */
    public Speed() {
        setCurrentSpeed(MIN_SPEED);
    }

    /**
     * Getter method for the current speed of the fan
     *
     * @return currentSpeed
     */
    public int getCurrentSpeed() {
        System.out.println("The current speed value is " + fanSpeed);
        return fanSpeed;
    }

    /**
     * Setter method for the current speed of the fan
     *
     * @param currentSpeed
     */
    public void setCurrentSpeed(int currentSpeed) {
        this.fanSpeed = currentSpeed;
    }

    /**
     * Handle fan speed [increment/decrement/reset]
     */
    @Override
    public void state() {
        System.out.println("****Initiaz Fan Speed **** " + fanSpeed);
        if (fanSpeed < MAX_SPEED) {
            fanSpeed++;
            System.out.println("****Fan Speed [post increment**** " + fanSpeed);
        } else if (fanSpeed == MAX_SPEED) {
            System.out.println("****Maximum fan speed**** " + fanSpeed);
            fanSpeed = MIN_SPEED;
            System.out.println("****Reset when reached maximum to zero****");
        }
    }
}

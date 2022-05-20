package com.inhouse;

import com.inhouse.interfaces.CeilingFanState;

/**
 * Class to represent direction
 *
 *
 */
public class Direction implements CeilingFanState {
    // boolean variable to hold if the reverse direction chain is pulled.

    private boolean reverse = false;

    @Override
    public void state() {
        System.out.println("Shows the current direction of the FAN - " + reverse);
        reverse = !reverse;
        System.out.println("Shows the current direction of the FAN [POST Reverse] - " + reverse);
    }

    public boolean reverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }
}
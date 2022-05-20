package com.inhouse.main;

import com.inhouse.Fan;

public class StartFan {

    public static void main(String[] args) {
        Fan cf = new Fan();

        /**
         * First speed increment
         */
        cf.increaseSpeed();
        /**
         * Increment speed again
         */
        cf.increaseSpeed();
        // reverse = true
        cf.reverseDirection();
        // Current speed to be 2
        cf.getCurrentSpeed();
        // Direction should be reversed
        cf.isDirectionReverse();
        // Speed 2=>3
        cf.increaseSpeed();
        // SPeed 3 => 0
        cf.increaseSpeed();
        // Current spped 0 - Fan OFF
        cf.getCurrentSpeed();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bth2;

import java.util.Objects;

/**
 *
 * @author 103
 */
public class KinematicWandering {
    Character character;
    float maxSpeed;
    float maxRotation;

    public KinematicWandering(Character character, float maxSpeed, float maxRotation) {
        super();
        this.character = character;
        this.maxSpeed = maxSpeed;
        this.maxRotation = maxRotation;
    }

    public KinematicWandering() {
        super();
    }

    public Character getCharacter() {
        return character;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float getMaxRotation() {
        return maxRotation;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxRotation(float maxRotation) {
        this.maxRotation = maxRotation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KinematicWandering other = (KinematicWandering) obj;
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (Float.floatToIntBits(this.maxSpeed) != Float.floatToIntBits(other.maxSpeed)) {
            return false;
        }
        if (Float.floatToIntBits(this.maxRotation) != Float.floatToIntBits(other.maxRotation)) {
            return false;
        }
        return true;
    }
    public static int getBinomial(int n, double p) {
        double log_q = Math.log(1.0 - p);
        int x = 0;
        double sum = 0;
        for(;;) {
            sum += Math.log(Math.random()) / (n - x);
            if(sum < log_q) {
            return x;
            }
            x++;
        }
    }
    public static void main(String[] args) {
        
    }
}

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
public class KinematicFlee {
    Character character;
    Character target;
    float maxSpeed;
    public KinematicFlee(Vector2D velocity, int par) {
    }
    
    public Character getCharacter() {
        return character;
    }

    public Character getTarget() {
        return target;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public KinematicFlee(Character charater, Character target, float maxSpeed) {
        this.character = charater;
        this.target = target;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "KinematicFlee{" + "character=" + character + ", target=" + target + ", maxSpeed=" + maxSpeed + '}';
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
        final KinematicFlee other = (KinematicFlee) obj;
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (!Objects.equals(this.target, other.target)) {
            return false;
        }
        if (Float.floatToIntBits(this.maxSpeed) != Float.floatToIntBits(other.maxSpeed)) {
            return false;
        }
        return true;
    }
    public KinematicFlee ganerateKinematicFlee(){
        Vector2D velocity = new Vector2D();
        velocity = character.getPosition().subVector2D(target.getPosition());
        velocity.normalize();
        velocity.mulConstant(maxSpeed);
        return new KinematicFlee(velocity,0);
    }
}

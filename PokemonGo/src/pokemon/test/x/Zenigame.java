/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.test.x;

/**
 *
 * @author DELL
 */
public class Zenigame {
    
    private float stepLenght;
    private int step;
    private float stepSwim;
    private int swim;
    private float stepJump;
    private int jump;
    
    public Zenigame(float stepLenght,float stepSwim,float stepJump){
        this.stepLenght = stepLenght;
        this.stepSwim = stepSwim;
        this.stepJump = stepJump;
        }
   
    public void walk(){
        this.step += 1;
    }
    public void swim(){
        this.swim += 1;
    }
    public void jump(){
        this.jump += 1;
    } 
    
    public float getDistance(){
        return this.step * this.stepLenght;
    }
    public float getSwim(){
        return this.swim * this.stepSwim;
    }
    public float getJump(){
        return this.jump * this.stepJump;
    }
    public float sumDistance(float getDistance,float getJump,float getSwim){
        return getDistance + getJump + getSwim;
    }

}

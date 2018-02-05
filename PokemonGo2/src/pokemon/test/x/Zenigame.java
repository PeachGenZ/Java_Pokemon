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
public final class Zenigame {
    
    private String name;
    private float mass ;
    private float swim;
    private float step;
    private float sum=0;
    private float walk;
    
    public Zenigame (String name,float mass,float step){
        setName(name);
        setMass(mass);
        setStep(step);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setStep(float step) {
        this.step = step;
    }
    
    public float getMass() {
        return mass;
    }
    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getSwim() {
        return swim*step;
    }
    public void setSwim(float swim) {
        this.swim = swim;
    }
    
    
    
    public float getWalk() {
        return walk*step;
    }
    public void setWalk(float walk) {
        this.walk = walk;
    }
    
    public float sumDistance(){
        sum+=getSwim()/*+getWalk()*/;
        return sum;
    }
    
    
}

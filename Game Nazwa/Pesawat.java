import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat extends Actor
{   
    public int tahan=10;
    private int jeda=0;
    private int nyawa;
    
    /**
     * Act - do whatever the Pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void tombol()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
        if (tahan==0){
            if (Greenfoot.isKeyDown("Space"))
            {
                getWorld().addObject(new Rudal(),getX(),getY());
                Greenfoot.playSound("bullet.wav");
            }
            tahan=10;
        }    
    }
    
    public void act()
    {
        tahan--;
        tombol();
        if(jeda>0)jeda--;
        if(jeda==1)
        if(jeda==0)jeda=20;
    }
}
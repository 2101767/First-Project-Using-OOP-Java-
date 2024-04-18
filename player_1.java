/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */


public class player_1 {
    private String name;
    private String weapon;
    protected int health;
    
    player_1( String name , String weapon ,int health){
        this.name =name;
        this.weapon = weapon;
        if(health <= 100 && health >= 0)
        this.health = health;
        else{this.health = 0;}
            
    } 

    
    public void hit_with_Traditional_weapon(){
        this.health -=30;
            if(this.health <= 0){
            System.out.println(this.getName()+" Killed ::::");
           }
            else System.out.println(this.getName()+",you are in Danger , your health ="+ this.getHealth());
        }
    
    public void hit_with_Modern_weapon(){
        this.health -=50;
            if(this.health <= 0){
            System.out.println(this.getName()+" Killed ::::");
           }
            else System.out.println(this.getName()+",you are in Danger , your health ="+ this.getHealth());
       
        }
        
 
    public String getName(){
            return this.name;
    }
    
    public void setName(String name){
       
          this.name = name;  
        
    }
    
  public String getWeapon(){
            return this.weapon;
    }
    
    public void setWeapon(String Weapon){
       
          this.weapon = weapon;  
        
    }
    
    public int getHealth(){
            return this.health;
    }
    
    public void setHealth(int health){
         if(health <= 100 && health >= 0)
         {
            this.health = health; 
         }  
         else this.health =0;
    }
    
    public void recovre(){
        
        if (this.health >0){
            
            this.health += 25;
            System.out.println(this.getName()+"Your health became = "+ this.health);
            
        }
        else{
            
        }
            
    }
    
    
    
}

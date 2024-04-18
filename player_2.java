/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class player_2 extends player_1 {
    private boolean protection;
   
    player_2( String name , String weapon , int health , boolean protection){
        super(name , weapon , health);
        this.protection = protection;
        
    }
    
    @Override
    public void hit_with_Traditional_weapon(){
        if( this.protection)
        {
            this.health -=20;
            if(this.health <= 0){
            System.out.println(this.getName()+" Killed ::::");
           }
            else System.out.println(this.getName()+",you are in Danger , your health ="+ this.getHealth());
            
        }
            else{
            this.health -=30;
            if(this.health <= 0){
            System.out.println(this.getName()+" Killed ::::");
           }
            else System.out.println(this.getName()+",you are in Danger , your health ="+ this.getHealth());
            
               
            }
                
          
    }
    
    
    @Override
    public void hit_with_Modern_weapon(){
        if( this.protection)
        {
            this.health -=40;
            if(this.health <= 0){
            System.out.println(this.getName()+" Killed ::::");
           }
            else System.out.println(this.getName()+",you are in Danger , your health ="+ this.getHealth());
            
        }
            else{
            this.health -=50;
            if(this.health <= 0){
            System.out.println(this.getName()+" Killed ::::");
               }
            else System.out.println(this.getName()+",you are in Danger , your health ="+ this.getHealth());
            
               
            }
}
}

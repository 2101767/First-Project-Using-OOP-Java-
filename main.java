/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String [] args){
        
        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.println("==================The Game Started==================");
        System.out.println("====================================================");
        System.out.println("====================================================");
        
        player_1 ID_1 = new player_1("John" , "RPG", 100);
        player_2 ID_2 = new player_2("Mohamed" , "M16A4", 80 , true);
        player_1 ID_3 = new player_1("Bassam" , "AK-47", 50);
        player_2 ID_4 = new player_2("Marwan" , "", 80 , false);
        player_2 ID_5 = new player_2("Nader" , "Botten", 98 , true);
        player_1 ID_6 = new player_1("David" , "a piece of wood", 500);
        
        ID_1.hit_with_Traditional_weapon();
        ID_1.hit_with_Modern_weapon();
        ID_1.recovre();
        ID_1.hit_with_Traditional_weapon();
        
        ID_2.hit_with_Traditional_weapon();
        ID_3.hit_with_Modern_weapon();
        ID_2.recovre();
        ID_1.hit_with_Traditional_weapon();
        
        
        ID_4.hit_with_Traditional_weapon();
        ID_6.hit_with_Modern_weapon();
        ID_5.hit_with_Modern_weapon();
        ID_4.recovre();
         
        
        
    }
    
}

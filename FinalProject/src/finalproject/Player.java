/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author 19hilyo
 */
public class Player {
    int health = 10;
    int healthMax = 10;
    int mana = 10;
    int manaMax = 10;
    int xp = 0;
    int xpMax = 1;
    int blockChance = 15;
    int dodgeChance = 10;
    int level = 1;
    int attack = 1;
    int block = 4;
    boolean dodge = false;
    int souls = 0;
    
    Player(){
        
    }
    public void levelUp(){
        if (this.xp == this.xpMax){
            this.xp = 0;
            this.xpMax += 1;
            this.level += 1;
            this.attack += 1;
            this.manaMax += 10;
            this.mana = this.manaMax;
            this.healthMax += 1;
            this.health = this.healthMax;
            this.blockChance += 1;
            this.dodgeChance += 1;
                   
        }
    }
    
    
}

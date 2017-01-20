/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import javax.swing.JTextArea;
/**
 *
 * @author 19hilyo
 */
public class  Enemy {
    int maxHealth;
    int health;
    int attack;
    int dodge;
    int block;
    
    Enemy(Player p1){
        this.maxHealth = (int) (p1.health * (.125 + (.2 * p1.level)));
        this.health = this.maxHealth;
        this.attack = (int) (p1.attack * .5); 
        if (this.attack <= 0){
            this.attack = 1;
        }
        if(this.maxHealth < 5){
            this.maxHealth = 5;
        }
    }
    public void Turn(Player p1, JTextArea jTextArea1){
        if (this.health <= 0){
            p1.xp += 1;
            p1.souls += 1;
        }
        else if(p1.block == 2){
            jTextArea1.setText("You sucessfully blocked");
        }
        else if(p1.block == 1){
            jTextArea1.setText("A glacning blow.");
            p1.health -= (int)(this.attack / 2);
        }
        else if(p1.block == 0){
            jTextArea1.setText("Your block failed completly.");
            p1.health -= this.attack;
        }
        else if(p1.dodge){
            jTextArea1.setText("You dodged.");
        }
        else if(!p1.dodge){
            jTextArea1.setText("You were hit and took " + this.attack + " damage.");
            p1.health -= this.attack;
        }
        else{
            p1.health -= this.attack;
        }
        
    }
}

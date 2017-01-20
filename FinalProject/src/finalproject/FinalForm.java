/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Image;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 *
 * @author 19hilyo
 */
public class FinalForm extends javax.swing.JFrame {
    Player p1 = new Player();
    Enemy enemy = new Enemy(p1);
    Random rand = new Random();

    int randNum;
    int fireBallDamage;
    int healed;
    int enemyAction;
    boolean turnActionTaken;
    String[] textBox = new String[15];
    String textBoxString;
    Image img;
    Icon icon;
    /**
     * Creates new form FinalForm
     */
    
    public FinalForm() {
        initComponents();
        
        jLabel7.setText(p1.health + "/" + p1.healthMax);
        jLabel5.setText(p1.mana + "/" + p1.manaMax);
        jLabel6.setText(p1.xp + "/" + p1.xpMax);
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        turnActionTaken = false;
        // tutorial
        textBoxString = "You are in a world destroyed, it was destroyed many years ago the gods fought, as they used the entire world as their battlefield.\n Their magics destroyed reality, causing the sky to change colors without warning.\n They threw mountains in the middle of plains, caused the weather to change without warning or reason.\n Now it snows in deserts, and jungles alternate between unbearably dry and flooded\n To fight their battles they unleashed monsters upon the world, the few remaining strongholds of humanity have decided to send men out to kill the monsters that ravage their crops and attack them nightly.\n You are one of those men, this is your chance to pay of your debts and live in luxury.\n The most important debt to pay off is your largest, in order to take on these monsters you took classes from the magi and bought from them a powerful artifact.\n It allows you to absorb the souls of the monsters to gain strength, however after you bought this artifact the mage who sold it to you revealed the catch...\n Monsters absorb the souls of their brethren to grow stronger, so the more monsters you kill, the stronger the monsters who come after you will be.\nHowever, the mage guild will buy the artifact from you, and they will pay more for each soul absorbed.\nYou wait until the monsters have been defeated in an assault on the city, then sneak past their lines, out into the shattered world\n\n\n\n\n\nPlease read me in navi's voice. This is the tutorial, ignore me if you want. \nClick attack (sword) to attack with your sword!\nClick attack (magic) to attack with magic!\nClick block to block the enemy, you can take damage though, even on a sucess.\nClick dodge to attempt to avoid all damage.\nClick Heal to heal yourself! \nClick fireball to unleash a powerful attack, but be warned that you can harm yourself.\nClick end turn to end your turn after the enemy moves!\nYou will levelup occasionally, this is a good thing. \nalso, keep this to yourself, but you are special, so your mana doesn't depete, your welcome."; 
        print("", jTextArea1);
        backroundUpdate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Attack (Magic)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dodge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Block");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Heal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Fireball (AOE)");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Attack (Sword)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Health");

        jLabel2.setText("Mana");

        jLabel3.setText("Exp");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton7.setText("End Turn");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextPane1.setText("Hope you enjoy our game - Owen and Stephen");
        jTextPane1.setToolTipText("");
        jScrollPane2.setViewportView(jTextPane1);

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //basic attack
        if (turnActionTaken == false){
        enemy.health -= p1.attack;
        jTextArea1.setText("You have delt " + p1.attack + " damage.");
        }
        turnActionTaken = true;
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //magic attack
        if (turnActionTaken == false){
        randNum = rand.nextInt(3);
        if (randNum == 0){
            jTextArea1.setText("You missed!");
        }
        else{
            enemy.health -= p1.attack * 2;
            jTextArea1.setText("You have delt " + p1.attack * 2 + " damage.");
        }
        }
        turnActionTaken = true;
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //blocking
        if (turnActionTaken == false){
        randNum = rand.nextInt(100) + 1;
        if (randNum >= 100){ //hit
            jTextArea1.setText("You have attempted to block.");
            p1.block = 2;
        }
        else if (90 <= randNum && randNum <= 100){
            jTextArea1.setText("You have attempted to block.");
            p1.block = 1;
        }
        else{ //miss
            jTextArea1.setText("You have attempted to block.");
            p1.block = 0;
        }
        }
        turnActionTaken = true;
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //dodge
        if (turnActionTaken == false){
        randNum = rand.nextInt(100) + 1;
        if (randNum >= 90){ //hit
            jTextArea1.setText("You have attempted to dodge.");
            p1.dodge = true;
        }
        else{ //miss
            jTextArea1.setText("You have attempted to dodge.");
            p1.dodge = false;
        }
        }
        turnActionTaken = true;
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //healing spell
        if (turnActionTaken == false){
        healed = (int)(p1.health * .125 + p1.attack * 2);
        jTextArea1.setText("You have healed for " +  healed);
        p1.health += healed;
        }
        turnActionTaken = true;
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //fireball
        if (turnActionTaken == false){
        randNum = rand.nextInt(100) + 1;
        if (randNum >= 100){ //crit
            fireBallDamage = p1.attack * 4 + 5;
            jTextArea1.setText("You have cast perfectly, dealing " + fireBallDamage + " damage.");
            enemy.health -= fireBallDamage;
            
        }
        else if (90 <= randNum && randNum <= 100)//good hit
        {
            fireBallDamage = p1.attack * 3 + 5;
            jTextArea1.setText("You cast fireball well, dealing " + fireBallDamage + " damage.");
            enemy.health -= fireBallDamage;
        }
        else if (75 <= randNum && randNum <= 90){ //self damage
            fireBallDamage = p1.attack * 3 + 5;
            jTextArea1.setText("You cast fireball, but you got caught in the explosion, so you take " + fireBallDamage * .25 + " damage. You deal " + fireBallDamage + " to your enemy.");
            enemy.health -= fireBallDamage;
            p1.health -= fireBallDamage * .25;
        }
        turnActionTaken = true;
        }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //end turn
        //enemyAction stuff 
        
        turnActionTaken = false;
        enemy.Turn(p1, jTextArea1);
        print("p1.health = " + p1.health + "| p1.xp = " + p1.xp + " | enemy.health = " + enemy.health, jTextArea1);
        if (enemy.health <= 0){
            //if the enemy is dead
            enemy = null;
            enemy = new Enemy(p1);
            jTextArea1.setText("You killed the enemy, + 1 xp, time to move on.");
            print("Enemy Down", jTextArea1);
            print("enemy.health = " + enemy.health, jTextArea1);
            backroundUpdate();
                       
        }
        
        if(p1.health <= 0){
            // Game Over
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            System.out.println("                                                                                                                                                                         \n" +
"                                                                                                                                                                         \n" +
"        GGGGGGGGGGGGG                                                                        OOOOOOOOO                                                                   \n" +
"     GGG::::::::::::G                                                                      OO:::::::::OO                                                                 \n" +
"   GG:::::::::::::::G                                                                    OO:::::::::::::OO                                                               \n" +
"  G:::::GGGGGGGG::::G                                                                   O:::::::OOO:::::::O                                                              \n" +
" G:::::G       GGGGGG  aaaaaaaaaaaaa      mmmmmmm    mmmmmmm       eeeeeeeeeeee         O::::::O   O::::::Ovvvvvvv           vvvvvvv eeeeeeeeeeee    rrrrr   rrrrrrrrr   \n" +
"G:::::G                a::::::::::::a   mm:::::::m  m:::::::mm   ee::::::::::::ee       O:::::O     O:::::O v:::::v         v:::::vee::::::::::::ee  r::::rrr:::::::::r  \n" +
"G:::::G                aaaaaaaaa:::::a m::::::::::mm::::::::::m e::::::eeeee:::::ee     O:::::O     O:::::O  v:::::v       v:::::ve::::::eeeee:::::eer:::::::::::::::::r \n" +
"G:::::G    GGGGGGGGGG           a::::a m::::::::::::::::::::::me::::::e     e:::::e     O:::::O     O:::::O   v:::::v     v:::::ve::::::e     e:::::err::::::rrrrr::::::r\n" +
"G:::::G    G::::::::G    aaaaaaa:::::a m:::::mmm::::::mmm:::::me:::::::eeeee::::::e     O:::::O     O:::::O    v:::::v   v:::::v e:::::::eeeee::::::e r:::::r     r:::::r\n" +
"G:::::G    GGGGG::::G  aa::::::::::::a m::::m   m::::m   m::::me:::::::::::::::::e      O:::::O     O:::::O     v:::::v v:::::v  e:::::::::::::::::e  r:::::r     rrrrrrr\n" +
"G:::::G        G::::G a::::aaaa::::::a m::::m   m::::m   m::::me::::::eeeeeeeeeee       O:::::O     O:::::O      v:::::v:::::v   e::::::eeeeeeeeeee   r:::::r            \n" +
" G:::::G       G::::Ga::::a    a:::::a m::::m   m::::m   m::::me:::::::e                O::::::O   O::::::O       v:::::::::v    e:::::::e            r:::::r            \n" +
"  G:::::GGGGGGGG::::Ga::::a    a:::::a m::::m   m::::m   m::::me::::::::e               O:::::::OOO:::::::O        v:::::::v     e::::::::e           r:::::r            \n" +
"   GG:::::::::::::::Ga:::::aaaa::::::a m::::m   m::::m   m::::m e::::::::eeeeeeee        OO:::::::::::::OO          v:::::v       e::::::::eeeeeeee   r:::::r            \n" +
"     GGG::::::GGG:::G a::::::::::aa:::am::::m   m::::m   m::::m  ee:::::::::::::e          OO:::::::::OO             v:::v         ee:::::::::::::e   r:::::r            \n" +
"        GGGGGG   GGGG  aaaaaaaaaa  aaaammmmmm   mmmmmm   mmmmmm    eeeeeeeeeeeeee            OOOOOOOOO                vvv            eeeeeeeeeeeeee   rrrrrrr            \n" +
"                                                                                                                                                                         \n" +
"                                                                                                                                                                         \n" +
"                                                                                                                                                                         \n" +
"                                                                                                                                                                         \n" +
"                                                                                                                                                                         \n" +
"                                                                                                                                                                         \n" +
"                                                                                                                                                                         \n" +
" ");
            print("\n\n\nYou died, please play again sometime\n\n\n", jTextArea1);
            print("You collected " + p1.souls + " souls, your son recovered your body and the artifact.", jTextArea1);
            print("This means you have given your family " + p1.souls * rand.nextInt(10) + 1 + " coins for your life.\nBut was it worth it?", jTextArea1);
        }
        
        
        p1.levelUp();
        p1.block = 4;
        
        jLabel7.setText(p1.health + "/" + p1.healthMax);
        
        jLabel5.setText(p1.mana + "/" + p1.manaMax);
        
        jLabel6.setText(p1.xp + "/" + p1.xpMax);
    }                                        

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FinalForm().setVisible(true);
                //put stuff here (I think)
            }
        });
        
    }
    final void lore()
    {
    //lore dump
	       print("You are in a world destroyed, it was destroyed many years ago the gods fought, as they used the entire world as their battlefield.\n Their magics destroyed reality, causing the sky to change colors without warning.\n They threw mountains in the middle of plains, caused the weather to change without warning or reason.\n Now it snows in deserts, and jungles alternate between unbearably dry and flooded\n To fight their battles they unleashed monsters upon the world, the few remaining strongholds of humanity have decided to send men out to kill the monsters that ravage their crops and attack them nightly.\n You are one of those men, this is your chance to pay of your debts and live in luxury.\n The most important debt to pay off is your largest, in order to take on these monsters you took classes from the magi and bought from them a powerful artifact.\n It allows you to absorb the souls of the monsters to gain strength, however after you bought this artifact the mage who sold it to you revealed the catch...\n Monsters absorb the souls of their brethren to grow stronger, so the more monsters you kill, the stronger the monsters who come after you will be.\n	However, the mage guild will buy the artifact from you, and they will pay more for each soul absorbed.\n	You wait until the monsters have been defeated in an assault on the city, then sneak past their lines, out into the shattered world\n\n\n\n\n", jTextArea1);
    }
    public final void print(String a, JTextArea jTextArea1){
        for(int i = 0; i <= 13; ++i){
            textBox[i + 1] = textBox[i];
        }
        textBox[0] = a;
        for(int b = 14; b >= 0; --b){
            if (textBox[b] != null){
            textBoxString += textBox[b] + "\n";
            }
        }
        jTextArea1.setText(textBoxString);
    }
    
    public void backroundUpdate(){
        
        randNum = rand.nextInt(4);
        switch(randNum){
            case 0:{
                icon = new ImageIcon("src\\finalproject\\Backgrounds\\landscape_forest.png");
            }
            case 1:{
                icon = new ImageIcon("src\\finalproject\\Backgrounds\\landscape_grassyfield.png");
            }
            case 2:{
                icon = new ImageIcon("src\\finalproject\\Backgrounds\\landscape_snowy.png");
            }
            case 3:{
                icon = new ImageIcon("src\\finalproject\\Backgrounds\\landscape_swamp.png");
            }
        }
        
        jLabel4.setIcon(icon);
        
        
    }
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration                   
}
 

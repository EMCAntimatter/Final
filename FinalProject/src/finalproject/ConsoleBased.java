
package finalproject;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JTextArea;

public class ConsoleBased{
void lore(JTextArea jTextArea1)
{
    //lore dump
	System.out.println("You are in a world destroyed, it was destroyed many years ago the gods fought, as they used the entire world as their battlefield.\n");
	//Sleep(3000);
	System.out.println("Their magics destroyed reality, causing the sky to change colors without warning.\n");
	//Sleep(3000);
	System.out.println("They threw mountains in the middle of plains, caused the weather to change without warning or reason.\n");
	//Sleep(3000);
	System.out.println("Now it snows in deserts, and jungles alternate between unbearably dry and flooded\n");
	//Sleep(3000);
	System.out.println("To fight their battles they unleashed monsters upon the world, the few remaining strongholds of humanity have decided to send men out to kill the monsters that ravage their crops and attack them nightly.\n");
	//Sleep(3000);
	System.out.println("You are one of those men, this is your chance to pay of your debts and live in luxury.\n");
	//Sleep(3000);
	System.out.println("The most important debt to pay off is your largest, in order to take on these monsters you took classes from the magi and bought from them a powerful artifact.\n");
	//Sleep(3000);
	System.out.println("It allows you to absorb the souls of the monsters to gain strength, however after you bought this artifact the mage who sold it to you revealed the catch...\n");
	//Sleep(3000);
	System.out.println("Monsters absorb the souls of their brethren to grow stronger, so the more monsters you kill, the stronger the monsters who come after you will be.\n");
	//Sleep(3000);
	System.out.println("However, the mage guild will buy the artifact from you, and they will pay more for each soul absorbed.\n");
	//Sleep(3000);
	System.out.println("You wait until the monsters have been defeated in an assault on the city, then sneak past their lines, out into the shattered world\n\n\n\n\n");
	//Sleep(3000);
}

void travel(JTextArea jTextArea1)
{

    
	Random rand = new Random();
    //possible descriptions for the enviroment 
	String[] locations = { "forest", "swamp", "grassy plain", "mountainous area", "highland", "hellish area", "desert", "jungle", "wonderland", "graveyard" };
	String[] skys = { "red", "blue", "green", "yellow", "black", "white", "pink", "orange", "cyan", "purple" };
	String[] weathers = { "clear", "overcast", "hailing", "raining", "snowing", "literaly raining cats and dogs", "clear except for the tornado" };

   //get a desc for enviroment
	String location = locations[rand.nextInt(10)];
	String sky = skys[rand.nextInt(10)];
	String weather = weathers[rand.nextInt(7)];
    



	System.out.println("You are now in a " + location + " and the sky is " + sky + ". It is currently " + weather + ".\n\n");
	//Sleep(3000);

}




void main()
{
	boolean god = false;
	int souls = 0;
	//lore();
	//Player* p1 = new Player();
	String choiceString;
    
    Scanner scnr = new Scanner(System.in);
    Player p1 = new Player();
    Random rand = new Random();
    double crit;

	//start gameloop
	while (p1.health >= 0 || (god == true)) {
		if (p1.health == 0) { break; }
		//travel();
		System.out.println("You encounter a monster\n\n");



		//create enemy
		Enemy enemy = new Enemy(p1);
		enemy.health = (int) (p1.health * (.125 + (.2 * p1.level)));
		if (enemy.health < 1)
		{
			enemy.health = 1;
		}
		enemy.attack = (int) (enemy.health * .5);
		if (enemy.attack < 1)
		{
			enemy.attack = 1;
		}




		while (enemy.health > 0 && (p1.health > 0 || god == true)) {
			if (p1.health == 0) { break; }
			System.out.println("1. Attack");
			System.out.println("2. Heal");
			System.out.println("3. Heavy Strike");
			System.out.println("4. Vampiric Strike\n");
			choiceString = scnr.nextLine();
			//choiceString = 4;
			System.out.println("\n\n");
			if (null == choiceString) { System.out.println("You attempted to cast a spell that does not exist, your turn is forfit due to a disruption in time."); }
			else switch (choiceString) {
                case "1":
                    break;
                case "Cheat":
                    god = true;
                    break;
                case "DisCheat":
                    god = false;
                    break;
                case "2":
                    if (p1.attack + p1.level + (2 ^ p1.level) > enemy.attack + 1) {
                        p1.health += p1.attack + p1.level + (2 ^ p1.level);
                        if (p1.health >= p1.healthMax) { p1.health = p1.healthMax; }
                        System.out.println("You have healed " + p1.attack + p1.level + (2 ^ (p1.level)) + " health.");
                    }
                    else if (p1.attack + p1.level + (2 ^ p1.level) <= enemy.attack + 1) { p1.health += enemy.attack + 1; }
                    break;
                case "3":
                    double heavyStrike = rand.nextInt(4) + 1;
                    if (heavyStrike == 1)
                    {
                        enemy.health -= p1.attack * 20;
                        System.out.println("You have delt " + p1.attack * 20 + " damage.");
                    }
                    else
                    {
                        System.out.println("You have missed :(");
                    }   break;
                case "4":
                    //crit
                    double vampStrikeCrit = rand.nextInt(3) + 1;
                    //attack
                    if (vampStrikeCrit == 1)
                    {
                        enemy.health -= p1.attack * 10;
                        System.out.println("You delt " + p1.attack * 10 + " damage.");
                    }
                    
                    else
                    {
                        enemy.health -= p1.attack;
                        System.out.println("You delt " + p1.attack + " damage.");
                    }   //healing
                    if (vampStrikeCrit == 1)
                    {
                        p1.health += p1.attack * 10;
                        System.out.println("You healed " + p1.attack * 10 + " health.");
                    }
                    
                    else
                    {
                        p1.health += p1.attack;
                        System.out.println("You healed " + p1.attack * 10 + " health.");
                    }   break;
                default:
                    System.out.println("You attempted to cast a spell that does not exist, your turn is forfit due to a disruption in time.");
                    break;
            }
			//enemy
			int enemyCritChance = rand.nextInt(20) + 1;
			if (enemyCritChance != 1) {
				p1.health -= enemy.attack;
				System.out.println("You have taken " + enemy.attack + " damage.");
				System.out.println("You are on " + p1.health + "/" + p1.healthMax + " health.");
			}
			else if (enemyCritChance == 20)
			{
				crit = enemy.attack + ((p1.healthMax / 2) / (rand.nextInt(3)));
				p1.health -= crit;
				System.out.println("You have taken " + crit + " damage, it was a critical hit");
				System.out.println("You are on " + p1.health + "/" + p1.healthMax + " health.");
			}
		}
		if (p1.health > 0) {
			System.out.println("\n\n\nYou have defeated the monster!\n\n\n");
			System.out.println("Having defeated the monster that rigns over this area, you decide to move on.");
			souls += 1;


			p1.xp += 1;

			//levelup

			if (p1.xp >= 5) {
				p1.xp = 0;
				p1.level += 1;
				p1.healthMax += 1;
				p1.health = p1.healthMax;
				p1.attack += 1;
				System.out.println("You have leveled up!!!\n Your damage has increased!!!\n Your health has been restored and your max health increased!!!\n");
			}
		}
	}
	System.out.println("\n\n\nYou died, play again sometime\n\n\n");
	System.out.println("You collected " + souls + " souls, your son recovered your body and the artifact.");
	System.out.println("This means you have given your family " + souls * rand.nextInt(10) + 1 + " coins for your life. \n But was it worth it?");
}
}



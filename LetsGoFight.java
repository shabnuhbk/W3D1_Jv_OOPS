package week3.day1;

public class LetsGoFight {
public static void Main(String[] args)
{
	BattleRoyal br = new BattleRoyal();
	MultiPlayer mp = new MultiPlayer();
	Zombies zmb = new Zombies();
	System.out.println("From the Parent Class - CallOfDuty");
	br.classic();
	br.blackOut();
	System.out.println("From the child - BattleRoyal");
	br.alcatraz();
	System.out.println("From the Parent Class - CallOfduty");
	mp.blackOut();
	System.out.println("From the child - MultiPlayer");
	mp.hijacked();
	mp.terminal();
	System.out.println("From the Parent Class - CallOfDuty");
	zmb.classic();
	System.out.println("From the child - Zombies");
	zmb.otherGalaxy();
	
}
}

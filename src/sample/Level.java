package sample;
import java.io.Serializable;
import java.util.*;
public abstract class Level implements Serializable
{
	public static int token_collected = 0;
	protected boolean unlocked;
	protected static ArrayList<Plant> plantsUnlocked;
	protected static ArrayList<LawnMower> lmowers;
	protected static ArrayList<Zombie> zombiesAvailable;
	protected boolean lawnmower[];

//  protected void collect_token()
//  {
//
//    this.token_collected++;
//  }

	protected void place_plant()
	{
		System.out.println("plantPlaced");
	}
	// protected Map<String, Plant> plants_collected;


}
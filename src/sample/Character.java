package sample;


import javafx.scene.image.ImageView;

import java.io.Serializable;

public abstract class Character extends ImageView implements Serializable
{
	protected int health;
	protected int attackValue;
	protected int posX;
	protected int posY;

	protected void attack(Character character)
	{
		System.out.println("attacked");
	}

	protected void die()
	{
		System.out.println("Zombie died");
	}
}
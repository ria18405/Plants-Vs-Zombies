package sample;

import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public abstract class Zombie extends Character implements Cloneable
{
	protected double speed;
	protected int health;
	protected TranslateTransition transition;

	protected Zombie clone()
	{
		try {
			Zombie copy = (Zombie) super.clone();
			return copy;
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}

	protected void move()
	{
		TranslateTransition zombietransition=new TranslateTransition();
		this.transition=zombietransition;
		zombietransition.setDuration((Duration.seconds(25)));
		zombietransition.setNode(this);
//        zombietransition.setFromY(4);
		zombietransition.setFromX(0);

		zombietransition.setToX(-50);

		zombietransition.setCycleCount(1);
		zombietransition.play();
		System.out.println("Zombie moving");
	}
}
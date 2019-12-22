package sample;

import javafx.scene.layout.GridPane;

public abstract class Plant extends Defender
{
	protected int waiting_time;
	protected int purchasingValue;

	public void blast(GridPane my_grid_pane)
	{
		System.out.println("blast");
	}

	public  Plant (Movable p)
	{
		System.out.println();
	}

	public Plant()
	{
		System.out.println();
	}
	
}
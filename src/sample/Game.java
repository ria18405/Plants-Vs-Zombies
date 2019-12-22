package sample;
import javafx.scene.layout.Pane;

import java.io.Serializable;
import java.util.*;
public class Game implements Serializable
{
	protected ArrayList<Level> levels;


	public Game(String username)
	{
		System.out.println("New Game Started");
		this.levels = new ArrayList<Level>();
		Level l = new Level1();
		this.levels.add(l);
//		Level l = new Level2();
//		levels.add(l);
		// Level l = new Level3();
		// levels.add(l);
		// Level l = new Level4();
		// levels.add(l);
	}
	
}
package sample;

import javafx.scene.layout.Pane;

import java.io.Serializable;

public class User implements Serializable
{
	String name;
	double score;
	Game g;

	public User(String username)
	{
		this.name = username;
		if (username == null || username.equals("")) {
			this.name="ria";
		}
		System.out.println(this.name);
		this.g = new Game(username);
	}
}












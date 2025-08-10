package com.balitechy.spacewar.main.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Game;

public class PlayerImage extends Player {

	private BufferedImage image;
	
	public PlayerImage(double x, double y, Game game){
		super(x, y, game);
		
		// Get image for Player		
		image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
	}
	
	public void render(Graphics g){
		g.setColor(Color.white);
		g.drawImage(image, (int) x, (int) y, null);
	}
}

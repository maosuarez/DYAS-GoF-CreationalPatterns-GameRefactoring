package com.balitechy.spacewar.main.SpriteGameFactory;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.AbstractComponents.APlayer;
import com.balitechy.spacewar.main.Interfaces.IBullet;

public class Player extends APlayer {

	private BufferedImage image;
	
	public Player(double x, double y, Game game){
		super(x, y, game);
		
		// Get image for Player		
		image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
	}
	
	public void render(Graphics g){
		g.setColor(Color.white);
		g.drawImage(image, (int) x, (int) y, null);
	}

	public void shoot(){
		IBullet b = new Bullet(x+(WIDTH/2)-5, y-18, game);
		game.getBullets().addBullet(b);
	}
}

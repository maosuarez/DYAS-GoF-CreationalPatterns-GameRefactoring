package com.balitechy.spacewar.main.SpriteGameFactory;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.AbstractComponents.ABullet;

public class Bullet extends ABullet{
	
	private BufferedImage image;
	
	public Bullet(double x, double y, Game game){
		super(x, y);
		image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
	}

	@Override
	public void render(Graphics g){
		g.drawImage(image, (int) x, (int) y, null);
	}
}

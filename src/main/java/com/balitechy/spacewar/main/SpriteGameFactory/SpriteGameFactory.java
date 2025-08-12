package com.balitechy.spacewar.main.SpriteGameFactory;

import java.io.IOException;

import com.balitechy.spacewar.main.BulletController;
import com.balitechy.spacewar.main.InputHandler;
import com.balitechy.spacewar.main.Interfaces.IPlayer;
import com.balitechy.spacewar.main.Game;

public class SpriteGameFactory extends Game {

    public void init(){
		requestFocus();

        sprites = new SpritesImageLoader("sprites.png");
		try {			
			sprites.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Add keyboard listener
		addKeyListener(new InputHandler(this));
		
		// Initialize game components.
		
		
		// Set player position at the bottom center.
		player = new Player((WIDTH * SCALE - IPlayer.WIDTH) / 2, HEIGHT * SCALE - 50 , this);
		bullets = new BulletController();
		backgRenderer= new BackgroundRenderer();
	}

    public SpritesImageLoader getSprites(){
		return sprites;
	}
}

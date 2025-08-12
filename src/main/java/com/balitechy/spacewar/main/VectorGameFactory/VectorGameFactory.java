package com.balitechy.spacewar.main.VectorGameFactory;

import com.balitechy.spacewar.main.BulletController;
import com.balitechy.spacewar.main.InputHandler;
import com.balitechy.spacewar.main.Interfaces.IPlayer;
import com.balitechy.spacewar.main.Game;

public class VectorGameFactory extends Game {

    public void init(){
		requestFocus();

		// Add keyboard listener
		addKeyListener(new InputHandler(this));
		
		// Initialize game components.
		
		
		// Set player position at the bottom center.
		player = new PlayerDraw((WIDTH * SCALE - IPlayer.WIDTH) / 2, HEIGHT * SCALE - 50 , this);
		bullets = new BulletController();
		backgRenderer= new BackgroundDraw();
	}

}

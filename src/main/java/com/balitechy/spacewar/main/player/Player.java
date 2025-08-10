package com.balitechy.spacewar.main.player;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.bullet.IBullet;
import com.balitechy.spacewar.main.factories.BulletFactory;

public abstract class Player implements IPlayer{
    protected double x;
	protected double y;
	
	protected double velX;
	protected double velY;

	protected Game game;

    public Player(double x, double y, Game game){
		this.x = x;
		this.y = y;
		this.game = game;
    }

    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}

    public void shoot(){
		IBullet b = BulletFactory.createBullet(x+(WIDTH/2)-5, y-18, game);
		game.getBullets().addBullet(b);
	}


	public void tick(){
		x += velX;
		y += velY;
		
		// To avoid player go outside the arena.		
		if(x <= 0)
			x = 0;
		if(x >= (Game.WIDTH * Game.SCALE) - WIDTH)
			x = (Game.WIDTH * Game.SCALE) - WIDTH;
		if(y <= 0)
			y = 0;
		if(y >= (Game.HEIGHT * Game.SCALE) - HEIGHT)
			y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
	}

}

package com.balitechy.spacewar.main.player;

import java.awt.Graphics;

public interface IPlayer {

    public static final int WIDTH = 56;
	public static final int HEIGHT = 28;

    double getX();
    void setX(double x);

    double getY();
    void setY(double y);

    void setVelX(double velX);
    void setVelY(double velY);

    void shoot();
    void tick();
    void render(Graphics g);
}

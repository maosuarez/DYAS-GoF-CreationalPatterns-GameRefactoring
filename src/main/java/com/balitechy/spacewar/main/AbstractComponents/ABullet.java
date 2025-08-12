package com.balitechy.spacewar.main.AbstractComponents;

import java.awt.Color;

import com.balitechy.spacewar.main.Interfaces.IBullet;

public abstract class ABullet implements IBullet{
    protected double x;
    protected double y;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;
    protected Color bulletColor;

    public ABullet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void tick() {
        y -= 5; // Mueve la bala hacia arriba
    }


	@Override
	public double getY(){
		return y;
	}
    
}

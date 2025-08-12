package com.balitechy.spacewar.main.Interfaces;
import java.awt.Graphics;

public interface IBullet {

    public void tick();

    public void render(Graphics g);

    public double getY();

}

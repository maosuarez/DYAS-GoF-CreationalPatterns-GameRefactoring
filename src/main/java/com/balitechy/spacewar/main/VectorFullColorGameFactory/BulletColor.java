package com.balitechy.spacewar.main.VectorFullColorGameFactory;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.balitechy.spacewar.main.AbstractComponents.ABullet;

public class BulletColor extends ABullet {

    public BulletColor(double x, double y) {
        super(x, y);

        // Colores disponibles
        Color[] colors = { Color.RED, Color.BLUE, Color.GREEN };

        // Elegir uno al azar
        Random rand = new Random();
        bulletColor = colors[rand.nextInt(colors.length)];
    }

    @Override
    public void render(Graphics g) {
        Color oldColor = g.getColor();

        // Contorno negro
        g.setColor(Color.BLACK);
        g.drawOval((int) x, (int) y, WIDTH, HEIGHT);

        // Relleno con el color elegido
        g.setColor(bulletColor);
        g.fillOval((int) x + 1, (int) y + 1, WIDTH - 2, HEIGHT - 2);

        g.setColor(oldColor);
    }
}

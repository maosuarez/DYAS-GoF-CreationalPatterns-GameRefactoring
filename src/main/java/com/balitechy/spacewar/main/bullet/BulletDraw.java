package com.balitechy.spacewar.main.bullet;

import java.awt.Color;
import java.awt.Graphics;

public class BulletDraw extends Bullet {

    public BulletDraw(double x, double y) {
        super(x, y);
    }

    @Override
    public void render(Graphics g) {
        // Guardar color original
        Color oldColor = g.getColor();

        // Color negro para el contorno
        g.setColor(Color.BLACK);
        g.drawOval((int) x, (int) y, WIDTH, HEIGHT);

        // Color blanco para el relleno
        g.setColor(Color.WHITE);
        g.fillOval((int) x + 1, (int) y + 1, WIDTH - 2, HEIGHT - 2);

        // Restaurar color original
        g.setColor(oldColor);
    }
}

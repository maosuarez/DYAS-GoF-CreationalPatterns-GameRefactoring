package com.balitechy.spacewar.main.background;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

public class BackgroundDraw implements IBackground {

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        // Fondo blanco
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        // Círculo en la esquina superior izquierda
        g.setColor(Color.BLACK);
        g.drawOval(10, 10, 80, 80); // coordenadas y tamaño del círculo
    }
}


package com.balitechy.spacewar.main.player;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.Game;

public class PlayerDraw extends Player {
	
	public PlayerDraw(double x, double y, Game game){
		super(x, y, game);
	}
	
	@Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);

        // Coordenadas del triángulo
        int[] xPoints = {
            (int) x + WIDTH / 2,   // punto superior
            (int) x,               // esquina inferior izquierda
            (int) x + WIDTH        // esquina inferior derecha
        };
        int[] yPoints = {
            (int) y,               // punto superior
            (int) y + HEIGHT,      // parte inferior
            (int) y + HEIGHT       // parte inferior
        };

        // Dibujar triángulo relleno
        g.fillPolygon(xPoints, yPoints, 3);

        // Si quieres solo el contorno en lugar de relleno:
        // g.drawPolygon(xPoints, yPoints, 3);
    }

}


package com.balitechy.spacewar.main.VectorGameFactory;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.AbstractComponents.APlayer;
import com.balitechy.spacewar.main.Interfaces.IBullet;

public class PlayerDraw extends APlayer {
	
	public PlayerDraw(double x, double y, Game game){
		super(x, y, game);
	}

    public void shoot(){
		IBullet b = new BulletDraw(x+(WIDTH/2)-5, y-18);
		game.getBullets().addBullet(b);
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


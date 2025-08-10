package com.balitechy.spacewar.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class SpritesImageLoader {
	
	private String path;
	private BufferedImage image;
	
	public SpritesImageLoader(String path){
		this.path = path;
	}
	
	public BufferedImage loadImage() throws IOException{
		InputStream is = getClass().getClassLoader().getResourceAsStream(this.path);
		image = ImageIO.read(is);
		return image;
	}
	
	public BufferedImage getImage(int top, int left, int width, int height){
		BufferedImage img = image.getSubimage(top, left, width, height);
		return img;
	}
}

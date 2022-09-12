package DIPLab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CyanMagentaYellow {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\00.jpg");
		BufferedImage img1 = ImageIO.read(f1);
		//CYAN
		for(int i = 0; i <img1.getHeight(); i++) {
			for(int j = 0; j < img1.getWidth(); j++) {
				int p = img1.getRGB(j, i);
				int r = 0xff & p >> 24;
				int g = 0xff & p >> 16;
				int b = 0xff & p >> 8;
				int a = 0xff & p;
				if(g + 130 < 255)
					g += 130;
				if(b + 100 < 255)
					b += 100;
				p = a << 24 | r << 16 | g << 8 | b;
				img1.setRGB(j, i, p);
			}
		}
		File f2 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\cyan.jpg");
		ImageIO.write(img1, "jpg", f2);

		//MAGENTA
		BufferedImage img2 = ImageIO.read(f1);
		for(int i = 0; i <img2.getHeight(); i++) {
			for(int j = 0; j < img2.getWidth(); j++) {
				int p = img2.getRGB(j, i);
				int r = 0xff & p >> 24;
				int g = 0xff & p >> 16;
				int b = 0xff & p >> 8;
				int a = 0xff & p;
				if(r + 100 < 255)
					r += 100;
				if(b + 70 < 255)
					b += 70;
				p = a << 24 | r << 16 | g << 8 | b;
				img2.setRGB(j, i, p);
			}
		}
		File f3 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\magenta.jpg");
		ImageIO.write(img2, "jpg", f3);
		
		//YELLOW
		BufferedImage img3 = ImageIO.read(f1);
		for(int i = 0; i <img3.getHeight(); i++) {
			for(int j = 0; j < img3.getWidth(); j++) {
				int p = img3.getRGB(j, i);
				int r = 0xff & p >> 24;
				int g = 0xff & p >> 16;
				int b = 0xff & p >> 8;
				int a = 0xff & p;
				if(r + 110 < 255)
					r += 110;
				if(g + 120 < 255)
					g += 120;
				p = a << 24 | r << 16 | g << 8 | b;
				img3.setRGB(j, i, p);
			}
		}
		File f4 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\yellow.jpg");
		ImageIO.write(img3, "jpg", f4);
		System.out.println(":) Done!!");
	}

}

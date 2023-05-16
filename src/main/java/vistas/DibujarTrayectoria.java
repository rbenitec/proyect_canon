package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DibujarTrayectoria {
    
    
    
    public List<Point> obtenerPuntos(double theta, double velIncial){
        System.out.println("Se llamo al metodo obtenerPuntos: Giro: "+theta);
        List<Point> points = new ArrayList<>();
        double gravity = 9.81;
        double v0 = 80;
 
        double sinTheta = Math.sin(Math.toRadians(theta));
        double cosTheta = Math.cos(Math.toRadians(theta));
 
        double t = 2 * v0 * sinTheta / gravity;
 
        double deltaT = t / 1000;
 
        double cnt = 0;
 
        while (cnt < t) {
 
            double x = v0 * cosTheta * cnt;
            double y = v0 * sinTheta * cnt - .5 * gravity * cnt * cnt;
            points.add(new Point(16 + (int) x, 306 - (int) y));
 
            cnt += deltaT;
        }
 
        return points;
    }
    
    public static void dibujarTrayectoria(Graphics g2, List<Point> points){
        System.out.println("Se llamo al metodo dibujarCuadrado");
        g2.setColor(Color.BLUE);
        for(Point p : points) {
            g2.drawOval(p.getX(), p.getY(), 1, 1);
        }
    }
}

package testSimulation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import service.Calculos; 
import model.Proyectil;
/**
 *
 * @author andreas
 */
public class SimulaTiro extends JFrame {
 
    private int x1 = 0;
    private int y1 = 0;
    private double theta = 60;
 
    class Point {
 
        private int x;
        private int y;
 
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
 
        public int getX() {
            return x;
        }
 
        public void setX(int x) {
            this.x = x;
        }
 
        public int getY() {
            return y;
        }
 
        public void setY(int y) {
            this.y = y;
        }
 
    }
 
    private List<Point> points = new ArrayList<Point>();
 
    class SimulaTiroThread extends Thread {
        
        Calculos c=new Calculos();
        
        public void run() {
            
 
        double gravity = 9.81;
        double v0=80;
        
        double sinTheta = Math.sin(Math.toRadians(theta));
        double cosTheta = Math.cos(Math.toRadians(theta));
 
        double t = 2 * v0 * sinTheta / gravity;
 
        double deltaT = t / 1000;
 
        double cnt = 0;
 
        while (cnt < t) {
 
            double x = v0 * cosTheta * cnt;
            double y = v0 * sinTheta * cnt - .5 * gravity * cnt * cnt;
            points.add(new Point(15 + (int) x, 415 - (int) y));
 
            cnt += deltaT;
        }
 
        }
 
    }
 
    public SimulaTiro() {
 
        try {
            SimulaTiroThread simulaTiroThread = new SimulaTiroThread();
            simulaTiroThread.start();
            simulaTiroThread.join();
            setSize(800, 450);
            setLocation(100, 100);
            setVisible(true);
            this.setTitle("Simulacion cañon");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (InterruptedException ex) {
            Logger.getLogger(SimulaTiro.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 
    }
 
    public void paint(Graphics g) {
 
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
 
        Dimension d = this.getSize();
 
        super.paintComponents(g);
 
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(-theta), 15, 415);
        AffineTransform old = g2.getTransform();
        g2.transform(transform);
 
        g2.setColor(Color.BLACK);
 
        g2.fillOval(x1, 400, 31, 31);
        Polygon poly = new Polygon();
        poly.addPoint(15, 400);
        poly.addPoint(60, 410);
        poly.addPoint(60, 420);
        poly.addPoint(15, 431);
        g2.setColor(Color.BLACK);
        g2.fillPolygon(poly);
        g2.setColor(Color.RED);
 
        g2.drawLine(15, 415, 100, 415);
 
        g2.setTransform(old);
        g2.setColor(Color.GRAY);
        g2.fill(new Rectangle2D.Double(0, 431, 31, 10));
 
        g2.setColor(Color.WHITE);
 
        g2.drawLine(15, 0, 15, (int) d.getHeight());
        g2.drawLine(0, 415, (int) d.getWidth(), 415);
 
        g2.setColor(Color.BLUE);
 
        for(Point p : points) {
            g2.drawOval(p.getX(), p.getY(), 1, 1);
        }
 
    }
 
    public static void main(String argv[]) {
        SimulaTiro c = new SimulaTiro();
    }
 
}

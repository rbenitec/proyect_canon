
package vistas;

import java.awt.Color;
import java.awt.Graphics;

public class FiguraBase {
    
    public static void dibujarLinea(Graphics g, int x1, int y1, int x2, int y2){
        System.out.println("FiguraBase : "+ g.toString()+" - "+ x1 +" - "+y1+" - "+ x2 + " - " + y2);
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
    }
    
    public static void dibujarCuadrado(Graphics g, int x1, int y1, int ancho, int alto){
        System.out.println("FiguraBase : "+ g.toString()+" - "+ x1 +" - "+y1+" - "+ ancho + " - " + alto);
        g.setColor(Color.BLACK);
        g.drawRect(x1, y1, ancho, alto);
    }
    
}

package KNN;

import java.awt.Color;
import java.awt.Graphics;

public class Parametros {
    
    private int x,y,c,i;
    private float distancia;
    public static final int d = 10;
    private static int nClases,k ,nPuntos;
    
    

    public Parametros(int i,int x, int y,int clase) {
        this.x = x;
        this.y = y;
        this.i = i;
        this.c = clase;
    }
    
    public Parametros(int i,int x, int y) {
        this.x = x;
        this.y = y;
        this.i = i;
    }
    
    public Parametros() {
        
    }
    
    public Parametros(int i,int x, int y,int clase,float d) {
        this.x = x;
        this.y = y;
        this.i = i;
        this.c = clase;
        this.distancia = d;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public int getnClases() {
        return nClases;
    }

    public void setnClases(int nClases) {
        this.nClases = nClases;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getnPuntos() {
        return nPuntos;
    }

    public void setnPuntos(int nPuntos) {
        this.nPuntos = nPuntos;
    }
    
    
    
    @Override
    public String toString() {
        return "Datos{ Id: "+ i + " x=" + x + ", y=" + y + ", clase=" + c + ", distancia=" + distancia + '}';
    }
    
    public void pintar(Graphics g, int color){
        switch(color){
            case 1: g.setColor(Color.BLUE);
            break;
            case 2: g.setColor(Color.GREEN);
            break;
            case 3: g.setColor(Color.YELLOW);
            break;
            case 4: g.setColor(Color.pink);
            break;
            case 0: g.setColor(Color.red);
            break;
            default:
            break;
        }
        
        g.fillOval(this.x - 2/d , this.y - 2/d ,d,d);
    }
        
}
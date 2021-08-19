package KNN;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PanelGrafica extends JPanel implements MouseListener{ 
    
    private ArrayList<Parametros> par;
    private int a = 0;
    private int hi = 0;
    private int[] m;
    Parametros p = new Parametros();
    
    public PanelGrafica(){
        this.par = new ArrayList<>();
        this.addMouseListener(this);
    }

    /*public PanelGrafica(int nClases, int k, int nPuntos) {
        this.nClases = nClases;
        this.k = k;
        this.nPuntos = nPuntos;
    }*/
    int z; 
    public void paint(Graphics g){
        int l=0;
        for(Parametros p: par){
            
            z = par.get(l).getC();
            p.pintar(g,z);
            System.out.println("Punto "+(l+1) +" capturado");
            l++;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(a <  p.getnPuntos()){ 
             
            if(e.getButton() == MouseEvent.BUTTON1){
                
                hi = a % p.getnClases();
                this.par.add(new Parametros(a,(int)e.getX(),(int) e.getY(), hi ));
                repaint();
                par.forEach(System.out::println);
                a++;  
                
                if(a== p.getnPuntos()){
                    ventanaPunto();
                }
            }
             
        }else if(a ==  p.getnPuntos() /*&& a <  p.getnPuntos()+1*/){
            if(e.getButton() == MouseEvent.BUTTON1){
                this.par.add(new Parametros(a,(int)e.getX(),(int) e.getY() ));
                algoritmoImplementado();
                par.forEach(System.out::println);
                repaint();
                a++;  
            }
        }
            /*System.out.println(p.getnPuntos()); 
            System.out.println(p.getnClases());
            System.out.println(p.getK());*/
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println(a);
    }
    
    public void ventanaPunto(){
        JOptionPane.showMessageDialog( null ,"Ingresa el punto a clasificar", "KNN",JOptionPane.WARNING_MESSAGE);
    }
    
    public void algoritmoImplementado(){
        int tam,h;
        int equis, ye, c;
        float d;
        tam = par.size();
        System.out.println("size "+ tam);
        Parametros aux;  
        for(int l=0 ; l<tam-1 ; l=l+1){
            equis = par.get(l).getX(); 
            ye = par.get(l).getY();
            c = par.get(l).getC();
            System.out.println("x y y " + equis + " " + ye);
            d = distancia(equis,ye,par.get(tam-1).getX(),par.get(tam-1).getY());
            aux = new Parametros();
            aux.setDistancia(d);
            aux.setX(equis);
            aux.setY(ye);
            aux.setI(l);
            aux.setC(c);
            //System.out.println("Distancia "+l+" " +d);
            par.set(l,aux);
            //System.out.println(l);
            //this.par.set(new Parametros(l,equis,ye, c, d ));
        }
        
        aux = new Parametros();
        aux.setC(asignarClase());
        aux.setDistancia(0);
        equis = par.get(0).getX(); 
        ye = par.get(0).getY();
        aux.setX(equis);
        aux.setY(ye);
        aux.setI(tam-1);
        par.set(0,aux);
    }
    
    public float distancia(int x, int y, int x2, int y2){
        float d,min;
        d =(float) Math.sqrt( Math.pow(x2-x,2)+ Math.pow(y2- y,2));
        return d;
    }
    
    public int asignarClase(){
        int cero=0, uno=0, dos = 0, tres = 0, cuatro = 0,max=0;
       
        menorAMayor();
        //clases.forEach(System.out::println);
        for(int i = 1; i <= p.getK() ; i++){
            
            switch(par.get(i).getC()){
                case 0: cero++;
                    break;
                case 1: uno++;
                    break;
                case 2: dos++;
                    break;
                case 3: tres ++;
                    break;
                case 4: cuatro++;
                    break;
            }
        }
        
        if(cero>uno && cero>dos && cero>tres && cero >cuatro){
            max = 0;
        }else if(uno>cero && uno>dos && uno>tres && uno >cuatro){
            max = 1;
        }else if(dos>cero && dos>uno && dos>tres && dos >cuatro){
            max = 2;
        }else if(tres>cero && tres>uno && tres>dos && tres >cuatro){
            max = 3;
        }else if(cuatro>cero && cuatro>uno && cuatro>dos && cuatro >tres){
            max = 4;
        }
        
        return max;
    }
    
    public void menorAMayor(){
        Collections.sort(par, new Comparator<Parametros>() {
	@Override
            public int compare(Parametros p, Parametros p2) {
		return new Float(p.getDistancia()).compareTo(new Float(p2.getDistancia()));
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

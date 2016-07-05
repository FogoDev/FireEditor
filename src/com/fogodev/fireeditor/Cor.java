package com.fogodev.fireeditor;

import java.util.Set;
import java.util.HashSet;

/**
 * Cores em RGB
 */
public class Cor
{
    public int r;
    public int g;
    public int b;

    private static Set<Cor> cores = new HashSet<Cor>();

    public static Cor BRANCO = Cor.rgb(1.0, 1.0, 1.0); 
    public static Cor AZUL = Cor.rgb(0.0, 0.0, 1.0); 
    public static Cor VERDE = Cor.rgb(0.0, 1.0, 0.0); 
    public static Cor VERMELHO = Cor.rgb(1.0, 0.0, 0.0); 
    public static Cor CINZA = Cor.rgb(0.7, 0.7, 0.7);
    public static Cor AMARELO = Cor.rgb(1.0, 1.0, 0.0);
    public static Cor PRETO = Cor.rgb(0.0, 0.0, 0.0);
    
    public static Cor rgb(int r, int g, int b) {
        for(Cor c: cores) {
            if(c.r == r && c.g == g && c.b == b)
                return c;
        }
        Cor c = new Cor(r, g, b);
        cores.add(c);
        return c;
    }

    public static Cor rgb(double dr, double dg, double db) {
        int r = (int)(dr * 255);
        int g = (int)(dg * 255);
        int b = (int)(db * 255);
        for(Cor c: cores) {
            if(c.r == r && c.g == g && c.b == b)
                return c;
        }
        Cor c = new Cor(r, g, b);
        cores.add(c);
        return c;
    }
    
    /*
     * Cria uma cor dados os componentes entre 0 e 255
     */
    private Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }    
    
    public String toString() {
        return String.format("(%d,%d,%d)", r, g, b);
    }
}











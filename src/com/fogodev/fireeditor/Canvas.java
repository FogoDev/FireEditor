package com.fogodev.fireeditor;

public class Canvas extends Componente {
    Cor fundo, borda;
    ObservadorCanvas obs;
    
    Tela tela;
    
    public Canvas(int x, int y, int larg, int alt, Cor _fundo, Cor _borda,
                    ObservadorCanvas _obs) {
        super(x, y, larg, alt);
        fundo = _fundo;
        borda = _borda;
        obs = _obs;
    }
    
    public void desenhar(Tela t) {
        t.retangulo(x, y, larg, alt, borda);
        t.retangulo(x + 5, y + 5, larg - 10, alt - 10, fundo);
        tela = t; 
        obs.desenhar(this);
    }

    public void arrasto(int x, int y) {
        obs.arrasto(x - this.x - 5, y - this.y - 5);
    }
        
    public void aperto(int x, int y) {
        obs.aperto(x - this.x - 5, y - this.y - 5);
    }
    
    public void solta(int x, int y) {
        obs.solta(x - this.x - 5, y - this.y - 5);
    }
    
    public void retangulo(int x, int y, int larg, int alt, Cor cor) {
        tela.retangulo(x + this.x + 5, y + this.y + 5, larg, alt, cor);
    }
    
    public void circulo(int cx, int cy, int raio, Cor cor) {
        tela.circulo(cx + this.x + 5, cy + this.y + 5, raio, cor);
    }

    public void triangle(int x1, int y1, int x2, int y2, int x3, int y3, Cor cor)
    {
        tela.triangulo(x1 + this.x + 5, y1 + this.y + 5, x2 + this.x + 5, y2 + this.y + 5, x3 + this.x + 5, y3 + this.y + 5, cor);
    }
}
package com.fogodev.fireeditor;

public class ModoMover implements ModoEditor {
    ModeloEditor modelo;
    Figura fig;
    
    int ox, oy, x, y;
    
    public ModoMover(ModeloEditor _modelo) {
        modelo = _modelo;
    }
    
    public void inicio(int x, int y) {
        ox = x; oy = y;
        this.x = x; this.y = y;
        for(Figura f: modelo.figuras) {
            if(f.dentro(x, y)) {
                fig = f;
                break;
            }
        }
    }
    
    public void meio(int x, int y) {
        if(fig != null) {
            fig.mover(x - this.x, y - this.y);
            this.x = x; this.y = y;
        }
    }
    
    public void fim(int x, int y) {
        if(fig != null) {
            fig.mover(x - this.x, y - this.y);
            this.x = x; this.y = y;
            modelo.feitos.push(new ComandoMover(fig, x - ox, y - oy));
        }
        modelo.mover(); // ou fig = null;
    }

    @Override
    public void abortar()
    {

    }

    public String tag() { return "mov"; }

}
package com.fogodev.fireeditor;

public class ModoMover extends ModoEditor {

    Figura fig;
    
    int ox, oy, x, y;
    
    public ModoMover(ModeloEditor model)
    {
        super(model);
    }
    
    public void inicio(int x, int y)
    {
        ox = x;
        oy = y;
        this.x = x;
        this.y = y;
        for(Figura f: this.model.figuras) {
            if(f.dentro(x, y)) {
                fig = f;
                break;
            }
        }
    }
    
    public void meio(int x, int y)
    {
        if(fig != null) {
            fig.mover(x - this.x, y - this.y);
            this.x = x;
            this.y = y;
        }
    }
    
    public void fim(int x, int y)
    {
        if(fig != null) {
            fig.mover(x - this.x, y - this.y);
            this.x = x; this.y = y;
            this.model.feitos.push(new ComandoMover(fig, x - ox, y - oy));
        }
        this.model.mover(); // ou fig = null;
    }


    public String tag()
    {
        return "mov";
    }

}
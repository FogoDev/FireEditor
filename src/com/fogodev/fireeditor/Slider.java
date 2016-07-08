package com.fogodev.fireeditor;

/**
 * Criado por ericson em 07/07/16.
 *
 * https://github.com/fogodev
 */
public class Slider extends Componente
{
    private Cor front;
    private Cor back;

    private ObservadorSlider watcher;
    private double value;
    private Retangulo rectagle;


    public Slider(int x, int y, int larg, Cor front, Cor back, ObservadorSlider watcher, double value)
    {
        super(x, y, larg, 100);
        this.front = front;
        this.back = back;
        this.watcher = watcher;
        this.rectagle = new Retangulo(x, (int)Math.round(y + 70 - value * 70), larg, 30, front.r, front.g, front.b);
        this.value = value;
    }

    public void aperto(int x, int y)
    {
        this.invertColors();
    }

    public void arrasto(int x, int y)
    {
        if((y >= this.y) && y <= this.y + this.alt - this.rectagle.alt ){
            this.rectagle.y = y;
            this.setValue(y);
            this.watcher.mudou(this.value);
        }

    }

    public void solta(int x, int y)
    {

        this.invertColors();

    }

    public void desenhar(Tela canvas)
    {
        canvas.retangulo(this.x, this.y, this.larg, this.alt, this.front);
        canvas.retangulo(this.x + 5, this.y + 5, this.larg - 10, this.alt - 10, this.back);
        canvas.retangulo(this.rectagle.x, this.rectagle.y, this.rectagle.larg, this.rectagle.alt, Cor.rgb((int)this.rectagle.r, (int)this.rectagle.g, (int)this.rectagle.b));
    }

    private void invertColors()
    {
        Cor temp = this.back;
        this.back = this.front;
        this.front = temp;
    }

    private void setValue(int y)
    {
        this.value = 1 - ((y - this.y) / (double)(this.alt - this.rectagle.alt));
    }

}

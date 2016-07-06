package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
public class Dot extends AbstractFigura
{
    private Circulo circle;

    public Dot(int x, int y, double r, double g, double b)
    {
        super(x, y, r, g, b);
        this.circle = new Circulo(x, y, 1, r, g, b);
    }

    @Override
    public boolean dentro(int x, int y)
    {
        return this.circle.dentro(x, y);
    }

    @Override
    public void desenhar(ModeloCanvas c)
    {
        this.circle.desenhar(c);
    }
}

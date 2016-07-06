package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
public class TriangleMode3 extends TriangleMode
{
    private Dot dot1;
    private Dot dot2;

    public TriangleMode3(ModeloEditor model, Dot dot1, Dot dot2)
    {
        super(model);
        this.dot1 = dot1;
        this.dot2 = dot2;
    }

    @Override
    public void fim(int x, int y)
    {
        Dot dot3 = new Dot(x, y, this.model.r, this.model.g, this.model.b);
        Triangle triangle = new Triangle(this.dot1, this.dot2, dot3, model.r, model.g, model.b);
        this.model.figuras.add(triangle);
        this.model.figuras.remove(this.dot1);
        this.model.figuras.remove(this.dot2);
        this.model.feitos.pop();
        this.model.feitos.pop();
        this.model.feitos.push(new ComandoFigura(triangle));
        this.model.triangle1();
    }

    @Override
    public void abortar()
    {
        this.model.figuras.remove(this.dot1);
        this.model.figuras.remove(this.dot2);
        this.model.feitos.pop();
        this.model.feitos.pop();
    }
}

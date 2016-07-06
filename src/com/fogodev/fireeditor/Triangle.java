package com.fogodev.fireeditor;

/**
 * Criado por ericson em 05/07/16.
 *
 * https://github.com/fogodev
 */
public class Triangle extends AbstractFigura
{
    private Dot dot1;
    private Dot dot2;
    private Dot dot3;

    public Triangle(Dot dot1, Dot dot2, Dot dot3, double r, double g, double b)
    {
        super(0,0, r,g,b);

        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
    }

    @Override
    public boolean dentro(int x, int y)
    {
        boolean b1, b2, b3;

        Dot point = new Dot(x, y, 0, 0, 0);
        // Código catado do StackOverflow pra verificar se um ponto está dentro de um triângulo
        b1 = this.sign(point, this.dot1, this.dot2) < 0.0f;
        b2 = this.sign(point, this.dot2, this.dot3) < 0.0f;
        b3 = this.sign(point, this.dot3, this.dot1) < 0.0f;

        return ((b1 == b2) && (b2 == b3));

    }

    @Override
    public void desenhar(ModeloCanvas c)
    {
        c.triangle(this.dot1.x, this.dot1.y, this.dot2.x, this.dot2.y, this.dot3.x, this.dot3.y, this.r, this.g, this.b);
    }

    public void mover(int dx, int dy) {
        this.dot1.x += dx;
        this.dot1.y += dy;
        this.dot2.x += dx;
        this.dot2.y += dy;
        this.dot3.x += dx;
        this.dot3.y += dy;
    }


    // Código catado do StackOverflow pra verificar se um ponto está dentro de um triângulo
    private double sign (Dot point1, Dot point2, Dot point3)
    {
        return (point1.x - point3.x) * (point2.y - point3.y) - (point2.x - point3.x) * (point1.y - point3.y);
    }
}

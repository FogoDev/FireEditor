package com.fogodev.fireeditor;

/**
 * Criado por ericson em 07/07/16.
 *
 * https://github.com/fogodev
 */
public class CaixaCor extends Componente
{
    private CorCaixa boxColor;

    public CaixaCor(int x, int y, int larg, int alt, CorCaixa boxColor)
    {
        super(x, y, larg, alt);
        this.boxColor = boxColor;
    }

    @Override
    public void desenhar(Tela t)
    {
        t.retangulo(this.x, this.y, this.larg, this.alt, Cor.rgb(this.boxColor.getR(), this.boxColor.getG(), this.boxColor.getB()));
    }
}

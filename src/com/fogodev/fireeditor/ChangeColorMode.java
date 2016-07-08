package com.fogodev.fireeditor;

/**
 * Criado por ericson em 07/07/16.
 *
 * https://github.com/fogodev
 */
public class ChangeColorMode extends ModoEditor
{
    private Figura figure;

    public ChangeColorMode(ModeloEditor model)
    {
        super(model);
    }

    @Override
    void inicio(int x, int y)
    {
        for(Figura figure: model.figuras) {
            if(figure.dentro(x, y)) {
                this.figure = figure;
                break;
            }
        }
    }

    @Override
    void meio(int x, int y)
    {
        // THERE IS NO MIDDLE HERE
    }

    @Override
    void fim(int x, int y)
    {
        if(this.figure != null){
            double [] oldColors = this.figure.getColor();
            double [] newColors = {this.model.r, this.model.g, this.model.b};
            this.figure.changeColor(newColors);
            this.model.feitos.push(new ChangeColorCommand(this.figure, oldColors, newColors));
        }
    }

    @Override
    String tag()
    {
        return "change";
    }
}

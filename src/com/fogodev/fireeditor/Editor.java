package com.fogodev.fireeditor;

public class Editor extends AbstractApp {
    ModeloEditor modelo;
    
    public Editor() {
        super("Editor", 1024, 768);
        modelo = new ModeloEditor();
        componentes.add(new BotaoOnOff(50, 40, 200, 50, "Mover", Cor.BRANCO, Cor.PRETO, modelo::mover, this::isModoMover));
        componentes.add(new BotaoOnOff(50, 130, 200, 50, "Retangulo", Cor.BRANCO, Cor.PRETO, modelo::retangulo, this::isModoRetangulo));
        componentes.add(new BotaoOnOff(50, 220, 200, 50, "Circulo", Cor.BRANCO, Cor.PRETO, modelo::circulo, this::isModoCirculo));
        componentes.add(new BotaoOnOff(50, 310, 200, 50, "Triângulo", Cor.BRANCO, Cor.PRETO, modelo::triangle, this::isModoTriangle));
        componentes.add(new BotaoOnOff(50, 400, 200, 50, "Troca cor", Cor.BRANCO, Cor.PRETO, modelo::apagar, this::isModoApagar));
        componentes.add(new BotaoOnOff(50, 490, 200, 50, "Apagar", Cor.BRANCO, Cor.PRETO, modelo::apagar, this::isModoApagar));
        componentes.add(new Botao(50, 580, 200, 50, "Desfazer", Cor.BRANCO, Cor.PRETO, modelo::desfazer));
        componentes.add(new Botao(50, 670, 200, 50, "Refazer", Cor.BRANCO, Cor.PRETO, modelo::refazer));
        componentes.add(new Slider(920,550, 20, Cor.VERMELHO, Cor.rgb(0.5, 0, 0), modelo::changeRedColor, 0 ));
        componentes.add(new Slider(955,550, 20, Cor.VERDE, Cor.rgb(0, 0.5, 0), modelo::changeGreenColor, 0 ));
        componentes.add(new Slider(990,550, 20, Cor.AZUL, Cor.rgb(0, 0, 0.5), modelo::changeBlueColor, 1 ));
        componentes.add(new CaixaCor(920, 670, 90, 70, new CorCaixa() {
            @Override
            public double getR()
            {
                return modelo.r;
            }

            @Override
            public double getG()
            {
                return modelo.g;
            }

            @Override
            public double getB()
            {
                return modelo.b;
            }
        }));
        componentes.add(new Canvas(300, 0, 600, 768, Cor.PRETO, Cor.BRANCO, new ObservadorCanvas() {
            public void desenhar(Canvas c) {
                for(Figura f: modelo.figuras) {
                    f.desenhar(new ModeloCanvas() {
                        public void retangulo(int x, int y, int larg, int alt, double r, double g, double b) {
                            c.retangulo(x, y, larg, alt, Cor.rgb(r, g, b));
                        }
                        public void circulo(int cx, int cy, int raio, double r, double g, double b) {
                            c.circulo(cx, cy, raio, Cor.rgb(r, g, b));
                        }

                        public void triangle(int x1, int y1, int x2, int y2, int x3, int y3, double r, double g, double b){
                            c.triangle(x1, y1, x2, y2, x3, y3, Cor.rgb(r, g, b));
                        }
                    });
                }
            }
            public void aperto(int x, int y) {
                modelo.inicio(x, y);
            }
            public void arrasto(int x, int y) {
                modelo.meio(x, y);
            }
            public void solta(int x, int y) {
                modelo.fim(x, y);
            }
        }));
    }

    public boolean isModoMover() {
        return modelo.modo().equals("mov");
    }

    public boolean isModoRetangulo() {
        return modelo.modo().equals("ret");
    }

    public boolean isModoCirculo() {
        return modelo.modo().equals("circ");
    }

    public boolean isModoApagar()
    {
        return modelo.modo().equals("del");
    }

    public boolean isModoTriangle()
    {
        return modelo.modo().equals("tri");
    }
    
    public static void main(String[] args) {
        new Motor(new Editor());
    }
}
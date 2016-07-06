package com.fogodev.fireeditor;

public interface ModeloCanvas {
    void retangulo(int x, int y, int larg, int alt, double r, double g, double b);
    void circulo(int cx, int cy, int raio, double r, double g, double b);
    void triangle(int x1, int y1, int x2, int y2, int x3, int y3, double r, double g, double b);
}

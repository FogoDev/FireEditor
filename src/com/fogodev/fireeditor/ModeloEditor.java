package com.fogodev.fireeditor;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class ModeloEditor {
    List<Figura> figuras;
    Stack<Comando> feitos, desfeitos;
    ModoEditor modo;
    double r, g, b;
    
    public ModeloEditor() {
        figuras = new ArrayList<Figura>();
        feitos = new Stack<Comando>();
        desfeitos = new Stack<Comando>();
        modo = new ModoMover(this);
        r = 0.0; g = 0.0; b = 1.0;
    }
    
    public void trocaModo(ModoEditor novoModo) {
        modo = novoModo;
    }
    
    public void inicio(int x, int y) {
        modo.inicio(x, y);
    }
    
    public void meio(int x, int y) {
        modo.meio(x, y);
    }
    
    public void fim(int x, int y) {
        modo.fim(x, y);
    }
    
    public void retangulo() {
        trocaModo(new ModoRetangulo(this));
    }
    
    public void mover() {
        trocaModo(new ModoMover(this));
    }
    
    public void circulo() {
        trocaModo(new ModoCirculo(this));
    }

    public void apagar()
    {
        trocaModo(new ModoApagar(this));
    }
    
    public void desfazer() {
        if(!feitos.isEmpty()) {
            Comando c = feitos.pop();
            c.desfazer(this);
            desfeitos.push(c);
        }
    }
    
    public void refazer() {
        if(!desfeitos.isEmpty()) {
            Comando c = desfeitos.pop();
            c.refazer(this);
            feitos.push(c);
        }
    }
    
    public String modo() {
        return modo.tag();
    }
}
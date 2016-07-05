package com.fogodev.fireeditor;

public class BotaoOnOff extends Botao {
    OnOff onoff;
    
    public BotaoOnOff(int _x, int _y, int _larg, int _alt, String _texto, 
                 Cor _frente, Cor _fundo, Acao _acao, OnOff _onoff) {
        super(_x, _y, _larg, _alt, _texto, _frente, _fundo, _acao);
        onoff = _onoff;
    }
    
    public void desenhar(Tela t) {
        t.retangulo(x, y, larg, alt, frente);
        if(onoff.on()) {
            t.texto(texto, x, y, larg, alt, Tela.CENTRO, 36, fundo);
        } else {
            t.retangulo(x + 5, y + 5, larg - 10, alt - 10, fundo);
            t.texto(texto, x, y, larg, alt, Tela.CENTRO, 36, frente);
        }
    }
}
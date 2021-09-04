/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.campominado.campominado;

import java.util.Random;

/**
 *
 * @author Celso Franca Neto
 */
public class CampoMinado {

    private boolean[] casas;
    private int acertos;
    private Random random = new Random();

    public CampoMinado() {

        this.acertos = 0;
        iniciaCasas();

    }

    public void geraCasas() {
        this.casas = new boolean[84];
        for (int i = 0; i < 84; i++) {
            this.casas[i] = false;
        }
    }

    public void iniciaCasas() {

        geraCasas();
        int index = 0;

        while (index < 60) {
            int escolhe = random.nextInt(84);
            if (this.casas[escolhe] == false) {
                this.casas[escolhe] = true;

                index++;
            }
        }

    }

    public boolean confereCasa(int posicao) {
        return casas[posicao];
    }

    public boolean addAcertos() {
        if (this.acertos < 10) {
            this.acertos++;
            return false;
        } else {
            return true;
        }
    }

    public void reiniciar() {
        iniciaCasas();
        this.acertos = 0;
    }

    public boolean[] getCasas() {
        return casas;
    }

}

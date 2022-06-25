/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Estudante;

/**
 *
 * @author gilberto
 */
public class TesteEstudante {
    public static void main(String[] args) {
        //Criação e instância do objeto
        Estudante estudante = new Estudante();
        
        //Construção
        estudante.setRm("0170");
        estudante.setNome("Joãozinho");
        
        //Apresentando o estudante
        System.out.println("\n\t\t\t -- Estudante 1 --\n");
        estudante.apresentarEstudante();
        
        //Outro estudante
        Estudante outroEstudante = new Estudante("0150", "Mariazinha");
        
        //Apresentando outro estudante
        System.out.println("\n\t\t\t -- Outro Estudante --\n");
        outroEstudante.apresentarEstudante();
                                                
    }
    
}

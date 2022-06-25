/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.ComponenteCurricular;

/**
 *
 * @author gilberto
 */
public class TesteComponenteCurricular {
    public static void main(String[] args) {
        //Criação e instância do objeto
        ComponenteCurricular componenteCurricular = new ComponenteCurricular();
        
        //Construção do objeto
        componenteCurricular.setSigla("BD2");
        componenteCurricular.setComponente("Banco de Dados 2");
        componenteCurricular.setCargaHoraria(50.0);
        
        //Imprimindo o componente curricular
        System.out.println("\n\t\t\t -- Componente Curricular 1 --\n");
        componenteCurricular.imprimirComponenteCurricular();
        
        //Criação de outro objeto...
        ComponenteCurricular outroCompCurricular = new ComponenteCurricular("DS", "Desenvolvimento de Sistemas", 100.0);
                
        //Imprimindo outro componente curricular
        System.out.println("\n\t\t\t -- Outro Componente Curricular --\n");
        outroCompCurricular.imprimirComponenteCurricular();
        
        
    }
    
}

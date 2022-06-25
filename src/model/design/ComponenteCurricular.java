/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author gilberto
 */
public class ComponenteCurricular {
    //Atributos
    private String sigla;
    private String componente;
    private double cargaHoraria;
    
    //Métodos
    public void imprimirComponenteCurricular(){
        System.out.println("Sigla: " + getSigla());
        System.out.println("Componente Curricular: " + getComponente());
        System.out.println("Carga Horária: " + getCargaHoraria());                        
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the componente
     */
    public String getComponente() {
        return componente;
    }

    /**
     * @param componente the componente to set
     */
    public void setComponente(String componente) {
        this.componente = componente;
    }

    /**
     * @return the cargaHoraria
     */
    public double getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ComponenteCurricular(String sigla, String componente, double cargaHoraria) {
        this.sigla = sigla;
        this.componente = componente;
        this.cargaHoraria = cargaHoraria;
    }

    public ComponenteCurricular() {
    }
    
    
    
    
    
    
}

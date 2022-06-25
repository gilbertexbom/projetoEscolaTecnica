/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.Estudante;

/**
 *
 * @author gilberto
 */
public class TableModelEstudante extends AbstractTableModel {
    //Lista de estudante
    private List<Estudante> estudantes = new ArrayList<>();
    
    //Vetor de rótulos de coluna
    private String[] colunas = {"RM", "Nome"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public void clearTable(){
        estudantes.clear();
    }
                
    @Override
    public int getRowCount() {
        return estudantes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return estudantes.get(rowIndex).getRm();
            case 1:
                return estudantes.get(rowIndex).getNome();
        }
        return null;
    }
    
    public void addRow(Estudante e){
        estudantes.add(e);
        this.fireTableDataChanged();
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                estudantes.get(rowIndex).setRm((String) aValue);
                break;
            case 1:
                estudantes.get(rowIndex).setNome((String) aValue);
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void removeRow(int rowIndex){
        estudantes.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nanan
 */
public class ModTblPartai extends AbstractTableModel {
    List<ModPartai> lmp;
    public ModTblPartai(List<ModPartai> lmp) {
        this.lmp = lmp;
    }

    @Override
    public int getRowCount() {
        return lmp.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmp.get(row).getNo();
            case 1:
                return lmp.get(row).getKomoditas();
            case 2:
                return lmp.get(row).getDaerah();
            case 3:
                return lmp.get(row).getHarga();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "No";
            case 1:
                return "Komoditas";
            case 2:
                return "Daerah";
            case 3:
                return "Harga";
            default:
                return null;
        }
        
    }
    
}

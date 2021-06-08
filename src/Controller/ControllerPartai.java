/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPartai;
import DAO.ImplementPartai;
import Model.ModPartai;
import Model.ModTblPartai;
import View.FormPartai;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nanan
 */
public class ControllerPartai {
    FormPartai frame;
    ImplementPartai implPartai;
    List<ModPartai> lmp;

    public ControllerPartai(FormPartai frame) {
        this.frame = frame;
        implPartai = new DAOPartai();
        lmp = implPartai.getAll();
    }

    
    public void reset(){
        frame.getTf_no().setText("");
        frame.getTf_komoditas().setText("");
        frame.getTf_daerah().setText("");
        frame.getTf_harga().setText("");
        
    }
    public void isiTable(){
        lmp = implPartai.getAll();
        ModTblPartai mtp = new ModTblPartai(lmp);
        frame.getTbl_partai().setModel(mtp);
    }
    public void isiField (int row){
        frame.getTf_no().setText(String.valueOf(lmp.get(row).getNo()));
        frame.getTf_komoditas().setText(lmp.get(row).getKomoditas());
        frame.getTf_daerah().setText(lmp.get(row).getDaerah());
        frame.getTf_harga().setText(String.valueOf(lmp.get(row).getHarga()));
        
    }
    public void insert(){
        if(!frame.getTf_komoditas().getText().trim().isEmpty() & !frame.getTf_komoditas().getText().trim().isEmpty()){
            ModPartai mp =  new ModPartai();
            mp.setKomoditas(frame.getTf_komoditas().getText());
            mp.setDaerah(frame.getTf_daerah().getText());
            mp.setHarga(Double.valueOf(frame.getTf_harga().getText()));
            
            implPartai.insert(mp);
            JOptionPane.showMessageDialog(null,"Data Disimpan!");
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!");
        }
    }
    
    public void delete(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_no().getText());
            implPartai.delete(no);
            JOptionPane.showMessageDialog(null,"Data Dihapus!");    
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus!");
        }
    }
    public void update(){
        if(!frame.getTf_no().getText().trim().isEmpty()){
            ModPartai mp = new ModPartai();
            mp.setKomoditas(frame.getTf_komoditas().getText());
            mp.setDaerah(frame.getTf_daerah().getText());
            mp.setHarga(Double.valueOf(frame.getTf_harga().getText()));
            mp.setNo(Integer.valueOf(frame.getTf_no().getText()));
            implPartai.update(mp);
            JOptionPane.showMessageDialog(null,"Data Diperbarui!");    
        }else{
            JOptionPane.showMessageDialog(null, "Data Diperbarui!");
        }
    }
    public void isiTableCariDaerah(){
        lmp = implPartai.getCariDaerah(frame.getTf_cari().getText());
        ModTblPartai mtp = new ModTblPartai(lmp);
        frame.getTbl_partai().setModel(mtp);
        
    }
    public void cariDaerah(){
        if(!frame.getTf_cari().getText().trim().isEmpty()){
            implPartai.getCariDaerah(frame.getTf_cari().getText());
            isiTableCariDaerah();
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan Nama Daerah");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModPartai;
import java.util.List;

/**
 *
 * @author nanan
 */
public interface ImplementPartai {
    public void insert(ModPartai mp);
    public void delete(int no);
    public void update (ModPartai mp);
    public List<ModPartai> getAll();
    public List<ModPartai> getCariDaerah(String daerah);
    
}

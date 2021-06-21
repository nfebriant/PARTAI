/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Koneksi.KoneksiDB;
import Model.ModPartai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nanan
 */
public class DAOPartai implements ImplementPartai{
    Connection connection;
    final String insert = "INSERT INTO partai(Komoditas, Daerah, Harga) VALUES (?, ?, ?)";
    final String delete = "DELETE FROM partai WHERE no=?";
    final String update = "UPDATE partai set Komoditas=?, Daerah=?, Harga=? WHERE No=?";
    final String select = "SELECT * FROM partai";
    final String cariDaerah = "SELECT * FROM partai WHERE Daerah like ?";

    public DAOPartai(){
        connection = KoneksiDB.Connection();
    }
    @Override
    public void insert(ModPartai mp) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setString(1, mp.getKomoditas());
            statement.setString(2, mp.getDaerah());
            statement.setDouble(3, mp.getHarga());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                mp.setNo(rs.getInt(1));
            }
            
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
                
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public void delete(int no) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
                
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
     @Override
    public void update(ModPartai mp) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, mp.getKomoditas());
            statement.setString(2, mp.getDaerah());
            statement.setDouble(3, mp.getHarga());
            statement.setInt(4, mp.getNo());
            
            statement.executeUpdate();
            
            
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
                
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    
    }

    @Override
    public List<ModPartai> getAll() {
        List<ModPartai> lmp = null;
        try{
            lmp = new ArrayList<ModPartai>();
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModPartai mp = new ModPartai();
                mp.setNo(rs.getInt("No"));
                mp.setKomoditas(rs.getString("Komoditas"));
                mp.setDaerah(rs.getString("Daerah"));
                mp.setHarga(rs.getDouble("Harga"));
                lmp.add(mp);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return lmp;
        
    }
    @Override
    public List<ModPartai> getCariDaerah(String daerah) {
        List<ModPartai> lmp = null;
        try{
            lmp = new ArrayList<ModPartai>();
            PreparedStatement st = connection.prepareStatement(cariDaerah);
            st.setString(1, "%" + daerah + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                ModPartai mp = new ModPartai();
                mp.setNo(rs.getInt("No"));
                mp.setKomoditas(rs.getString("Komoditas"));
                mp.setDaerah(rs.getString("Daerah"));
                mp.setHarga(rs.getDouble("Harga"));
                lmp.add(mp);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            
        }
        return lmp;
    }

}

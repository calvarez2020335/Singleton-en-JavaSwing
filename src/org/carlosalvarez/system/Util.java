/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.carlosalvarez.system;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Adolfo Alvarez Crúz
 * @date 28 abr 2021
 * @time 14:37:55
 * Codigo tecnico: IN5BV
 */
public class Util {
    
    private static Util instancia;
    private Util(){
    }
    
    public static Util getInstance(){
        if(instancia == null){
            instancia = new Util();
        }
        return instancia;
    }
    
    JFrame frmAutor;
    JFrame frmLogin;
    JFrame frmBien;
       
    public void abrirAutor(){
       frmAutor = AutorSingleton.getInstance();
       frmAutor.setVisible(true);
    }
    
    public void abrirLogin(){
        frmLogin = LoginSingleton.getInstance();
        frmLogin.setVisible(true);
    }
    
    public void salir(){
        int respuesta =JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir que quiere salir?","Confirmación de cierre",JOptionPane.YES_NO_OPTION
        ,JOptionPane.QUESTION_MESSAGE);
        
        if(respuesta == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }
    
    public void bien(){
        frmBien = Singletonbienvenida.getInstance();
        frmBien.setVisible(true);
    }
    
    public void validarCredenciales(String usuario, String password){
        if((usuario.equals("")) && (password.equals(""))){
            JOptionPane.showMessageDialog(null, "Antes de continuer, ingrese el usuario y la contraseña");
        }else if((!usuario.equals(""))&&(password.equals(""))){
            JOptionPane.showMessageDialog(null, "Falta Contraseña");
        }else if((usuario.equals(""))&&(!password.equals(""))){
            JOptionPane.showMessageDialog(null, "Falta Usuario");
        }else{
            if((usuario.equals("root"))&&(password.equals("admin"))){
                JFrame frmBineve = Singletonbienvenida.getInstance();
                frmBineve.setVisible(true);
                if(frmLogin != null){
                frmLogin.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña es incorrecta");
                
                
            }
        }
            
    }
}

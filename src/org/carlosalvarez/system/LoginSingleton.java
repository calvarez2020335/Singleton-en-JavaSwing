/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.carlosalvarez.system;

import javax.swing.JFrame;

/**
 *
 * @author Carlos Adolfo Alvarez Crúz
 * @date 22 abr 2021
 * @time 17:28:49
 * Codigo tecnico: IN5BV
 */
public class LoginSingleton {
    private static JFrame instanciaLogin;
    
    private LoginSingleton(){
    }
    
    public static JFrame getInstance(){
        if(instanciaLogin == null){
            instanciaLogin = new Login();
            
        }
        return instanciaLogin;
    }
}

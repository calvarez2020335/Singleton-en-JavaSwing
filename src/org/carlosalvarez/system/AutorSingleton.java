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
 * @date 26 abr 2021
 * @time 8:49:46
 * Codigo tecnico: IN5BV
 */
public class AutorSingleton {

    private static JFrame instanciaAutor;
    
    private AutorSingleton(){
    }
    
    public static JFrame getInstance(){
        if(instanciaAutor== null){
            instanciaAutor = new Autor();   
        }
        return instanciaAutor;
    }
            
}

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
 * @date 28 abr 2021
 * @time 15:20:29
 * Codigo tecnico: IN5BV
 */
public class Singletonbienvenida {

    private static JFrame instanciaBien;
    
    private Singletonbienvenida(){
    }
    
    public static JFrame getInstance(){
        if(instanciaBien== null){
            instanciaBien = new Bienvenida();   
        }
        return instanciaBien;
    }
}

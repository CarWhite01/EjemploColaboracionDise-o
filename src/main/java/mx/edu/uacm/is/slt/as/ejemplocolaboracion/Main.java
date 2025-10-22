/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.uacm.is.slt.as.ejemplocolaboracion;

/**
 *
 * @author nachintoch
 */
public class Main {

    public static void main(String[] args) {
        ControladorA controladorA = new ControladorA();
        controladorA.evento();
        
        ControladorB contb = new ControladorB();
        contb.evento();
    }
}
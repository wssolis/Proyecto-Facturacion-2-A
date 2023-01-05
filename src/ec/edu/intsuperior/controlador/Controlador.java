/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cliente;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Santiago
 */
public class Controlador {
    
    public void menu(){
        Scanner leer= new Scanner(System.in);
        int op=0;
        Cliente c;
        ArrayList<Cliente> listaCLiente = new ArrayList<>();
        
        do {            
             System.out.println("Bienvenidos al sistema de Facturación\n"
                + "Que deseas hacer....?\n"
                + "1.- Registrar Cliente\n"
                + "2.- Mostrar Cliente\n"
                + "3.- Registrar Pruducto\n"
                + "12.- Salir");
             op = leer.nextInt();
             switch(op){
                 case 1:
                     c= new Cliente();
                     System.out.println("Ingresa Cedula");
                     c.setCedula(leer.next());
                     System.out.println("Ingresa Nombre1");
                     c.setNombre1(leer.next());
                     System.out.println("Ingresa Apellido");
                    c.setApellido1(leer.next());
                    listaCLiente.add(c);
                     break;
                 case 2:
                     System.out.println("Ingresa el indice del arreglo");
                     int i= leer.nextInt();
                     System.out.println("Los datos del cliente son: "+listaCLiente.get(i).toString());
                     break;
                 case 3:
                     break;
                 case 4:
                     break;
                 case 5:
                     break;
                 case 6:
                     break;
                 case 7:
                     break;
                 case 12:
                     JOptionPane.showMessageDialog(null,"Gracias por utilizar el servicio de facturación");
                     break;
             }
             
        } while (op!=12);
       
    }
    
}

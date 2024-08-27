/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.frmRegistro;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ctrlRegistro implements MouseListener
{
    
    //1 Mando a llamar a las otras capas
    
    frmRegistro vista;
    //2 constuctor
    public ctrlRegistro (frmRegistro Vista){
    this.vista = Vista;
    
 vista.btnRegistrar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

if(e.getSource() == vista.btnRegistrar) {


if (vista.txtNombre.getText().isEmpty()){
    JOptionPane.showMessageDialog(vista, "Llene todos los campos");
} else 
    if (vista.txtContraseña.getText().isEmpty()){
    JOptionPane.showMessageDialog(vista, "Llene todos los campos");
}
else
if (vista.txtCorreo.getText().isEmpty()){
    JOptionPane.showMessageDialog(vista, "Llene todos los campos");
}
else
if (vista.txtEdad.getText().isEmpty()){
    JOptionPane.showMessageDialog(vista, "Llene todos los campos");
}
else
if (!vista.txtCorreo.getText().contains("@") || !vista.txtCorreo.getText().contains(".com")){
    JOptionPane.showMessageDialog(vista, "Correo no valido");
}
else
//3- Contraseña contenga mas de 6 caracteres
if (vista.txtContraseña.getText().length() < 6 ){
    JOptionPane.showMessageDialog(vista, "La contraseña es muy corta");
}

//Edad
try {
    int edadNumerica  = Integer.parseInt(vista.txtEdad.getText());
    
}catch(Exception ex){
JOptionPane.showMessageDialog(vista, "Ingrese numeros");
return;
}



    int edad  = Integer.parseInt(vista.txtEdad.getText());
    if (edad<1 || edad>100) {
    JOptionPane.showMessageDialog(vista, "La edad no es valida");

}


    }
}



    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }
}

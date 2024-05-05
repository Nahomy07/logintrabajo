package org.nahomy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        JFrame frame = new JFrame();

        frame.setSize(300, 300);
        frame.setTitle("Inicio de sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        JLabel label = new JLabel("Nombre");
        label.setBounds(0,30,60,60);
        JTextField nombre = new JTextField(30);
        nombre.setBounds(60,45,200,25);


        JLabel label1 = new JLabel("Contraseña");
        label1.setBounds(0,85,60,60);
        JPasswordField contraseña = new JPasswordField(30);
        contraseña.setBounds(60,100,200,25);


        JButton enviarButton = new JButton("Enviar");
        enviarButton.setBounds(100,180,80,40);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                char []contraseñaCaracteres = contraseña.getPassword();
                String contraseña = new String(contraseñaCaracteres);
                String nombre1 = nombre.getText();

                if (nombre1.equals("Nahomy") && contraseña.equals("12345678"))
                {
                    JOptionPane.showMessageDialog(null, "Envio exitoso");
                    new Proyecto();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(label);
        frame.add(nombre);
        frame.add(label1);
        frame.add(contraseña);
        frame.add(enviarButton);


        URL rutaImagen = App.class.getResource("/RiAccountCircleFill.png");
        ImageIcon image = new ImageIcon(rutaImagen);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);


//        new Proyecto();


    }
}

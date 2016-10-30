/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

/**
 *
 * @author Alumno
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * Interfaz para nuestra calculadora basica
 * 
 * @author:  emmanuel 
 * @version:  1.0 
 * @date: 06-09-2015 
 */
public class Cliente extends JFrame {


	private static final long serialVersionUID = 1583724102189855698L;

    static String getText(String ip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	
	JTextField ip , puerto , instru;
        
        JButton Dale;
        

	double resultado;

	String operacion;

	boolean nuevaOperacion = true;


	public Cliente() {
		super();
		setSize(400, 500);
		setTitle("Cliente");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());
                setBackground(Color.CYAN);

		ip = new JTextField("", 20);
		ip.setBorder(BorderFactory.createLineBorder(Color.black));
		ip.setFont(new Font("Arial", Font.BOLD, 25));
		ip.setHorizontalAlignment(JTextField.RIGHT);
		ip.setEditable(true);
		ip.setBackground(Color.WHITE);
		panel.add("North", ip);
              
                
                
                puerto = new JTextField("", 20);
		puerto.setBorder(BorderFactory.createLineBorder(Color.black));
		puerto.setFont(new Font("Arial", Font.BOLD, 25));
		puerto.setHorizontalAlignment(JTextField.LEFT);
		puerto.setEditable(true);
		puerto.setBackground(Color.WHITE);
		panel.add("South", puerto);
                
                Dale = new JButton("Aqui");
                Dale.setBorder(new EmptyBorder(4, 4, 4, 4));
		Dale.setFont(new Font("ALGERIAN", Font.BOLD, 15));
		Dale.setHorizontalAlignment(JTextField.CENTER);
		Dale.setBackground(Color.WHITE);
		panel.add("Center", Dale);

        }
        
            
        
        public void mouseReleased(MouseEvent evt) {
				JButton Dale = (JButton) evt.getSource();
				numeroPulsado(Dale.getText());
        }
           
        private void numeroPulsado(String Dale) {
            if(Dale.equals("Aqui"))
		          JOptionPane.showMessageDialog(null, "Conexion:" );
            ip.getText();
            puerto.getText();
            
	}
        
        public String getIp(){
            return ip.getText();
        }
        
        public String getPuerto(){
            return puerto.getText();
        }
        
        



	}


package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Consulta {
	
	
	//JMENU
	
		JMenuBar menu;
		JMenu arquivo;
			JMenuItem sair;
		JMenu sobre;
			JMenuItem criadores;
	
	//Jlabel
	
	JLabel comando;
	
	//JTextField
	
	JTextField entrada;
	
	//jbutton
	JButton vai;
	JButton cancela;
	
	
	//FRAMES
			JFrame principal;
	
	

	Consulta() {
		//JMenu
		
		menu = new JMenuBar();
		menu.setBounds(0,0, 300, 25);
		arquivo = new JMenu("Arquivo");
			sair = new JMenuItem("Sair");
			arquivo.add(sair);
			sobre = new JMenu("Sobre");
			criadores = new JMenuItem("Criadores");
			sobre.add(criadores);
		menu.add(arquivo);
		menu.add(sobre);
				
				//Jlabel
				
				comando = new JLabel("Digite o código da camisa que deseja consultar");
				comando.setBounds(12, 40, 300, 20);
				
				//JTextField
				
				entrada = new JTextField();
				entrada.setBounds(20, 70, 250, 20);
				
				//jbutton
				vai = new JButton("Pesquisar");
				vai.setBounds(45, 98, 100, 30);
				cancela = new JButton("Cancelar");
				cancela.setBounds(150, 98, 100, 30);
				
				
				//FRAMES
						principal = new JFrame("CCT-Shirts");
						principal.setResizable(false);
						principal.setBounds(600, 250, 300, 170);
						principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						principal.getContentPane().setLayout(null);
						principal.getContentPane().add(menu);
						principal.getContentPane().add(comando);
						principal.getContentPane().add(entrada);
						principal.getContentPane().add(vai);
						principal.getContentPane().add(cancela);

						
						
						
						
						
						TrataEventos trata = new TrataEventos();
						vai.addActionListener(trata);
						cancela.addActionListener(trata);
						
						
						
						
						principal.setVisible(true);
				
	}
	
	private class TrataEventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource() == vai){
				// SEU CÓDIGO AKI!
					JOptionPane.showMessageDialog(null, "Informação qualquer da camisa");
					principal.setVisible(false);
					TelaPrincipal voltaInicio = new TelaPrincipal();
								
				}
				
				if(e.getSource() == cancela){
					principal.setVisible(false);
					TelaPrincipal voltaInicio = new TelaPrincipal();
					
				}
			
			
			
			
			
		}
		
	}

}

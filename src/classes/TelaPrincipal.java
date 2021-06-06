package classes;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

	//BOTOES
	
	JButton adicionar;
	JButton remover;
	JButton consultar;
	JButton editar;
	
	//JMENU
	
	JMenuBar menu;
	JMenu arquivo;
		JMenuItem sair;
	JMenu sobre;
		JMenuItem criadores;
	
	// LABELS
	JLabel bemVindos;
	JLabel opcoes;
	
	//JPANEL
	JPanel painelBotoes;
	JPanel painelTextos;
	
	
	//JFRAME
	
	JFrame principal;
	
	
	
	
		TelaPrincipal(){
			
		// BOTOES
	
	adicionar = new JButton("Adicionar Camiseta");
	remover = new JButton("Remover Camiseta");
	consultar = new JButton("Consultar Camiseta");
	// A OPÇÃO CONSULTA PODE SER MOSTRADA NO JOPTIONPANE
	editar = new JButton("Editar Camiseta");
	

	
	
	//JMenu
	
		menu = new JMenuBar();
		menu.setBounds(0,0, 200, 25);
		arquivo = new JMenu("Arquivo");
			sair = new JMenuItem("Sair");
			arquivo.add(sair);
			sobre = new JMenu("Sobre");
			criadores = new JMenuItem("Criadores");
			sobre.add(criadores);
		menu.add(arquivo);
		menu.add(sobre);
	
	
	
	
	
	//JLabel
		
		bemVindos = new JLabel("Bem Vindo!");
		bemVindos.setBounds(-3, 140, 200, 10);
		bemVindos.setHorizontalAlignment(SwingConstants.CENTER);
		opcoes = new JLabel("Escolha uma opção abaixo");	
		opcoes.setBounds(-3, 155, 200, 15);
		opcoes.setHorizontalAlignment(SwingConstants.CENTER);

		
		
			// EXCLUIR!!!!//
		JLabel gif = new JLabel(new ImageIcon("Bode.gif"));
		gif.setBounds(-3, 0, 200, 150);		
			// EXCLUIR!!!!//

		
	
		// PANEL DOS BOTOES
		
		painelBotoes = new JPanel();
		painelBotoes.setBounds(-3, 173, 200, 150);
		painelBotoes.setLayout(new GridLayout(4, 1, 3, 3));
		painelBotoes.add(adicionar);		
		painelBotoes.add(remover);
		painelBotoes.add(consultar);
		painelBotoes.add(editar);
		
		//PANEL DOS TEXTOS
		
		painelTextos = new JPanel();
		painelTextos.setLayout(new GridLayout(2, 1));
		painelTextos.add(bemVindos);
		painelTextos.add(opcoes);
		painelTextos.setSize(200, 300);
		
		
		
		
		
		
		//FRAMES
		principal = new JFrame("CCT-Shirts");
		principal.setResizable(false);
		principal.setBounds(550, 230, 200, 350);
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.getContentPane().setLayout(null);
		principal.getContentPane().add(menu);
		principal.getContentPane().add(gif);
		principal.getContentPane().add(bemVindos);
		principal.getContentPane().add(opcoes);
		principal.getContentPane().add(painelBotoes);
		
		
		
		TrataEvento trata = new TrataEvento();
		adicionar.addActionListener(trata);
		remover.addActionListener(trata);
		consultar.addActionListener(trata);
		editar.addActionListener(trata);		
		sair.addActionListener(trata);
		criadores.addActionListener(trata);
		
		
		
		
		principal.setVisible(true);
		
				
	}
		
		public static void main(String [] args){
			
			TelaPrincipal programa = new TelaPrincipal();
			
		}
	
		
		
		private class TrataEvento implements ActionListener{
			
		

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == adicionar){
				AdicionarCamiseta adiciona = new AdicionarCamiseta();
				principal.setVisible(false);
				
			}
			
			if(e.getSource() == editar){
				ConsultaEdicao consultaPraEdicao = new ConsultaEdicao();
				principal.setVisible(false);
				
			}
			
			if(e.getSource() == remover){
				RemoverCamiseta remove = new RemoverCamiseta();
				principal.setVisible(false);
				
			}
			
			if(e.getSource() == consultar){
				Consulta consuta = new Consulta();
				principal.setVisible(false);
				
			}
			
			if(e.getSource() == sair){
				System.exit(0);
			}
			
			if(e.getSource() == criadores){
				String info = "CCT-Shirt 1.0.1\nCriadores: Gabriel Abreu, Felipe Rios e Edmilton Cabral";
				JOptionPane.showMessageDialog(null,info);
			}
			
			
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
}

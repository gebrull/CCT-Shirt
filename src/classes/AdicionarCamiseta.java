package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdicionarCamiseta extends JFrame {

	//JMENU
	
		JMenuBar menu;
		JMenu arquivo;
			JMenuItem sair;
		JMenu sobre;
			JMenuItem criadores;

	// BOTOES
	JButton adicionar;
	JButton cancelar;

	// LABELs

	JLabel codigo;
	JLabel tamanho;
	JLabel cor;

	// CAMPOS DE TEXTO

	JTextField numero;

	// MULTIPLA ESCOLHA

	JRadioButton tamPP;
	JRadioButton tamP;
	JRadioButton tamM;
	JRadioButton tamG;
	JRadioButton tamGG;

	// COMBOBOX CORES

	JComboBox OpcoesCores;

	// PANELs

	JPanel painelBotoes;
	JPanel painelLabels;
	JPanel painelTexto;
	JPanel painelTamanhos;
	JPanel painelCores;

	// JFRAME
	JFrame janela;

	AdicionarCamiseta() {

		//JMenu
		
		menu = new JMenuBar();
		menu.setBounds(0,0, 500, 25);
		arquivo = new JMenu("Arquivo");
			sair = new JMenuItem("Sair");
			arquivo.add(sair);
			sobre = new JMenu("Sobre");
			criadores = new JMenuItem("Criadores");
			sobre.add(criadores);
		menu.add(arquivo);
		menu.add(sobre);

		// BOTOES

		adicionar = new JButton("Finalizar Adição");
		adicionar.setBounds(263, 437, 128, 23);
		cancelar = new JButton("Cancelar Adição");
		cancelar.setBounds(125, 437, 128, 23);

		// LABELs

		codigo = new JLabel("Código da Camiseta:");
		codigo.setBounds(10, 60, 200, 15);
		tamanho = new JLabel("Tamanho da Camiseta:");
		tamanho.setBounds(10, 100, 200, 15);
		cor = new JLabel("Cor da Camiseta:");
		cor.setBounds(10, 140, 200, 15);

		// CAMPOS DE TEXTO

		numero = new JTextField(10);
		numero.setBounds(276, 60, 200, 20);

		// MULTIPLA ESCOLHA

		tamPP = new JRadioButton("PP");
		tamPP.setBounds(276, 100, 43, 23);
		tamP = new JRadioButton("P");
		tamP.setBounds(315, 100, 37, 23);
		tamM = new JRadioButton("M");
		tamM.setBounds(350, 100, 37, 23);
		tamG = new JRadioButton("G");
		tamG.setBounds(387, 100, 37, 23);
		tamGG = new JRadioButton("GG");
		tamGG.setBounds(420, 100, 43, 23);

		// COMBOBOX CORES

		String[] cores = { "Azul", "Verde", "Amarelo", "Roxo", "Vermelho",
				"Preto", "Branco" };
		OpcoesCores = new JComboBox(cores);
		OpcoesCores.setBounds(276, 140, 152, 20);

		// PANELs

		painelBotoes = new JPanel();
		painelBotoes.add(adicionar);
		painelBotoes.add(cancelar);

		painelLabels = new JPanel();
		painelLabels.add(codigo);
		painelLabels.add(tamanho);
		painelLabels.add(cor);

		painelTexto = new JPanel();
		painelTexto.add(numero);

		painelTamanhos = new JPanel();
		painelTamanhos.add(tamPP);
		painelTamanhos.add(tamP);
		painelTamanhos.add(tamM);
		painelTamanhos.add(tamG);
		painelTamanhos.add(tamGG);

		painelCores = new JPanel();
		painelCores.add(OpcoesCores);

		// FRAME

		janela = new JFrame();
		janela.setBounds(450, 150, 500, 500);
		janela.getContentPane().add(menu);
		janela.getContentPane().add(codigo);
		janela.getContentPane().add(tamanho);
		janela.getContentPane().add(cor);
		janela.getContentPane().add(numero);
		janela.getContentPane().add(tamPP);
		janela.getContentPane().add(tamP);
		janela.getContentPane().add(tamM);
		janela.getContentPane().add(tamG);
		janela.getContentPane().add(tamGG);
		janela.getContentPane().add(OpcoesCores);
		janela.getContentPane().add(adicionar);
		janela.getContentPane().add(cancelar);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(null);

		TrataEventos trata = new TrataEventos();
		adicionar.addActionListener(trata);
		cancelar.addActionListener(trata);

		janela.setVisible(true);

	}

	private class TrataEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == adicionar) {
				JOptionPane.showMessageDialog(null, "Camisa adicionada");
				janela.setVisible(false);
				TelaPrincipal voltaInicio = new TelaPrincipal();

			}
			
			if(e.getSource() == cancelar){
				janela.setVisible(false);
				TelaPrincipal voltaInicio = new TelaPrincipal();

				
			}

		}

	}

}

package view;

import java.awt.EventQueue;
import java.io.CharConversionException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import javax.sound.sampled.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class java11 {

	public JFrame frmOraes;
	static JTextPane txtHora;
	Calendar c1 = Calendar.getInstance();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws InterruptedException {

		java11 window = new java11();
		window.frmOraes.setVisible(true);

		int Musica = 0;
		String DiaTela;
		String HoraTela;

		while (true) {
			String txtHora2 = null;
			Calendar c1 = Calendar.getInstance();
			int hora = c1.get(Calendar.HOUR_OF_DAY);
			int minutos = c1.get(Calendar.MINUTE);
			int segundos = c1.get(Calendar.SECOND);
			int diaDS = c1.get(Calendar.DAY_OF_WEEK);
			System.out.println(HoraTela = "Hora: " + hora + ":" + minutos);
			System.out.println(DiaTela = "Dia: " + diaDS);

			hora = c1.get(Calendar.HOUR_OF_DAY);
			minutos = c1.get(Calendar.MINUTE);
			segundos = c1.get(Calendar.SECOND);

			if (minutos <= 9 && segundos <= 9) {
				txtHora.setText("Sistema OK!!!!  " + hora + ":0" + minutos + ":0" + segundos);
			} else if (minutos <= 9) {
				txtHora.setText("Sistema OK!!!!  " + hora + ":0" + minutos + ":" + segundos);
			} else if (segundos <= 9) {
				txtHora.setText("Sistema OK!!!!  " + hora + ":" + minutos + ":0" + segundos);
			} else {
				txtHora.setText("Sistema OK!!!!  " + hora + ":" + minutos + ":" + segundos);
			}

			if (minutos <= 9) {
				txtHora2 = "Sistema OK!!!!  " + hora + ":0" + minutos;

			} else {
				txtHora2 = "Sistema OK!!!!  " + hora + ":" + minutos;
			}

			// DOMINGO Ã€S 8:00
			if (diaDS == 1 && hora == 8 && minutos == 0) {
				Musica = 1;
				txtHora.setText("ORAÇÃO DA MANHÃ DE DOMINGO");
				AudioAcerto(Musica);

			}
			// DOMINGO Ã€S 18:00
			else if (diaDS == 1 && hora == 18 && minutos == 0) {
				Musica = 2;
				txtHora.setText("ORAÇÃO DA NOITE DE DOMINGO");
				AudioAcerto(Musica);
			}
			// SEGUNDA Ã€S 8:00
			else if (diaDS == 2 && hora == 8 && minutos == 0) {
				Musica = 3;
				txtHora.setText("ORAÇÃO DA MANHÃ DE SEGUNDA");
				AudioAcerto(Musica);
			}
			// SEGUNDA Ã€S 18:00
			else if (diaDS == 2 && hora == 18 && minutos == 0) {
				Musica = 4;
				txtHora.setText("ORAÇÃO DA NOITE DE SEGUNDA");
				AudioAcerto(Musica);
			}
			// TERÃ‡A Ã€S 8:00
			else if (diaDS == 3 && hora == 8 && minutos == 0) {
				Musica = 5;
				txtHora.setText("ORAÇÃO DA MANHÃ DE TERÇA");
				AudioAcerto(Musica);
			}
			// TERÃ‡A Ã€S 18:00
			else if (diaDS == 3 && hora == 18 && minutos == 0) {
				Musica = 6;
				txtHora.setText("ORAÇÃO DA NOITE DE TERÇA");
				AudioAcerto(Musica);
			}
			// QUARTA Ã€S 8:00
			else if (diaDS == 4 && hora == 8 && minutos == 0) {
				Musica = 7;
				txtHora.setText("ORAÇÃO DA MANHÃ DE QUARTA");
				AudioAcerto(Musica);
			}
			// QUARTA Ã€S 18:00
			else if (diaDS == 4 && hora == 18 && minutos == 0) {
				Musica = 8;
				txtHora.setText("ORAÇÃO DA NOITE DE QUARTA");
				AudioAcerto(Musica);
			}
			// QUINTA Ã€S 8:00
			else if (diaDS == 5 && hora == 8 && minutos == 0) {
				Musica = 9;
				txtHora.setText("ORAÇÃO DA MANHÃ DE QUINTA");
				AudioAcerto(Musica);
			}
			// QUINTA Ã€S 18:00
			else if (diaDS == 5 && hora == 18 && minutos == 0) {
				Musica = 10;
				txtHora.setText("ORAÇÃO DA NOITE DE QUINTA");
				AudioAcerto(Musica);
			}
			// SEXTA Ã€S 8:00
			else if (diaDS == 6 && hora == 8 && minutos == 0) {
				txtHora.setText("ORAÇÃO DA MANHÃ DE SEXTA");
				Musica = 11;
				AudioAcerto(Musica);
			}
			// SEXTA Ã€S 18:00
			else if (diaDS == 6 && hora == 18 && minutos == 0) {
				Musica = 12;
				txtHora.setText("ORAÇÃO DA NOITE DE SEXTA");
				AudioAcerto(Musica);
			}
			// SÃBADO Ã€S 8:00
			else if (diaDS == 7 && hora == 8 && minutos == 0) {
				Musica = 13;
				txtHora.setText("ORAÇÃO DA MANHÃ DE SÁBADO");
				AudioAcerto(Musica);
			}
			// SÃBADO Ã€S 18:00
			else if (diaDS == 7 && hora == 18 && minutos == 0) {
				Musica = 14;
				txtHora.setText("ORAÇÃO DA NOITE DE SÁBADO");
				AudioAcerto(Musica);
			}

			Thread.sleep(1000);
		}
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public java11() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private JTextPane initialize() {
		frmOraes = new JFrame();
		frmOraes.setTitle("ORAÇÕES");
		frmOraes.getContentPane().setForeground(Color.BLACK);
		frmOraes.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucap\\eclipse-workspace\\Media Orações\\Pray.png"));
		frmOraes.setResizable(false);
		frmOraes.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmOraes.setBounds(100, 100, 450, 300);
		frmOraes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOraes.setLocationRelativeTo(null);
		frmOraes.getContentPane().setLayout(null);

		int hora = c1.get(Calendar.HOUR_OF_DAY);
		int minutos = c1.get(Calendar.MINUTE);

		txtHora = new JTextPane();
		txtHora.setToolTipText("");
		txtHora.setForeground(Color.BLACK);
		txtHora.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtHora.setEditable(false);
		txtHora.setBackground(Color.LIGHT_GRAY);
		txtHora.setBounds(39, 96, 370, 110);
		if (minutos <= 9) {
			txtHora.setText("Sistema OK!!!!  " + hora + ":0" + minutos);
		} else {
			txtHora.setText("Sistema OK!!!!  " + hora + ":" + minutos);
		}

		frmOraes.getContentPane().add(txtHora);

		JTextPane txtpnProgramaIniciado = new JTextPane();
		txtpnProgramaIniciado.setEditable(false);
		txtpnProgramaIniciado.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		txtpnProgramaIniciado.setText("PROGRAMA INICIADO");
		txtpnProgramaIniciado.setBackground(Color.LIGHT_GRAY);
		txtpnProgramaIniciado.setBounds(71, 21, 335, 64);
		frmOraes.getContentPane().add(txtpnProgramaIniciado);

		return txtHora;
	}

	public static void AudioAcerto(int Musica) {
		try {
			// O arquivo de áudio necessita ser WAV
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("C:/FFOutput/" + Musica + ".wav").getAbsoluteFile());
			// .getAudioInputStream(new File("/home/celso/Oracoes/" + Musica +
			// ".wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
			clip.stop();

		} catch (Exception ex) {
			Thread.sleep(2000);
			txtHora.setText("Erro ao executar SOM!" + "\n" + ex.toString());
			Thread.sleep(7000);
		}

		finally {
			return;
		}
	}
}
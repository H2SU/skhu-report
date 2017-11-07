package thebeats;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import thebeats.Main;

public class Beat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exit.png")); 


	private Image background = new ImageIcon(Main.class.getResource("../images/intro background.png")).getImage(); 

	private JButton exitButton = new JButton(exitButtonBasicImage);// ������ ��ư ����

	private int mouseX, mouseY; // ���α׷� ���� ���콺�� x,y��ǥ

	private boolean isMainScreen = false; // ó���� ����ȭ���� �ƴ� ����ȭ���̱� ������ false������ ����

	public Beat() {
		setUndecorated(true);
		setTitle("The Beats"); // ������ �̸� ����
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// ����� �̿��Ͽ� ��ü����â ũ�⼳��
		setResizable(false);// �� �� ������� ����â�� ����ڰ� ���Ƿ� ������ �� ����
		setLocationRelativeTo(null);// ����â�� ��ǻ�� ���߾ӿ� ��ġ�ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ������ ���������� ���α׷��� �����ϵ���
		// ����
		setVisible(true);// ����â�� ȭ�鿡 ��µǵ��� ���� default�� false
		setBackground(new Color(0, 0, 0, 0)); // paintComponents(g)�� ���� �� �����
		// ������� �ǵ��� ����
		setLayout(null);// ��ư�̳� JLabel�� ���� �� �� ��ġ�� ���̵��� ��
	}

	public void paint(Graphics g) { //JFrame�� ��ӹ��� Ŭ�������� ���� ù��°�� ȭ���� �׷��ִ� �޼ҵ� screenDraw�Լ��� �̿��Ͽ� �׷���
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); //����� ���� ũ��� �̹����� ���� �ڿ� ����screenImage�� �־���
		screenGraphic = screenImage.getGraphics();//��ũ���̹����� �̿��ؼ� �׷����� ����
		screenDraw(screenGraphic);//��ũ�� �׷��ȿ� �׸��� �׷���
		g.drawImage(screenImage, 0, 0, null);//��ũ���̹����� (0,0)��ġ�� �׷���
	}

	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null); //background�̹����� ��ü(��ũ���̹���)�� �׷���
		if(isMainScreen) //����ȭ���϶��� Ư���� �̹��� �׷���
		{

		}
		paintComponents(g);//JLabel���� ���� JFrame ���� �߰��ϸ� �׷��� �׻� ������ ���� �׸��� ��� add()�� ���� �׷���
		this.repaint();//�ٽ� paint()�� �ҷ��� ��üȭ�� �̹����� �ż������� ���α׷��� ����Ǵ� �������� �׷���


		//������ ��ư
		exitButton.setBounds(1170, 0, 120, 60);//������ ��ư�� ��ġ�� ũ�⼳�� �޴����� ���� �����ʿ� ��ġ
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false); //������ ���·� �̹����� �������� ����
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) { //�������ư ���� ���콺�� �ö���� ���� �̹���
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); //���콺 Ŀ���� �հ���������� ����

			}
			@Override
			public void mouseExited(MouseEvent e) {//�������ư ���� ���콺�� ������ ���� �̹���
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); //���콺 Ŀ���� default�� ����
			}
			@Override
			public void mousePressed(MouseEvent e) { //�������ư�� ���콺�� ������ �� �̺�Ʈ

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {

				} //������ �����ڸ��� ���α׷��� ������� �ʰ� 1���ִٰ� ����ǵ��� ����
				System.exit(0); //�ش� ���α׷� ��ü�� ����
			}
		});
		add(exitButton); //�������ư �߰�
	}

}
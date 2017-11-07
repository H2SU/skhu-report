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

	private JButton exitButton = new JButton(exitButtonBasicImage);// 나가기 버튼 정의

	private int mouseX, mouseY; // 프로그램 내의 마우스의 x,y좌표

	private boolean isMainScreen = false; // 처음엔 메인화면이 아닌 시작화면이기 때문에 false값으로 설정

	public Beat() {
		setUndecorated(true);
		setTitle("The Beats"); // 게임의 이름 설정
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 상수를 이용하여 전체게임창 크기설정
		setResizable(false);// 한 번 만들어진 게임창을 사용자가 임의로 변경할 수 없음
		setLocationRelativeTo(null);// 게임창이 컴퓨터 정중앙에 위치하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 게임을 종료했을때 프로그램도 종료하도록
		// 설정
		setVisible(true);// 게임창이 화면에 출력되도록 설정 default는 false
		setBackground(new Color(0, 0, 0, 0)); // paintComponents(g)를 했을 때 배경이
		// 흰색으로 되도록 설정
		setLayout(null);// 버튼이나 JLabel을 했을 때 그 위치에 놓이도록 함
	}

	public void paint(Graphics g) { //JFrame을 상속받은 클래스에서 가장 첫번째로 화면을 그려주는 메소드 screenDraw함수를 이용하여 그려줌
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); //상수로 정한 크기로 이미지를 만든 뒤에 변수screenImage에 넣어줌
		screenGraphic = screenImage.getGraphics();//스크린이미지를 이용해서 그래픽을 얻어옴
		screenDraw(screenGraphic);//스크린 그래픽에 그림을 그려줌
		g.drawImage(screenImage, 0, 0, null);//스크린이미지를 (0,0)위치에 그려줌
	}

	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null); //background이미지를 전체(스크린이미지)에 그려줌
		if(isMainScreen) //메인화면일때의 특별한 이미지 그려줌
		{

		}
		paintComponents(g);//JLabel같은 것을 JFrame 내에 추가하면 그려줌 항상 고정된 것을 그릴때 사용 add()를 통해 그려줌
		this.repaint();//다시 paint()를 불러옴 전체화면 이미지를 매순간마다 프로그램이 종료되는 순간까지 그려줌


		//나가기 버튼
		exitButton.setBounds(1170, 0, 120, 60);//나가기 버튼의 위치와 크기설정 메뉴바의 가장 오른쪽에 위치
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false); //생각한 형태로 이미지가 나오도록 설정
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) { //나가기버튼 위에 마우스가 올라왔을 때의 이미지
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); //마우스 커서가 손가락모양으로 변경

			}
			@Override
			public void mouseExited(MouseEvent e) {//나가기버튼 위에 마우스가 나갔을 때의 이미지
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); //마우스 커서가 default로 적용
			}
			@Override
			public void mousePressed(MouseEvent e) { //나가기버튼을 마우스가 눌렀을 때 이벤트

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {

				} //음악이 나오자마자 프로그램이 종료되지 않고 1초있다가 종료되도록 설정
				System.exit(0); //해당 프로그램 자체가 종료
			}
		});
		add(exitButton); //나가기버튼 추가
	}

}
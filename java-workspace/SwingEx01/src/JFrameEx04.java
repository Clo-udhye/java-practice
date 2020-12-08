import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameEx04 extends JFrame {
	private JPanel contentPane;
	
	public JFrameEx04() {
		// TODO Auto-generated constructor stub
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1024, 768);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	// margin
		this.setContentPane(contentPane); 		// JFrame에 contentPane 부착
		
		contentPane.setBackground(Color.GREEN);	//배경색 설정
		
		// LayoutManager - layout
		// null (좌표 레이아웃)
		contentPane.setLayout(null);
		
		// widget 
		JButton btn1 = new JButton("new button");
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameEx04 frame = new JFrameEx04();
		frame.setVisible(true);
	}

}

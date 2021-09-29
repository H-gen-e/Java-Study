package ch03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoFrame extends JFrame implements ActionListener {

	private JButton button;
	LottoPanel lottonPanel;
	LottoNumber lottoNumber;
	int[] lotto = new int[LottoNumber.LOTTO_NUMBER_SIZE];

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�ζǹ�ȣ ������");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.button = new JButton("++ �ζǹ�ȣ �����ϱ� ++");
		this.lottonPanel = new LottoPanel();
		this.lottoNumber = new LottoNumber();
	}

	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.gray);

		add(button, BorderLayout.NORTH);
		add(lottonPanel, BorderLayout.CENTER);
	}

	private void addEventListener() {
		this.button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.lotto = this.lottoNumber.getLottoNumber();
		repaint();
	}

	private class LottoPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			Font font = new Font("����ü", Font.BOLD, 20);
			g.setFont(font);

			if (lotto[0] == 0) {
				g.drawString("�ζ� ��ư�� Ŭ���ϼ���", 180, 180);
				return;
			}

			int xPosition = 150;

			for (int i = 0; i < lotto.length; i++) {
				g.drawString(lotto[i] + "", xPosition, 150);
				xPosition += 50;
			}

		}
	}

}

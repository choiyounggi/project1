package project.custom.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import project.custom.panel.panelBlackDelete;
import project.custom.panel.panelBlackIn;
import project.custom.panel.panelCustomCheck;
import project.custom.panel.panelCustomDelete;
import project.custom.panel.panelSearch;
import project.custom.panel.panleHome;

public class Frame01 extends JFrame {

	public static JPanel contentPane;
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/abc.jpg")).getImage().getScaledInstance(249,
			144, Image.SCALE_SMOOTH);
	private project.custom.panel.panelInput panelInput;
	private project.custom.panel.panelSearch panelSearch;
	private project.custom.panel.panelCustomCheck panelCustomCheck;
	private project.custom.panel.panelUpdate panelUpdate;
	private project.custom.panel.panelCustomDelete panelCustomDelete;
	private project.custom.panel.panelBlackIn panelBlackIn;
	private project.custom.panel.panelBlackDelete panelBlackDelete;

	
	private panleHome panelHome;
	JPanel panelMenu = new JPanel();
	JLabel panleLogo;
	JPanel panelInputs = new JPanel(); // 회원등록 패널
	JLabel lblInput = new JLabel("Membership registration"); // 회원 등록 라벨

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame01 frame = new Frame01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame01() {

//		new CustomAndBlack_Table_Create("start");
//		new CustomAndBlack_Table_Delete("Start");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1100, 600);
//		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panelHome = new panleHome();
		panelInput = new project.custom.panel.panelInput();
		panelSearch = new project.custom.panel.panelSearch();
		panelCustomCheck = new panelCustomCheck();
		panelUpdate = new project.custom.panel.panelUpdate();
		panelCustomDelete = new panelCustomDelete();
		panelBlackIn = new panelBlackIn();
		panelBlackDelete = new panelBlackDelete();
	


		panelMenu.setBackground(new Color(255, 165, 0));
		panelMenu.setBounds(2, 2, 249, 557);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);

		panleLogo = new JLabel("");
		panleLogo.setLabelFor(panleLogo);
		panleLogo.setBounds(0, 0, 249, 144);
		panleLogo.setIcon(new ImageIcon(img_logo));
		panelMenu.add(panleLogo);

		panelInputs.addMouseListener(new PanelButtonMouseAdapter(panelInputs) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelInput);
				panelInput.InputCleanSet();
			}
		});
		panelInputs.setBackground(new Color(255, 165, 0));
		panelInputs.setBounds(0, 214, 249, 40);
		panelMenu.add(panelInputs);
		panelInputs.setLayout(null);

		lblInput.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		lblInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput.setBounds(12, 10, 225, 20);
		panelInputs.add(lblInput);

		JPanel panelSearchs = new JPanel(); // 등록된 회원 조회 패널
		panelSearchs.addMouseListener(new PanelButtonMouseAdapter(panelSearchs) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelSearch);
				new panelSearch();
			}
		});
		panelSearchs.setLayout(null);
		panelSearchs.setBackground(new Color(255, 165, 0));
		panelSearchs.setBounds(0, 254, 249, 40);
		panelMenu.add(panelSearchs);

		JLabel lblSearch = new JLabel("Registered Membership Lookup"); // 등록된 회원 조회 라벨
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		lblSearch.setBounds(12, 10, 225, 20);
		panelSearchs.add(lblSearch);

		JPanel panelCustomChecks = new JPanel(); // 회원 구매내역 패널
		panelCustomChecks.addMouseListener(new PanelButtonMouseAdapter(panelCustomChecks) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCustomCheck);
				panelCustomCheck.textCardSearch.setText("");
				panelCustomCheck.textNameSearch.setText("");
				for (int i = panelCustomCheck.dtm.getRowCount() - 1; i >= 0; i--) {
					panelCustomCheck.dtm.removeRow(i);
				}
			}
		});
		panelCustomChecks.setLayout(null);
		panelCustomChecks.setBackground(new Color(255, 165, 0));
		panelCustomChecks.setBounds(0, 294, 249, 40);
		panelMenu.add(panelCustomChecks);

		JLabel IblCustomCheck = new JLabel("Member purchase details check"); // 회원 구매내역 라벨
		IblCustomCheck.setHorizontalAlignment(SwingConstants.CENTER);
		IblCustomCheck.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		IblCustomCheck.setBounds(12, 10, 225, 20);
		panelCustomChecks.add(IblCustomCheck);

		JPanel panelUpdates = new JPanel(); // 회원 정보 수정 패널
		panelUpdates.addMouseListener(new PanelButtonMouseAdapter(panelUpdates) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelUpdate);
				panelUpdate.UpdateCleanSet();
			}
		});
		panelUpdates.setLayout(null);
		panelUpdates.setBackground(new Color(255, 165, 0));
		panelUpdates.setBounds(0, 334, 249, 40);
		panelMenu.add(panelUpdates);

		JLabel lblUpdate = new JLabel("Modify Member Information"); // 회원 정보 수정 라벨
		lblUpdate.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdate.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		lblUpdate.setBounds(12, 10, 225, 20);
		panelUpdates.add(lblUpdate);

		JPanel panelCustomDeletes = new JPanel(); // 회원 삭제 패널
		panelCustomDeletes.addMouseListener(new PanelButtonMouseAdapter(panelCustomDeletes) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCustomDelete);
				panelCustomDelete.textArea.setText("");
				
			}
		});
		panelCustomDeletes.setLayout(null);
		panelCustomDeletes.setBackground(new Color(255, 165, 0));
		panelCustomDeletes.setBounds(0, 374, 249, 40);
		panelMenu.add(panelCustomDeletes);

		JLabel lblCustomDelete = new JLabel("Delete Member"); // 회원 삭제 라벨
		lblCustomDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomDelete.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		lblCustomDelete.setBounds(12, 10, 225, 20);
		panelCustomDeletes.add(lblCustomDelete);

		JPanel panelBlackIns = new JPanel();
		panelBlackIns.addMouseListener(new PanelButtonMouseAdapter(panelBlackIns) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelBlackIn);
				panelBlackIn.textcard.setText("");
				panelBlackIn.reason.setText("");
				panelBlackIn.textArea.setText("");
			}
		});
		panelBlackIns.setLayout(null);
		panelBlackIns.setBackground(new Color(255, 165, 0));
		panelBlackIns.setBounds(0, 414, 249, 40);
		panelMenu.add(panelBlackIns);

		JLabel lblBlackIn = new JLabel("Blacklist Registration");
		lblBlackIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlackIn.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		lblBlackIn.setBounds(12, 10, 225, 20);
		panelBlackIns.add(lblBlackIn);

		JPanel panelBlackDeletes = new JPanel();
		panelBlackDeletes.addMouseListener(new PanelButtonMouseAdapter(panelBlackDeletes) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelBlackDelete);
//				new panelBlackDelete();			
			}
		});
		panelBlackDeletes.setLayout(null);
		panelBlackDeletes.setBackground(new Color(255, 165, 0));
		panelBlackDeletes.setBounds(0, 454, 249, 40);
		panelMenu.add(panelBlackDeletes);

		JLabel lblBlackDelete = new JLabel("Release Blacklist");
		lblBlackDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlackDelete.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		lblBlackDelete.setBounds(12, 10, 225, 20);
		panelBlackDeletes.add(lblBlackDelete);

		JPanel panelHomes = new JPanel();
		panelHomes.addMouseListener(new PanelButtonMouseAdapter(panelHomes) {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				menuClicked(panelHomes);
			}
		});
		panelHomes.setLayout(null);
		panelHomes.setBackground(new Color(255, 165, 0));
		panelHomes.setBounds(0, 174, 249, 40);
		panelMenu.add(panelHomes);

		JLabel lblHome = new JLabel("Home");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("휴먼편지체", Font.BOLD, 14));
		lblHome.setBounds(12, 10, 225, 20);
		panelHomes.add(lblHome);

		JPanel panelMainContent =new JPanel();
		panelMainContent.setBounds(265, 15, 807, 533);
		contentPane.add(panelMainContent);
		panelMainContent.setLayout(null);

		panelMainContent.add(panelInput);
		panelMainContent.add(panelCustomCheck);
		panelMainContent.add(panelUpdate);
		panelMainContent.add(panelSearch);
		panelMainContent.add(panelCustomDelete);
		panelMainContent.add(panelBlackIn);
		panelMainContent.add(panelBlackDelete);
		panelMainContent.add(panelHome);

		menuClicked(panelHome);

	}

	public void menuClicked(JPanel panel) {
		panelInput.setVisible(false);
		panelSearch.setVisible(false);
		panelCustomCheck.setVisible(false);
		panelUpdate.setVisible(false);
		panelCustomDelete.setVisible(false);
		panelBlackIn.setVisible(false);
		panelBlackDelete.setVisible(false);
		panelHome.setVisible(true);

		panel.setVisible(true);
	}

	private class PanelButtonMouseAdapter extends MouseAdapter {
		JPanel panel;

		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(255, 211, 5));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(255, 165, 0));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(244, 164, 96));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(255, 165, 0));
		}

	}
}

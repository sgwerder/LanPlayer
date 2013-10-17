package lanplayer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ControlPanel extends JPanel {

	private JTextField skipField;
	private JButton btnSetSkip;
	private JCheckBox chckbxShuffle;
	private JButton btnDeleteTrack;
	public JButton getBtnDeleteTrack() {
		return btnDeleteTrack;
	}

	private JComboBox<Integer> ratingBox;
	
	public ControlPanel() {
		initialize();
	}

	private void initialize() {
		GridBagLayout gbl_controlPanel = new GridBagLayout();
		gbl_controlPanel.columnWidths = new int[]{0, 0};
		gbl_controlPanel.rowHeights = new int[]{0, 0};
		gbl_controlPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_controlPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gbl_controlPanel);
		
		JPanel plControlPanel = new JPanel();
		plControlPanel.setBorder(new TitledBorder(null, "Playlist Control", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_plControlPanel = new GridBagConstraints();
		gbc_plControlPanel.insets = new Insets(5, 5, 0, 5);
		gbc_plControlPanel.fill = GridBagConstraints.BOTH;
		gbc_plControlPanel.gridx = 0;
		gbc_plControlPanel.gridy = 0;
		add(plControlPanel, gbc_plControlPanel);
		GridBagLayout gbl_plControlPanel = new GridBagLayout();
		gbl_plControlPanel.columnWidths = new int[]{60, 0, 30, 0, 0, 30, 0, 30, 0, 0};
		gbl_plControlPanel.rowHeights = new int[]{0, 0};
		gbl_plControlPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_plControlPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		plControlPanel.setLayout(gbl_plControlPanel);
		
		skipField = new JTextField();
		GridBagConstraints gbc_skipField = new GridBagConstraints();
		gbc_skipField.insets = new Insets(5, 5, 5, 5);
		gbc_skipField.fill = GridBagConstraints.HORIZONTAL;
		gbc_skipField.gridx = 0;
		gbc_skipField.gridy = 0;
		plControlPanel.add(skipField, gbc_skipField);
		skipField.setColumns(5);
		
		btnSetSkip = new JButton("Set Skips Needed");
		btnSetSkip.setEnabled(false);
		GridBagConstraints gbc_btnSetSkip = new GridBagConstraints();
		gbc_btnSetSkip.insets = new Insets(5, 5, 5, 5);
		gbc_btnSetSkip.gridx = 1;
		gbc_btnSetSkip.gridy = 0;
		plControlPanel.add(btnSetSkip, gbc_btnSetSkip);
		
		JLabel filler1 = new JLabel(" ");
		GridBagConstraints gbc_filler1 = new GridBagConstraints();
		gbc_filler1.insets = new Insets(5, 5, 5, 5);
		gbc_filler1.gridx = 2;
		gbc_filler1.gridy = 0;
		plControlPanel.add(filler1, gbc_filler1);
		
		JLabel lblOnlyPlayTracks = new JLabel("Play Tracks Rated Above:");
		GridBagConstraints gbc_lblOnlyPlayTracks = new GridBagConstraints();
		gbc_lblOnlyPlayTracks.insets = new Insets(5, 5, 5, 5);
		gbc_lblOnlyPlayTracks.anchor = GridBagConstraints.EAST;
		gbc_lblOnlyPlayTracks.gridx = 3;
		gbc_lblOnlyPlayTracks.gridy = 0;
		plControlPanel.add(lblOnlyPlayTracks, gbc_lblOnlyPlayTracks);
		
		ratingBox = new JComboBox<Integer>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(5, 5, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 0;
		plControlPanel.add(ratingBox, gbc_comboBox);
		
		fillRatingBox();
		
		JLabel filler2 = new JLabel(" ");
		GridBagConstraints gbc_filler2 = new GridBagConstraints();
		gbc_filler2.insets = new Insets(5, 5, 5, 5);
		gbc_filler2.gridx = 5;
		gbc_filler2.gridy = 0;
		plControlPanel.add(filler2, gbc_filler2);
		
		chckbxShuffle = new JCheckBox("Shuffle");
		GridBagConstraints gbc_chckbxShuffle = new GridBagConstraints();
		gbc_chckbxShuffle.insets = new Insets(5, 5, 0, 5);
		gbc_chckbxShuffle.gridx = 6;
		gbc_chckbxShuffle.gridy = 0;
		plControlPanel.add(chckbxShuffle, gbc_chckbxShuffle);
		
		JLabel filler3 = new JLabel(" ");
		GridBagConstraints gbc_filler3 = new GridBagConstraints();
		gbc_filler3.insets = new Insets(5, 5, 5, 5);
		gbc_filler3.gridx = 7;
		gbc_filler3.gridy = 0;
		plControlPanel.add(filler3, gbc_filler3);
		
		btnDeleteTrack = new JButton("Delete Track");
		btnDeleteTrack.setEnabled(false);
		GridBagConstraints gbc_btnDeleteTrack = new GridBagConstraints();
		gbc_btnDeleteTrack.insets = new Insets(5, 5, 5, 5);
		gbc_btnDeleteTrack.gridx = 8;
		gbc_btnDeleteTrack.gridy = 0;
		plControlPanel.add(btnDeleteTrack, gbc_btnDeleteTrack);
	}
	
	private void fillRatingBox() {
		for(int i = 0; i <= 5; i++) {
			ratingBox.addItem(i);
		}
	}
	
}
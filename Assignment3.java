import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Assignment3 {

	public static void main(String [] args){
		
		JPanel panel= new JPanel();
		panel.add(new JLabel("Please select the type of your account"));
		DefaultComboBoxModel mode = new DefaultComboBoxModel();
		mode.addElement("Admin"); 
		mode.addElement("Student");
		mode.addElement("Staff"); 
		JComboBox box=new JComboBox(mode); 
		panel.add(box);
		String username, password, x, y; 
		int i=1;
		username="fionaliu"; password="cl2015"; 
		String a="Enter your username,(fionaliu)";
		String b="Invalid username. Enter your username,(fionaliu)";
		String c=""; 
		do{ if(i==1){ c=new String(a);}
		else{ c=new String(b); } 
		x= JOptionPane.showInputDialog(null,c);
		if(username.equals(x)){
			do{ y=JOptionPane.showInputDialog(null,"Enter your password. (cl2015)");
			if(y.equals(password)){
				JOptionPane.showConfirmDialog(null, panel, "Account", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				switch(box.getSelectedIndex()){ 
				case 0:JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file."); return; 
				case 1:JOptionPane.showMessageDialog(null,"Welcome Student! You can only read file."); return;
				case 2:JOptionPane.showMessageDialog(null,"Welcome Staff! You can update, read, add, delete file."); return; } }i++; }
			while(i<=3); 
			JOptionPane.showMessageDialog(null,"Your account has been locked, please contact the administrator to unlock your account."); return; } i++; }
		while(i<=3); 
		JOptionPane.showMessageDialog(null,"Your account has been locked, please contact the administrator to unlock your account."); 
		} 
	}

				
			
			
			
		
	
		
	


	
	

	 

	

	


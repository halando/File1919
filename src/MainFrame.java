import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame  extends JFrame{
    JPanel buttonPanel;
    JButton previousButton;
    JButton nextButton;
    
    public MainFrame() {
        this.initComponent();
        this.setComponent();
        this.setFrame();

       
    }
    private void initComponent(){
        this.buttonPanel = new JPanel();
        this.previousButton = new JButton("Előző");
        this.nextButton = new JButton("Következő");
    }
    private void setComponent(){
        this.buttonPanel.add(this.previousButton);
        this.buttonPanel.add(this.nextButton);

    }
    private void setFrame(){
        this.add(this.buttonPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);

    }
    public JPanel getButtonPanel() {
        return buttonPanel;
    }
    public JButton getPreviousButton() {
        return previousButton;
    }
    public JButton getNextButton() {
        return nextButton;
    }
    

}

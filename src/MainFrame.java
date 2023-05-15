import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame  extends JFrame{
    JPanel buttonPanel;
    JButton previousButton;
    JButton nextButton;
    InputPanel namePanel;
    InputPanel cityPanel;
    InputPanel addressPanel;
    InputPanel birthPanel;
    InputPanel salaryPanel;
  
    
    public MainFrame() {
        this.initComponent();
        this.setComponent();
        this.setFrame();

       
    }
    private void initComponent(){
        this.buttonPanel = new JPanel();
        this.previousButton = new JButton("Előző");
        this.nextButton = new JButton("Következő");
        this.namePanel = new InputPanel("Név");
        this.cityPanel = new InputPanel("Település");
        this.addressPanel = new InputPanel("Cím");
        this.birthPanel = new InputPanel("Születés");
        this.salaryPanel = new InputPanel("Fizetés");

    }
    private void setComponent(){
        this.buttonPanel.add(this.previousButton);
        this.buttonPanel.add(this.nextButton);

    }
    private void setFrame(){
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.PAGE_AXIS));
        this.add(this.buttonPanel);
        this.add(this.namePanel);
        this.add(this.cityPanel);
        this.add(this.addressPanel);
        this.add(this.birthPanel);
        this.add(this.salaryPanel);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        //this.pack();
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

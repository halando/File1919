import java.util.ArrayList;

public class MainController {
    MainFrame mainFrame;
    ArrayList<Employee>emplist;
    public MainController() {
        this.mainFrame =new  MainFrame();
        this.emplist = LoadFile.load();
        this.handleEvent();
        this.loadEmployee(this.emplist.get(0));
      
    }
   private void handleEvent(){
    this.mainFrame
    .getPreviousButton()
    .addActionListener(e -> {
        this.startPrevious();
    });
    this.mainFrame
    .getNextButton()
    .addActionListener(e -> {
        this.startNext();
    });
   }
    private void startPrevious(){
        System.out.println("Vissza...");

    }
    private void startNext(){
        System.out.println("Előre....");

    }
    private void loadEmployee(Employee emp){
        System.out.println(emp.name);
    }

    
}

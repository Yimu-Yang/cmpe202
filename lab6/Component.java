  

public interface Component {

     void printReceipt();
     void printPackingSlip();
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     double getPrice();
     int getPriority();

}
 

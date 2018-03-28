package towerofhanoi;

public class Test {
    
    public static void main(String[] args){
        
        TowerOfHanoi test = new TowerOfHanoi(3);
        System.out.println("Starting board: ");
        
        test.printCurrentState();
        test.solve();
    }
    
}

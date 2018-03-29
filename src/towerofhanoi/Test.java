package towerofhanoi;

public class Test {
    
    public static void main(String[] args){
        
        TowerOfHanoi test = new TowerOfHanoi(2);
        System.out.println("Starting board: ");
        
        test.printCurrentState();
        System.out.println("----------------");
        test.solveBase();
    }
    
}

package towerofhanoi;

public class Test {
    
    public static void main(String[] args){
        
        TowerOfHanoi test = new TowerOfHanoi(2);
        System.out.println("Starting board :");
        test.print();
        
        test.solve(test.getStart(), test.getEnd(),2);
    }
    
}

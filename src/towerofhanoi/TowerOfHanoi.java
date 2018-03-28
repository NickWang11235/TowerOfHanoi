package towerofhanoi;

import java.util.ArrayList;

/**
 * This program is to simulate the puzzle the Tower of Hanoi
 * @author cccc1
 */
public class TowerOfHanoi {

    private ArrayList<Integer> start, mid, end;
    
    public TowerOfHanoi(int n){
        
        start = new ArrayList();
        mid = new ArrayList();
        end = new ArrayList();
        
        for(int i = 1; i <= n; i++){
            start.add(i);
        }
        
    }
    
    /**
     * Move the top element to the designated list.
     * @param from target ArrayList
     * @param to designated ArrayList
     */
    private void move(ArrayList from, ArrayList to){
        
        to.add(from.get(from.size()-1));
        from.remove(from.size()-1);

    }
    
    
    /**
     * To solve the simplest case of 2 pieces.
     */
    public void solveBaseCase(){
        
        moveTo(start, mid);
        print();
        moveTo(start, end);
        print();
        moveTo(mid, end);
        print();
        
    }
    
    /**
     * To recursively solve the puzzle
     */
    public void solve(){
        
        
        
    }
    
    /**
     * To print out the current state of the puzzle.
     */
    public void print(){
        
        System.out.println("start :" + start);
        System.out.println("Mid :" + mid);
        System.out.printf("End :" + end +"\n\n");
        
    }
    
}

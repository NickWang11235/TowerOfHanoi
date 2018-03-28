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
     * Moves the top disk from the initial disk to the next
     * @param from the stick we move the disk from
     * @param to the stick we move the disk to
     */
    private void move(ArrayList from, ArrayList to)
    {
        to.add(0, from.get(0));
        from.remove(0);
    }
    
    
    /**
     * To solve the simplest case of 2 pieces.
     */
    public void solveBaseCase(){
        
        move(start, mid);
        print();
        System.out.println("----------------");
        move(start, end);
        print();
        System.out.println("----------------");
        move(mid, end);
        print();
        System.out.println("----------------");
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

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
     * To recursively solve the puzzle
     */
    public void solve(){
        
    }
    
    /**
     * To print out the current state of the puzzle.
     */
    public void printCurrentState(){
        
        System.out.println(start);
        System.out.println(mid);
        System.out.println(end);
        
    }
    
}

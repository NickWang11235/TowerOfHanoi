package towerofhanoi;

import java.util.ArrayList;

/**
 * This program is to simulate the puzzle the Tower of Hanoi
 * @author cccc1
 */
public class TowerOfHanoi {

    private ArrayList<Integer> start, startClone, mid, end;
    
    /**
     * Constructor TowerOfHanoi
     * @param n the number of disks on the starting peg
     */
    public TowerOfHanoi(int n){
        
        start = new ArrayList <Integer>();
        mid = new ArrayList<Integer>();
        end = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++){
            start.add(i);
            startClone.add(i);
        }
    }

    
    
    /**
     * To recursively solve the puzzle
     */
    public void solve(){
        if(!solved()){
            printCurrentState();
            //implement
        }
        else{
            //terminating case
            System.out.println("Completed");
        }
    }
    
    
    /**
     * To print out the current state of the puzzle.
     */
    public void printCurrentState(){
        //pretty print this later
        System.out.println(start);
        System.out.println(mid);
        System.out.println(end);
    }
    
    
    /**
     * Checks if the puzzle is in the solved state (end peg is in the right order)
     * @return true if the puzzle is solved.  False otherwise
     */
    public boolean solved(){
        for(int i = 0; i < end.size(); i++)
        {
            if(startClone.get(i) != end.get(i))
            {
                return false;
            }
        }
        return true;
    }
    
}

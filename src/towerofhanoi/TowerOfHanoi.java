package towerofhanoi;

import java.util.ArrayList;

/**
 * This program is to simulate the puzzle the Tower of Hanoi
 * @author cccc1
 */
public class TowerOfHanoi {

    private ArrayList<Integer> start; 
    private ArrayList<Integer> startClone;
    private ArrayList<Integer> mid;
    private ArrayList<Integer> end;
    
    /**
     * Constructor TowerOfHanoi
     * @param n the number of disks on the starting peg
     */
    public TowerOfHanoi(int n){
        
        start = new ArrayList<Integer>();
        mid = new ArrayList<Integer>();
        end = new ArrayList<Integer>();
        startClone = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++){
            start.add(i);
            startClone.add(i);
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
     * prints out the current state of the puzzle.
     */
    public void printCurrentState(){
        //pretty print this later
        System.out.println(start);
        System.out.println(mid);
        System.out.println(end);
    }
    
    /**
     * Overloads the printCurrentState() method so it makes it easier on the fingers
     */
    public void print(){
        printCurrentState();
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

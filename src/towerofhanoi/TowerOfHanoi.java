package towerofhanoi;

import java.util.ArrayList;

/**
 * This program is to simulate the puzzle the Tower of Hanoi
 * @author cccc1
 * @author derickboss1
 */
public class TowerOfHanoi {

    private ArrayList<Integer> start; 
    private ArrayList<Integer> startClone;
    private ArrayList<Integer> mid;
    private ArrayList<Integer> end;
    private int numberOfDisks;
    
    /**
     * Constructor TowerOfHanoi
     * @param n the number of disks on the starting peg
     * A larger number represents a larger disk size
     */
    public TowerOfHanoi(int n){
        
        start = new ArrayList<Integer>();
        mid = new ArrayList<Integer>();
        end = new ArrayList<Integer>();
        startClone = new ArrayList<Integer>();
        numberOfDisks = n;
        
        for(int i = n; i >= 1; i--){
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
        to.add(from.get(from.size()-1));
        from.remove(from.size()-1);
    }
    
    
    /**
     * To solve the simplest case of 2 pieces.
     * for debugging and experimenting purposes
     */
    public void solveBaseCase2(){
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
     * This is the algorithm to solve the Tower Of Hanoi Puzzle
     * Put here to make code more readable
     */
    public void solveBase(){
        
    }

    
    /**
     * To recursively solve the puzzle
     */
    public void solve() {
        
        if(!solved()) {            
            print();
            solveBase();
            solve();
        }
        else{
            //terminating case
            System.out.println("\n*****Completed*****\n");
        }
    }
    
    
    /**
     * prints out the current state of the puzzle.
     * To print out the current state of the puzzle.
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
        if(startClone.size() != end.size()){
            return false;
        }
        else{
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
    
}

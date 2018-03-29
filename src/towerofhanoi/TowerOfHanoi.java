package towerofhanoi;

import java.util.ArrayList;

/**
 * This program is to simulate the puzzle the Tower of Hanoi
 * @author cccc1
 * @author derickboss1
 */
public class TowerOfHanoi {

    private ArrayList<Integer> src; 
    private ArrayList<Integer> startClone;
    private ArrayList<Integer> aux;
    private ArrayList<Integer> dest;
    private int numberOfDisks;
    
    /**
     * Constructor TowerOfHanoi
     * @param n the number of disks on the starting peg
     * A larger number represents a larger disk size
     */
    public TowerOfHanoi(int n){
        
        src = new ArrayList<Integer>();
        aux = new ArrayList<Integer>();
        dest = new ArrayList<Integer>();
        startClone = new ArrayList<Integer>();
        numberOfDisks = n;
        
        for(int i = n; i >= 1; i--){
            src.add(i);
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
        if(from.size() > 0)
        {
            to.add(from.get(from.size()-1));
            from.remove(from.size()-1);
        }
        else{
            //for debugging purposes
            System.out.println("Bad call");
        }
    }
    
    
    /**
     * To solve the simplest case of 2 pieces.
     * for debugging and experimenting purposes
     */
    public void solveBaseCase2(){
        move(src, aux);
        print();
        move(src, dest);
        print();
        move(aux, dest);
        print();
    }
    
    
    /**
     * Algorithm for TowerOfHanoi
     * @param n number of disks to solve
     * @param nsrc new source
     * @param naux new auxiliary
     * @param ndest new destination
     */
    private void solve(int n, ArrayList<Integer> nsrc, ArrayList<Integer> naux, ArrayList<Integer> ndest) {
        nsrc = src;
        naux = aux;
        ndest = dest;
        
        move(nsrc,naux);
        if(!validPosition()){
            System.out.println("invalid position");
        }
        print();

        move(nsrc,ndest);
        if(!validPosition()){
            System.out.println("invalid position");
        }
        print();
        
        move(naux,ndest);
        if(!validPosition()){
            System.out.println("invalid position");
        }
        print();
        
        if(n == 1){
            move(nsrc,ndest);
        }
        else{
            solve(n-1,naux,ndest,nsrc);
        }
    }
    
    
    
    /**
     * Overloads solve
     */
    public void solve() {
        solve(numberOfDisks,src,aux,dest);
    }
    
    
    /**
     * prints out the current state of the puzzle.
     * To print out the current state of the puzzle.
     */
    public void printCurrentState(){
        //pretty print this later
        System.out.println(src);
        System.out.println(aux);
        System.out.println(dest);
    }
    

    /**
     * Overloads the printCurrentState() method so it makes it easier on the fingers
     */
    public void print(){
        printCurrentState();
        System.out.println("---------------------");
    }
    
    
    /**
     * gets the number of disks
     * @return number of disks
     */
    public int getNumberOfDisks(){
        return numberOfDisks;
    }
    
    
    /**
     * Checks if the puzzle is in the solved state (destination peg is in the right order)
     * @return true if the puzzle is solved.  False otherwise
     */
    public boolean solved(){
        if(startClone.size() != dest.size()){
            return false;
        }
        else{
            for(int i = 0; i < dest.size(); i++)
            {
                if(startClone.get(i) != dest.get(i))
                {
                    return false;
                }
            }
            return true;
        }
    }
    
    
    /**
     * Checks if there are any bigger disks on top of smaller ones
     * This may help with debugging
     * @return the validity of the position
     */
    public boolean validPosition(){
        for(int i = 0; i < src.size() - 1; i++){
            if(src.get(i) < src.get(i+1)){
                return false;
            }
        }
        for(int i = 0; i < aux.size() - 1; i++){
            if(aux.get(i) < aux.get(i+1)){
                return false;
            }
        }
        for(int i = 0; i < dest.size() - 1; i++){
            if(dest.get(i) < dest.get(i+1)){
                return false;
            }
        }
        return true;
    }
    
}

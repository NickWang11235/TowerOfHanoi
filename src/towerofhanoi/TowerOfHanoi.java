package towerofhanoi;

import java.util.ArrayList;

/**
 * This program is to simulate the puzzle the Tower of Hanoi
 * @author cccc1
 */
public class TowerOfHanoi {

    private ArrayList<Integer> start, mid, end;
    private ArrayList<ArrayList<Integer>> allLists= new ArrayList<ArrayList<Integer>>();
    public static int step;
    private static final int NUMBER_OF_STACKS = 3;
    
    /**
     * Initialize class fields.
     */
    {
        start = new ArrayList();
        mid = new ArrayList();
        end = new ArrayList();
        
        allLists.add(start);
        allLists.add(mid);
        allLists.add(end);
        
        step = 0;
    }
    
    /**
     * Fill in the starting ArrayList with values
     * @param n number of discs
     */
    
    public TowerOfHanoi(int n){
           
        for(int i = n; i > 0; i--){
            start.add(i);   
        }
        
    }
    
    /**
     * Returns the starting ArrayList
     * @return start
     */
    
    public ArrayList<Integer> getStart(){
        
        return start;
    
    }
    
    
    /**
     * Returns the target ArrayList
     * @return end
     */
    
    public ArrayList<Integer> getEnd(){
        
        return end;
        
    }
    
    /**
     * Move the top element to the designated list and removes the moved value
     * @param from target ArrayList
     * @param to designated ArrayList
     */


    public static void moveTo(ArrayList from, ArrayList to){
        
        to.add(from.get(from.size()-1));
        from.remove(from.size()-1);
        
        step++;
        
    }

    private void move(ArrayList from, ArrayList to)
    {
        to.add(0, from.get(0));
        from.remove(0);
    }
    
    /**
     * Solves the puzzle recursively
     * @param from starting ArrayList
     * @param to target ArrayList
     * @param n number of elements
     */
    
    public void solve(ArrayList<Integer> from, ArrayList<Integer> to, int n){
      
        if(n == 2){
            moveTo(from, getNot(from, to));
            print();
            moveTo(from, to);
            print();
            moveTo(getNot(from, to), to);
            print();
        }
        else{
            solve(from, getNot(from, to), n-1);
            moveTo(from, to);
            print();
            solve(getNot(from, to), to, n-1);
        }
    }
    
    /**
     * Returns the ArrayList that is not specified in the parameter
     * @param list1 the first list that it is not
     * @param list2 the second list that it is not
     * @return the list that is not list1 or list2
     */
    public ArrayList<Integer> getNot(ArrayList<Integer> list1, ArrayList<Integer> list2){
        
        for(int i = 0 ; i < NUMBER_OF_STACKS; i++)
            if(allLists.get(i) != list1 && allLists.get(i) != list2)
                return allLists.get(i);
        return null;
    }
    
    /**
     * To print out the current state of the puzzle.
     */

    public void print(){
        
        System.out.println("Step : " + step);
        
        System.out.println("start :" + start);
        System.out.println("Mid :" + mid);
        System.out.printf("End :" + end +"\n\n");
        
    }
    
}

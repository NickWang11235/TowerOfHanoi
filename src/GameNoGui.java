/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derickboss1
 */

import java.util.Scanner;

public class GameNoGui {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number Of Disks: ");
        TowerOfHanoi t = new TowerOfHanoi(in.nextInt());        
        t.printPuzzle();
        
        while(!t.isSolved()){
            
            System.out.print("From: ");
            int from = in.nextInt();
            System.out.print("To  : ");
            int to = in.nextInt();
            System.out.println();
            
            if(from == 0 && to == 0){
                t.solve();
            }
            else if(from <= 0 || to <= 0 || from > t.getAllLists().size() || to > t.getAllLists().size()){
                System.out.println("Error. Not a valid stick number!");
            }
            else{
                t.moveTo(t.getAllLists().get(from - 1), t.getAllLists().get(to - 1));
                t.printPuzzle();
            }
        }
        
        System.out.println("\nGOOD JOB.  Took you " + t.steps + " steps! \n\n");
    }
}

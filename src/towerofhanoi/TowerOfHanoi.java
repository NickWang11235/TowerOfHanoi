/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

/**
 *
 * @author 321895
 */
public class TowerOfHanoi {
	
	private ArrayList<Integer> start, startCopy, mid, end;
	
	/**
	 * Constructor TowerOfHanoi
	 */
	public TowerOfHanoi(int n) {
		
		mid = new ArrayList<Integer>();
		end = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			start.add(i);
			startCopy.add(i);
		}
			
	}
}

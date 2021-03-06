package linkedLists;

import java.util.HashMap;

public class ListPractice {
	ListPractice next =  null;
	int data;
	
	public ListPractice(int data){
		this.data = data;
		this.next = null;
	}
	public ListPractice(int[] arr){
		this.data = arr[0];
		for(int i=1; i<arr.length; i++){
			this.appendToTail(arr[i]);
		}
	}
	
	public void appendToTail(int data){
		ListPractice n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = new ListPractice(data);
	}
	
	/**
	 * removes any duplicate data in the linked list,
	 * by iterating through the list and storing each value in a hash,
	 * if the next node is a duplicate then it removes it.
	 */
	public void removeDuplicates(){
		ListPractice n = this;
		
		HashMap<Integer, Boolean> lookUp = new HashMap<Integer, Boolean>();
		lookUp.put(n.data, true);
		while(n.next != null){
			if( !lookUp.containsKey(n.next.data) ){
				lookUp.put(n.next.data, true);
				n = n.next;
			}
			else{
				n.next = n.next.next;
			}
		}
	}
	
	/**
	 * removes the duplicate data in the linked list,
	 * without using any new data structures.
	 */
	public void removeDuplicatesLessMem(){
		ListPractice cur = this;
		ListPractice runner;
		while(cur != null){
			runner = cur;
			while(runner.next != null){
				if(cur.data == runner.next.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			cur = cur.next;
		}
	}
	/**
	 * checks to see if two linked lists are equal, same data in the same order
	 * @param other
	 * @return
	 */
	public boolean isEqual(ListPractice other){
		ListPractice n = this;
		while(n != null && other != null){
			if(n.data != other.data){
				return false;
			}
			n = n.next;
			other = other.next;
		}
		if(n != null || other != null){
			return false;
		}
		return true;
	}
	
	public void printList(){
		ListPractice n = this;
		while(n.next !=null){
			System.out.print(n.data);
			n=n.next;
		}
		System.out.print(n.data);
		System.out.println("");
	}
}

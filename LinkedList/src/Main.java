/*Sedak Puri
 * Introduction to CS 3
 * Lab01
 */
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		Random rng = new Random();
		
		for (int i = 0; i < rng.nextInt(20) + 10; i++) {
			list.insertAtHead(rng.nextInt(100) + 1);
		}

		//Testing the maximum and minimum
		System.out.println("**************List #1**************");
		System.out.println(list);
		System.out.println("The maximum of this list is: " + list.max());
		System.out.println("The minimum of this list is: " + list.min() + "\n");
		
		//Testing the removeLast method
		System.out.println("The value removed was: " + list.removeLast());
		System.out.println(list + "\n");
		
		
		//Re-testing with a list of only one value
		System.out.println("**************List #2**************");
		SinglyLinkedList list2 = new SinglyLinkedList();
		list2.insertAtHead(rng.nextInt(100) + 1);
		
		System.out.println(list2);
		System.out.println("The maximum of this list is: " + list2.max());
		System.out.println("The minimum of this list is: " + list2.min() + "\n");
		
		System.out.println("The value removed was: " + list2.removeLast());
		System.out.println(list2);
	}

}

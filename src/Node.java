/**
 * User: haozhou
 * Date: 8/11/12
 * Time: 5:38 PM
 */
public class Node {
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }

    public String toString(){
       return String.valueOf(this.value);
    }
}

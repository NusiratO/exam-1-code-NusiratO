
public class Node {
    private String item;
    private Node next;

    public Node(String item){
        this(item, null);
    }

    public Node(String item, Node next){
        this.item = item;
        this.next = next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public String getItem(){
        return item;
    }

    public Node getNext(){
        return next;
    }

    //you should be able to completely ignore this, you don't need to understand it
    //it is just used for testing
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }
        else if (getClass() != o.getClass()){
            return false;
        }
        else {
            Node other = (Node) o;
            if (this.item.equals(other.item)){
                if (this.next == null){
                    return other.next == null;
                }
                else {
                  return this.next.equals(other.next);
                }
            }
            else {
                return false;
            }
        }
    }

    public String toString(){
        if (next == null){
            return item;
        }
        else {
            return item + ", " + next.toString();
        }
    }

}

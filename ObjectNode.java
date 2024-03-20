public class ObjectNode {
    private Object ob;
    private  ObjectNode next;

    public ObjectNode(Object ob){
        this.ob = ob;
        this.next = null;
    }

    public Object getOb() {
        return ob;
    }

    public ObjectNode getNext() {
        return next;
    }

    public void setNext(ObjectNode next) {
        this.next = next;
    }
}

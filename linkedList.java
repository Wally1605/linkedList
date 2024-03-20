public class linkedList {
    private ObjectNode head;
    private ObjectNode tail;

    public linkedList(){
        head = null;
        tail = null;
    }

    public void insertNode(Object ob){
        ObjectNode node = new ObjectNode(ob);
        if(head == null){
            head = node;
        }
        else {
            tail.setNext(node);
        }
        tail = node;
    }

    public ObjectNode searchNode(String name){
        ObjectNode current = head;
        if(!current.getOb().getName().equals(name)){
            while(current.getNext() != null){
                String sname = current.getNext().getOb().getName();
                if(sname.equals(name)){
                    return current.getNext();
                }
                else
                    current = current.getNext();
            }
        }
        return current;
    }

    public void deleteNode(String name){
        ObjectNode current = head;
        if(!current.getOb().getName().equals(name)){
            while(current.getNext() != null){
                String sname = current.getNext().getOb().getName();
                if(sname.equals(name)){
                    current.setNext(current.getNext().getNext());
                    break;
                }
                else
                    current = current.getNext();
            }
        }
    }


    public void printList(){
        ObjectNode current = head;
        System.out.println("========Print Start=============");
        System.out.println(current.getOb().getName());
        while(current.getNext() != null){
            System.out.println(current.getNext().getOb().getName());
            current = current.getNext();
        }
        System.out.println("========Print End=============");
    }

    public linkedList copy(){
        linkedList copy = new linkedList();
        ObjectNode current = head;
        copy.insertNode(current.getOb());
        while(current.getNext() != null){
           copy.insertNode(current.getNext().getOb());
           current = current.getNext();
        }
        return copy;
    }

    public void removeDupe(ObjectNode node ,String key){
        System.out.println("Removed All instances of "+node.getOb().toString()+ "\n");
        ObjectNode current = head;
            while (current.getNext() != null) {
                if (key.equals(current.getOb().getName())){
                    deleteNode(key);
                }
                current = current.getNext();
            }

        }


    public void removeAfter(ObjectNode node){

        if(node.getNext() != null) {
            deleteNode(node.getNext().getOb().getName());
        }else{
            System.out.println("Instance after is null or node not in linkedList.");
        }
    }
    public int max(ObjectNode node){
        int max = 0;
        ObjectNode current = head;
        if(current == null){
            return max;
        }
        while (current.getNext() != null) {
            if (current.getOb().getHours() > (current.getNext().getOb().getHours())){
                max = current.getOb().getHours();
            }
            current = current.getNext();
        }
        if(node.getOb().getHours() > max){
            return node.getOb().getHours();
        }else {
            return max;
        }
    }
    }

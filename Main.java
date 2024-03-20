//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object Vanessa = new Object("Vanessa", 19, "Team leader", 40);
        Object Jacob = new Object("Jacob", 20, "Sales Associate", 28);
        Object Walter = new Object("Walter", 17, "Maintenance", 36);
        Object Ashley = new Object("Ashley", 18, "Loss Protection", 50);
        Object Tom = new Object("Tom", 18, "Customer Service Specialist", 12);

        linkedList list = new linkedList();
        linkedList list2 = new linkedList();
        
        list.insertNode(Vanessa);
        list.insertNode(Jacob);
        list.insertNode(Walter);
        list.insertNode(Ashley);
        list.insertNode(Tom);

        list.printList();

        list.removeAfter(list.searchNode("Vanessa"));
        list.printList();

        linkedList copy = list.copy();

        copy.printList();

        list.removeDupe(list.searchNode("Jacob"),"Jacob");
        list.printList();


        System.out.println("Max in list is "+ list.max(list.searchNode("Vanessa")));
        System.out.println("Max in list is "+ list2.max(list.searchNode(""))); //Empty linkedList

    }
}

import java.lang.*;

public class StackManager {

    Node head;
    Node tail;


    public void push(String name){//insert head

        Node node = new Node(name);
        if (head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        System.out.println("Push: " + "'"+ head.name + "'");

    }


    public String pop(){
        String pop = "";
        if (head == null) {
            System.out.println("Empty List");
        }
        else {
            pop = head.name;//print value at head
            head = head.next; //remove the head
        }
        System.out.println("Pop: " + "'"+ pop + "'");
        return pop;


    }




    public void display(){
        Node temp = head;
        System.out.println("--------Stack List---------");
        while(temp != null){

            System.out.print("'"+ temp.name + "'" +  " " );
            temp = temp.next;
        }
        System.out.println();


    }

    public static void main(String[] args) {


        StackManager stack = new StackManager();

        stack.push("to");
        stack.push("be");
        stack.push("or");
        stack.push("not");
        stack.push("to");
        stack.display();

        stack.pop();
        stack.display();

        stack.push("be");
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        stack.push("that");
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        stack.push("is");
        stack.display();


    }









}
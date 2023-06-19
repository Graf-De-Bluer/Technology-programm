// A Linked List Node
import java.util.Scanner;
class Node
{
    String data;
    Node next;

    Node(String data)
    {
        this.data = data;
        this.next = null;
    }
}

class Main
{

    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + ",  ");
            ptr = ptr.next;
        }
        System.out.println("Конец списка.");
    }

    // Naive function for linked list implementation containing three nodes
    public static Node constructList()
    {
        System.out.println("Список студентов группы И-175");
        Node first = new Node("Колотев Илья Сергеевич +7(960)-345-32-12");
        Node second = new Node("Слепокуров Виктор Викторович +7(999)-987-09-90");
        Node third = new Node("Кровяков Виктор Викторович +7(987)-898-09-90");
        Node fourth = new Node("Нетесова Яна Игоревна +7(980)-476-98-67");

        // rearrange the references to construct a list
        Node head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        // return reference to the first node in the list
        return head;
    }

    public static void main(String[] args)
    {
        // `head` points to the head node of the linked list
        Node head = constructList();

        // print linked list
        printList(head);
    }
}
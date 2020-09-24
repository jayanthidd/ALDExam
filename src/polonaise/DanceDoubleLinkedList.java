package polonaise;

public class DanceDoubleLinkedList
{
    private Node first;
    private Node last;

    public Node getFirst()
    {
        return first;
    }

    public Node getLast()
    {
        return last;
    }

    // Methode, um eine(n) neue(n) TaenzerIn an erster/vorderster Position
    // der Polonaise einzufügen
    public void insertDancerAtFirstPos(String name)
    {
        // TODO: Implementieren
        Node dancer = new Node(name);
        if (first == null) {
            first = dancer;
            last = dancer;
        }

        dancer.setNext(first);
        first.setPrev(dancer);

        first = dancer;
    }
}

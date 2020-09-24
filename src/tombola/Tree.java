package tombola;

public class Tree
{
    private Node root;

    public Node getRoot()
    {
        return root;
    }

    public void buildExampleTree()
    {
        root = new Node(new Prize(53, "Taucherbrille"));

        Node r = new Node(new Prize(78, "Niete"));
        root.setRight(r);

        Node l = new Node(new Prize(45, "USB-Stick"));
        root.setLeft(l);

        Node ll = new Node(new Prize(40, "Tasse"));
        l.setLeft(ll);

        Node lr = new Node(new Prize(49, "Spritzpistole"));
        l.setRight(lr);

        Node rr = new Node(new Prize(90, "Pflanze"));
        r.setRight(rr);

        Node lll = new Node(new Prize(11, "Gummibaeren"));
        ll.setLeft(lll);

        Node rrl = new Node(new Prize(87, "Niete"));
        rr.setLeft(rrl);

        Node rl = new Node(new Prize(77, "Hut"));
        r.setLeft(rl);
    }

    public Prize searchForNumber(int number)
    {
        // TODO: Implementieren (mit Schleife oder Rekursion)
        if (root==null){
            return null;
        } else if (root.getPrize().getNumber()==number){
            return root.getPrize();
        } else {
            return searchForNumber(number, root);
        }
    }

    private Prize searchForNumber(int number, Node root) {
        if (number < root.getPrize().getNumber()){
            if (root.getLeft()==null){
                return null;
            } else if (root.getLeft().getPrize().getNumber()==number) {
                return root.getLeft().getPrize();
            } else {
                return searchForNumber(number, root.getLeft());
            }
        } else {
            if (root.getRight()==null){
                return null;
            } else if (root.getRight().getPrize().getNumber()==number){
                return root.getRight().getPrize();
            } else {
                return searchForNumber(number, root.getRight());
            }
        }
    }
}

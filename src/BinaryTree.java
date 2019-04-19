public class BinaryTree {

    Node root;

    public class Node{

        Node leftChild;
        Node rightChild;

        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private void addNode(int key, String value) {


        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
        }
        while (true) {
            Node focusNode = root;

            Node parent = focusNode;

            if (newNode.key < parent.key)
            {
                parent.leftChild = newNode;
//                if (focusNode==null){
//                    parent.leftChild=newNode;
//                }
            }
            else{

                focusNode.rightChild = newNode;

//                if (focusNode==null){
//                    parent.rightChild=newNode;
//                }
            }
            return;
        }

    }

    public static void main(String[] args) {

        BinaryTree binaryTree= new BinaryTree();
        binaryTree.addNode(50,"ayush");
        binaryTree.addNode(30,"why");
        binaryTree.addNode(70,"great");
        binaryTree.addNode(20,"wow");
    }
}

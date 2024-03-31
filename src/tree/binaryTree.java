package tree;

class BinaryTreeNode {
    int data;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" + "data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + '}';
    }
}

class BinaryTree {
    BinaryTreeNode rootNode;

    public void insertNode(int data) {
        BinaryTreeNode node = new BinaryTreeNode(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            BinaryTreeNode currentNode = rootNode;
            BinaryTreeNode parentNode;


            while (true) {
                parentNode = currentNode;
                if (data < currentNode.data) {
                    //left
                    currentNode = currentNode.leftNode;
                    if (currentNode == null) {
                        parentNode.leftNode = node;
                        return;
                    }
                } else {
                    //right
                    currentNode = currentNode.rightNode;
                    if (currentNode == null) {
                        parentNode.rightNode = node;
                        return;
                    }
                }
            }
        }
    }

    public BinaryTreeNode find(int key) {
        BinaryTreeNode currentNode = rootNode;
        while (currentNode.data != key) {
            if (key < currentNode.data) currentNode = currentNode.leftNode;

            else currentNode = currentNode.rightNode;
            if (currentNode == null) return new BinaryTreeNode(Integer.MIN_VALUE);


        }

        return currentNode;
    }


}

class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(53);
        binaryTree.insertNode(30);
        binaryTree.insertNode(72);
        binaryTree.insertNode(14);
        binaryTree.insertNode(39);
        binaryTree.insertNode(61);
        binaryTree.insertNode(84);
        binaryTree.insertNode(9);
        binaryTree.insertNode(23);
        binaryTree.insertNode(34);
        binaryTree.insertNode(47);
        binaryTree.insertNode(79);
        System.out.println(binaryTree.find(7));


    }
}
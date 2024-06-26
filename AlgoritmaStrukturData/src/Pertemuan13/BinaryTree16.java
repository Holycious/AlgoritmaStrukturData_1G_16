package Pertemuan13;

public class BinaryTree16 {
    Node16 root;
    int size;

    boolean isEmpty(){
        return root==null;
    }

    void add(int data){
        if (isEmpty()) {
            root = new Node16(data);
        }else{
            Node16 current = root;
            while (true) {
                if (data<current.data) {
                    if (current.left!=null) {
                        current = current.left;
                    }else{
                        current.left = new Node16(data);
                        break;
                    }
                }else if (data>current.data) {
                    if (current.right!=null) {
                        current = current.right;
                    }else{
                        current.right = new Node16(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node16 current = root;
        while (current!=null) {
            if (current.data==data) {
                result=true;
                break;
            }else if (data < current.data) {
                current = current.left;
            }else {
                current = current.right;
            }
        } return result;
    }

    void traversePreOrder(Node16 node){
        if (node!=null) {
            System.out.print(" "+ node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node16 node){
        if (node!=null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+ node.data);
        }
    }
    
    void traverseInOrder(Node16 node){
        if (node!=null) {
            traverseInOrder(node.left);
            System.out.print(" "+ node.data);
            traverseInOrder(node.right);
        }
    }

    Node16 getSuccessor(Node16 del){
        Node16 successor = del.right;
        Node16 successorParent = del;
        while (successor.left!=null) {
            successorParent=successor;
            successor=successor.left;
        }
        if (successor!=del.right) {
            successorParent = successor.right;
            successor.right =del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        
        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
    
        while (current.data != data) {
            parent = current;
            if (data < current.data) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Node not found");
                return;
            }
        }
        
        
if (current.left == null && current.right == null) {
    if (current == root) {
        root = null;
    }
    if (isLeftChild) {
        parent.left = null;
    } else {
        parent.right = null;
    }
}

else if (current.left == null) {
    if (current == root) {
        root = current.right;
    } else if (isLeftChild) {
        parent.left = current.right;
    } else {
        parent.right = current.right;
    }
} else if (current.right == null) {
    if (current == root) {
        root = current.left;
    } else if (isLeftChild) {
        parent.left = current.left;
    } else {
        parent.right = current.left;
    }
}


else if (current.left != null && current.right != null) {
    Node16 successor = getSuccessor(current);
    if (current == root) {
        root = successor;
    } else if (isLeftChild) {
        parent.left = successor;
    } else {
        parent.right = successor;
    }
    successor.left = current.left;
}

       
    }
    
}

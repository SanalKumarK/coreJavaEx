package corejava.ex;

/**
 * Created by kurunsk on 25-02-2016.
 *
 *                0
 *             1     2
 *           3   6   4   5
 */
public class DFS {

    public static void main(String[] args) {
        Node rootNode = new Node(0);

        rootNode.left = new Node(1);
        rootNode.right = new Node(2);
        rootNode.left.left = new Node(3);
        rootNode.left.right = new Node(6);
        rootNode.right.left = new Node(4);
        rootNode.right.right = new Node(5);
        String[] outputs = new String[3];
        for(int i=0;i<outputs.length;i++){
            outputs[i] = "";
        }
        outputs = dfs(rootNode,outputs, 0);
        System.out.println(outputs);
        for(int i=0;i<outputs.length;i++){
            System.out.println(outputs[i]);
        }
    }


    public static String[] dfs(Node node,String[] outputs, int level){
        if(node == null) {
            return outputs;
        } else{
            outputs[level] += String.valueOf(node.i);
            level += 1;
            dfs(node.left, outputs, level);
            dfs(node.right, outputs, level);
            return outputs;
        }
    }
}

interface Nodeee{
    void method22();
}

class Node {

    protected int i;
    protected Node left;
    protected Node right;

    public Node(int i) {
        this.i = i;
    }
}

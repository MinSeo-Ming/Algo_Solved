import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));
        String input;
        while(true){
            input = br.readLine();
            if(input==null||input.equals(""))
                break;
            root.add(new Node(Integer.parseInt(input)));
        }
        post(root);
    }
    static class Node{
        Node right;
        Node left;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public Node(Node right, Node left, int data) {
            this.right = right;
            this.left = left;
            this.data = data;
        }

        void add(Node newNode){
            if(newNode.data<this.data){
                if(this.left==null){
                    this.left = newNode;
                }else {
                    this.left.add(newNode);
                }
            }else {
                if(this.right==null){
                    this.right= newNode;
                }else {
                    this.right.add(newNode);
                }
            }
        }
    }
    static void post(Node node){
        if(node==null)
            return;
        post(node.left);
        post(node.right);
        System.out.println(node.data);
    }
}

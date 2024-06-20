import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static Node tree = new Node("A", null, null);

    public static class Node {
        String word;
        Node left;
        Node right;

        public Node(String word, Node left, Node right) {
            this.word = word;
            this.left = left;
            this.right = right;
        }

        void insert(String word, String leftChild, String rightChild) {
            Node left = null;
            Node right = null;
            if (!leftChild.equals(".")) {
                left = new Node(leftChild, null, null);
            }
            if (!rightChild.equals(".")) {
                right = new Node(rightChild, null, null);
            }

            Node node = tree;
            Node findNode = search(node, word);
            findNode.left = left;
            findNode.right = right;
        }

        Node search(Node node, String word) {   // word값을 가진 부모 노드의 위치를 찾는 과정
            Node findNode;
            if (node == null) {
                return null;
            }
            if (node.word.equals(word)) {
                return node;
            }
            findNode = search(node.left, word);
            if (findNode != null) {
                return findNode;
            }
            findNode = search(node.right, word);
            return findNode;
        }

        void preorder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.word);
            preorder(node.left);
            preorder(node.right);
        }

        void inorder(Node node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.print(node.word);
            inorder(node.right);
        }

        void postorder(Node node) {
            if (node == null) {
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.word);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String parent = st.nextToken();
            String leftChild = st.nextToken();
            String rightChild = st.nextToken();

            tree.insert(parent, leftChild, rightChild);
        }
        tree.preorder(tree);
        System.out.println();
        tree.inorder(tree);
        System.out.println();
        tree.postorder(tree);
        System.out.println();
    }
}

import java.util.*;

class GraphNode {
    String val;
    List<GraphNode> connections;

    public GraphNode(String val) {
        this.val = val;
        this.connections = new ArrayList<>();
    }

    // Connect with other nodes
    public void connectTo(GraphNode node) {
        connections.add(node);
    }

    // BFS implementation
    public void BFS(GraphNode head) {
        if (head == null) return;

        Set<GraphNode> visited = new HashSet<>();
        Queue<GraphNode> queue = new LinkedList<>();

        // Start BFS from the head node
        queue.add(head);
        visited.add(head);

        System.out.println("\nBFS Traversal:");
        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            System.out.print(current.val + " ");

            for (GraphNode neighbor : current.connections) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, GraphNode> graph = new HashMap<>();

        // Input number of nodes
        System.out.print("\nEnter number of nodes: ");
        int nodeNumber = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        // Input node values
        System.out.println("\nEnter Node Values:");
        for (int i = 0; i < nodeNumber; i++) {
            String val = sc.nextLine();
            graph.put(val, new GraphNode(val));
        }

        // Connect nodes
        for (GraphNode node : graph.values()) {
            System.out.print("\nNumber of nodes connected to " + node.val + ": ");
            int connections = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline

            for (int j = 0; j < connections; j++) {
                System.out.print("Enter node connected to " + node.val + ": ");
                String connectedNodeVal = sc.nextLine();
                GraphNode connectedNode = graph.get(connectedNodeVal);

                if (connectedNode != null) {
                    node.connectTo(connectedNode);
                } else {
                    System.out.println("Node " + connectedNodeVal + " does not exist!");
                }
            }
        }

        // Display the graph
        System.out.println("\nGraph Representation:");
        for (GraphNode node : graph.values()) {
            System.out.print(node.val + " -> ");
            for (GraphNode connectedNode : node.connections) {
                System.out.print(connectedNode.val + " ");
            }
            System.out.println();
        }

        // Perform BFS
        System.out.print("\nEnter the starting node for BFS: ");
        String startNode = sc.nextLine();
        GraphNode start = graph.get(startNode);
        if (start != null) {
            start.BFS(start);
        } else {
            System.out.println("Starting node does not exist!");
        }

        sc.close();
    }
}

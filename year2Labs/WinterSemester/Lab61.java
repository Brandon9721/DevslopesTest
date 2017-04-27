import java.util.Scanner;


class Lab61 {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter a vertex source value between 1 and 9");
        int source = userIn.nextInt();
        
        graph.addEdge(1, 5, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 5, 5);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 8, 2);
        graph.addEdge(3, 6, 5);
        graph.addEdge(4, 5, 1);
        graph.addEdge(4, 7, 10);
        graph.addEdge(4, 6, 2);
        graph.addEdge(5, 8, 8);
        graph.addEdge(5, 7, 2);
        graph.addEdge(6, 8, 8);
        graph.addEdge(7, 9, 5);
        graph.addEdge(8, 5, 10);
        graph.addEdge(8, 1, 12);
        graph.addEdge(9, 10, 3);
        graph.addEdge(9, 2, 2);
        graph.addEdge(10, 3, 13);
        graph.addEdge(10, 7, 9);
        graph.shortestPath(source);
    }
}






class Vertex {
    int name;
    int cost;
    Edge EdgeList;
    State state;
    
    Vertex(int name) {
        this.name = name;
        state = State.NEW;
        cost = Integer.MAX_VALUE;
    }
}


class Edge {
    int index;
    int weight;
    Edge next;
    
    public Edge(int index, Edge next, int weight) {
        this.index = index;
        this.next = next;
        this.weight = weight;
    }
}

class MinPriorityQueue {
    Vertex[] queue;
    int size;
    int end = -1;
    int start = -1;
    
    MinPriorityQueue(int size) {
        this.size = size;
        queue = new Vertex[size];
    }
    
    public void add(Vertex Vertex) {
        queue[end+=1] = Vertex;
    }
    
    public Vertex remove() {
        Vertex minValuedVertex = null;
        int minValue = Integer.MAX_VALUE;
        int minValueIndex = -1;
        start++;
        for (int i = start; i <= end; i++) {
            if (queue[i].state == State.IN_Q && queue[i].cost < minValue) {
                minValue = queue[i].cost;
                minValuedVertex = queue[i];
                minValueIndex = i;
            }
        }
        
        swap(start, minValueIndex);
        queue[start] = null;
        return minValuedVertex;
    }
    
    public void swap(int index1, int index2) {
        Vertex temp = queue[index1];
        queue[index1] = queue[index2];
        queue[index2] = temp;
    }
    
    public boolean isEmpty() {
        return start == end;
    }
}



enum State {
NEW, IN_Q, VISITED
};

class Graph {
    
    private Vertex[] vertices;
    private int size;
    private MinPriorityQueue queue;
    
    public Graph(int size) {
        this.size = size;
        vertices = new Vertex[size];
        addVertexs();
        queue = new MinPriorityQueue(size);
    }
    
    
    private void addVertexs() {
        for (int i = 1; i <= size; i++) {
            addVertex(i);
        }
    }
    
    public void addVertex(int name) {
        vertices[name - 1] = new Vertex(name);
    }
    
    public void addEdge(int sourceName, int destiName, int weight) {
        int srcIndex = sourceName - 1;
        int destiIndex = destiName - 1;
        Vertex srcVertex = vertices[srcIndex];
        Vertex destiVertex = vertices[destiIndex];
        srcVertex.EdgeList = new Edge(destiIndex, srcVertex.EdgeList, weight);
//        destiVertex.EdgeList = new Edge(srcIndex, destiVertex.EdgeList, weight);
    }
    
    public void shortestPath(int src) {
        for (int i = 0; i < size; i++) {
            if (vertices[i].name == src) {
                Dijkstra(vertices[i]);
                break;
            }
        }
    }
    
   
    private void Dijkstra(Vertex sourceVertex) {
        queue.add(sourceVertex);
        sourceVertex.state = State.IN_Q;
        sourceVertex.cost = 0;
        
        while (!queue.isEmpty()) {
            Vertex visitedVertex = queue.remove();
            visitedVertex.state = State.VISITED;
            Edge connectedEdge = visitedVertex.EdgeList;
            while (connectedEdge != null) {
                Vertex Edge = vertices[connectedEdge.index];
               
                if (Edge.state == State.NEW) {
                    queue.add(Edge);
                    Edge.state = State.IN_Q;
                }
               
                if (Edge.state != State.VISITED && ((connectedEdge.weight + visitedVertex.cost) < Edge.cost)) {
                    Edge.cost = connectedEdge.weight + visitedVertex.cost;
                }
                connectedEdge = connectedEdge.next;
            }
        }

        for(int i = 0; i < size; i++){
            if(vertices[i].cost != Integer.MAX_VALUE){
                System.out.println("Shortest distance from "+sourceVertex.name +" to "+vertices[i].name+" is " +vertices[i].cost);
            }else{
                System.out.println("Cannot reach " + vertices[i].name +" from "+sourceVertex.name);
            }
        }
    }
    

    
}


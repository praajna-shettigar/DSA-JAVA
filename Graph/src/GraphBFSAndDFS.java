import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSAndDFS {

    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }

        public static void createGraph(ArrayList<Edge> graph[]){
            for (int i=0; i<graph.length;i++){
                graph[i]= new ArrayList<Edge>();
            }

            graph[0].add(new Edge(0,1));
            graph[0].add(new Edge(0,2));

            graph[1].add(new Edge(1,0));
            graph[1].add(new Edge(1,3));


            graph[2].add(new Edge(2,0));
            graph[2].add(new Edge(2,4));

            graph[3].add(new Edge(3,1));
            graph[3].add(new Edge(3,4));
            graph[3].add(new Edge(3,5));

            graph[4].add(new Edge(4,2));
            graph[4].add(new Edge(4,3));
            graph[4].add(new Edge(4,5));

            graph[5].add(new Edge(5,3));
            graph[5].add(new Edge(5,4));
            graph[5].add(new Edge(5,6));

            graph[6].add(new Edge(6,5));

        }

        public static void bfc(ArrayList<Edge> graph[],int v){
            Queue<Integer> q = new LinkedList<>();
            boolean vis[] = new boolean[v];
            q.add(0);
            while (!q.isEmpty()){
                int curr = q.remove();
                if(!vis[curr]){
                    System.out.print(curr+" ");
                    vis[curr] = true;
                    for (int i=0;i<graph[curr].size();i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
        }

        public static void dfs(ArrayList<Edge> grap[],int curr, boolean vis[]){
            System.out.println(curr+ " ");
            vis[curr] = true;

            for(int i=0;i< grap[curr].size();i++){
                Edge e = grap[curr].get(i);
                if(vis[e.dest]==false){
                    dfs(grap, e.dest, vis);
                }

            }
        }

        //All path from source and destination
        public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar){
            if(curr==tar){
                System.out.println(path);
                return;
            }

            for (int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    vis[curr] = true;
                    printAllPath(graph,vis, e.dest, path+e.dest,tar);
                    vis[curr] = false;
                }
            }
        }

        //detect whether cycle is existing or not
        public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
            vis[curr] = true;
            rec[curr] = true;

            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(rec[e.dest]==true){
                    return true;

                }else if(!vis[e.dest]){
                    return isCycleDirected(graph,vis, e.dest, rec);
                }
            }
            rec[curr] = false;
            return false;
        }


        public static void main(String[] args) {
            int v = 7;
            boolean[] vis = new boolean[7];
            ArrayList<Edge> graph[] = new ArrayList[v];

            //create a graph
            createGraph(graph);


//            bfc(graph,v);
//            dfs(graph,0,vis);

            //print all path
            int src=0;
            int tar = 5;
            printAllPath(graph,vis,src,"0",tar);




        }
    }
}

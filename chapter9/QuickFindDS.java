package chapter9;

public class QuickFindDS  implements DisjointSets{
    private int[] id;
    public QuickFindDS(int N)
    {
        id = new int[N];
        for(int i =0;i<N;i++){
            id[i] = i;
        }
    }
    private int find(int p) {
        while (parent[p] >= 0) {
            p = parent[p];
        }
        return p;
    }
    @Override
    public void connect(int p, int q) {
        // TODO Auto-generated method stub
       int pid = id[p];
       int qid = id[q];
       for (int i = 0; i < id.length; i++) {
           if(id[i]==pid)
           id[i] = qid;
       }
    }

    @Override
    public boolean isConnected(int p, int q) {
        // TODO Auto-generated method stub
        return id[p]==id[q];
    }
    
}
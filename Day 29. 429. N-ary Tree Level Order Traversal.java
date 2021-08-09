class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                Node current = queue.poll();
                list.add(current.val);
                for(Node node : current.children){
                    queue.offer(node);
                }
            }
            result.add(list);
        }
        return result;
    }
}
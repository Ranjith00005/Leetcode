class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);

        PriorityQueue<Integer> q= new PriorityQueue<>((a,b)-> b-a);
        int total=0;
        for(int[] c:courses){
            int dur=c[0];
            int end=c[1];
            if(total+dur<=end){
                total+=dur;
                q.add(c[0]);
            }
            else{
                if(q.size()>0 && q.peek()>dur){
                    total-=q.poll();
                    total+=dur;
                    q.add(dur);

                }
            }

        }
        return q.size();
    }
}